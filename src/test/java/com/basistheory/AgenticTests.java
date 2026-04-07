package com.basistheory;

import static org.junit.jupiter.api.Assertions.*;

import com.basistheory.errors.NotFoundError;
import com.basistheory.resources.agentic.agents.instructions.credentials.requests.GetCredentialsRequest;
import com.basistheory.resources.agentic.agents.instructions.requests.CreateInstructionRequest;
import com.basistheory.resources.agentic.agents.instructions.requests.InstructionsListRequest;
import com.basistheory.resources.agentic.agents.instructions.requests.UpdateInstructionRequest;
import com.basistheory.resources.agentic.agents.requests.CreateAgentRequest;
import com.basistheory.resources.agentic.agents.requests.UpdateAgentRequest;
import com.basistheory.core.pagination.SyncPagingIterable;
import com.basistheory.resources.agentic.enrollments.requests.CreateEnrollmentRequest;
import com.basistheory.resources.agentic.enrollments.verify.requests.SelectMethodRequest;
import com.basistheory.resources.agentic.enrollments.verify.requests.SubmitOtpRequest;
import com.basistheory.types.*;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Tag("agentic")
public class AgenticTests {

    private BasisTheoryApiClient getClient() {
        String apiUrl = System.getenv("BT_API_URL");
        BasisTheoryApiClientBuilder builder = BasisTheoryApiClient.builder()
                .apiKey(System.getenv("BT_PVT_TEST_API_KEY"));
        if (apiUrl != null && !apiUrl.isEmpty()) {
            builder.url(apiUrl);
        }
        return builder.build();
    }

    private String createCardToken(BasisTheoryApiClient client, String cardNumber) {
        Map<String, Object> data = new HashMap<>();
        data.put("number", cardNumber);
        data.put("expiration_month", 12);
        data.put("expiration_year", 2030);
        data.put("cvc", 123);

        Token token = client.tokens().create(CreateTokenRequest.builder()
                .type("card")
                .data(data)
                .build());
        assertTrue(token.getId().isPresent());
        return token.getId().get();
    }

    private DeviceContext deviceContext() {
        return DeviceContext.builder()
                .screenHeight(1080)
                .screenWidth(1920)
                .userAgentString("java-sdk-test")
                .languageCode("en-US")
                .timeZone("America/New_York")
                .javaScriptEnabled(true)
                .clientDeviceId(UUID.randomUUID().toString())
                .clientReferenceId(UUID.randomUUID().toString())
                .platformType(DeviceContextPlatformType.WEB)
                .build();
    }

    private Enrollment createAndVerifyEnrollment(
            BasisTheoryApiClient client, String cardNumber, String email, List<String> agentIds) {
        String tokenId = createCardToken(client, cardNumber);

        CreateEnrollmentRequest._FinalStage finalStage = CreateEnrollmentRequest.builder()
                .tokenId(tokenId)
                .consumer(Consumer.builder().email(email).build());

        if (agentIds != null) {
            finalStage.agentIds(agentIds);
        }

        Enrollment enrollment = client.agentic().enrollments().create(finalStage.build());

        // Start verification
        VerificationResponse verifyResponse = client.agentic()
                .enrollments()
                .verify()
                .start(
                        enrollment.getId().get(),
                        StartVerificationRequest.builder()
                                .deviceContext(deviceContext())
                                .build());

        // Auto-approved cards are already verified after verify.start
        // If status is ACTIVE, card was auto-approved; otherwise do OTP flow
        if (!verifyResponse.getStatus().isPresent()
                || verifyResponse.getStatus().get() != VerificationResponseStatus.APPROVED) {
            // OTP flow: select method, submit OTP, complete
            if (verifyResponse.getMethods().isPresent()
                    && !verifyResponse.getMethods().get().isEmpty()) {
                client.agentic()
                        .enrollments()
                        .verify()
                        .method(
                                enrollment.getId().get(),
                                SelectMethodRequest.builder()
                                        .methodId(verifyResponse
                                                .getMethods()
                                                .get()
                                                .get(0)
                                                .getId()
                                                .get())
                                        .build());
            }

            client.agentic()
                    .enrollments()
                    .verify()
                    .otp(
                            enrollment.getId().get(),
                            SubmitOtpRequest.builder().otpCode("123456").build());

            client.agentic()
                    .enrollments()
                    .verify()
                    .complete(enrollment.getId().get());
        }

        return client.agentic().enrollments().get(enrollment.getId().get());
    }

    // ========== Agents Tests ==========

    @Test
    @Timeout(30)
    void agentsShouldSupportLifecycle() {
        BasisTheoryApiClient client = getClient();

        // Create
        String agentName = "(Deletable) java-SDK-agent-" + UUID.randomUUID();
        Agent agent = client.agentic()
                .agents()
                .create(CreateAgentRequest.builder().name(agentName).build());

        assertTrue(agent.getId().isPresent());
        assertEquals(agentName, agent.getName().get());
        assertEquals("active", agent.getStatus().get());
        assertTrue(agent.getEnrollmentIds().isPresent());
        assertTrue(agent.getCreatedAt().isPresent());

        // Get and verify all fields match
        Agent retrieved = client.agentic().agents().get(agent.getId().get());
        assertEquals(agent.getId(), retrieved.getId());
        assertEquals(agent.getName(), retrieved.getName());
        assertEquals("active", retrieved.getStatus().get());
        assertEquals(agent.getEnrollmentIds(), retrieved.getEnrollmentIds());
        assertEquals(agent.getCreatedAt(), retrieved.getCreatedAt());

        // Update
        String updatedName = "(Deletable) java-SDK-agent-updated-" + UUID.randomUUID();
        Agent updated = client.agentic()
                .agents()
                .update(
                        agent.getId().get(),
                        UpdateAgentRequest.builder().name(updatedName).build());

        assertEquals(agent.getId(), updated.getId());
        assertEquals(updatedName, updated.getName().get());
        assertEquals("active", updated.getStatus().get());
        assertEquals(agent.getCreatedAt(), updated.getCreatedAt());

        // Delete
        client.agentic().agents().delete(agent.getId().get());

        // Verify deleted
        assertThrows(NotFoundError.class, () ->
                client.agentic().agents().get(agent.getId().get()));
    }

    // ========== Enrollments Tests ==========

    @Test
    @Timeout(30)
    void enrollmentsShouldSupportAutoApprovedLifecycle() {
        BasisTheoryApiClient client = getClient();

        // Create and verify enrollment (passkey bypass card)
        Enrollment enrollment = createAndVerifyEnrollment(client, "4000056655665556", "sdk-test@example.com", null);
        assertTrue(enrollment.getId().isPresent());
        assertEquals(EnrollmentStatus.ACTIVE, enrollment.getStatus().get());
        assertTrue(enrollment.getProvider().isPresent());
        assertTrue(enrollment.getCreatedAt().isPresent());

        // Verify card object fields
        assertTrue(enrollment.getCard().isPresent());
        AgenticCard card = enrollment.getCard().get();
        assertEquals(AgenticCardBrand.VISA, card.getBrand().get());
        assertTrue(card.getBin().isPresent());
        assertEquals("5556", card.getLast4().get());
        assertTrue(card.getExpirationMonth().isPresent());
        assertTrue(card.getExpirationYear().isPresent());

        // Get enrollment and verify all fields match
        Enrollment retrieved = client.agentic().enrollments().get(enrollment.getId().get());
        assertEquals(enrollment.getId(), retrieved.getId());
        assertEquals(EnrollmentStatus.ACTIVE, retrieved.getStatus().get());
        assertEquals(enrollment.getProvider(), retrieved.getProvider());
        assertEquals(
                enrollment.getCard().get().getBrand(),
                retrieved.getCard().get().getBrand());
        assertEquals(
                enrollment.getCard().get().getBin(),
                retrieved.getCard().get().getBin());
        assertEquals(
                enrollment.getCard().get().getLast4(),
                retrieved.getCard().get().getLast4());
        assertEquals(
                enrollment.getCard().get().getExpirationMonth(),
                retrieved.getCard().get().getExpirationMonth());
        assertEquals(
                enrollment.getCard().get().getExpirationYear(),
                retrieved.getCard().get().getExpirationYear());
        assertEquals(enrollment.getCreatedAt(), retrieved.getCreatedAt());

        // List enrollments and verify structure (auto-paginated)
        SyncPagingIterable<Enrollment> enrollments = client.agentic().enrollments().list();
        Enrollment listed = null;
        for (Enrollment e : enrollments) {
            if (e.getId().equals(enrollment.getId())) {
                listed = e;
                break;
            }
        }
        assertNotNull(listed);
        assertEquals(EnrollmentStatus.ACTIVE, listed.getStatus().get());
        assertEquals("5556", listed.getCard().get().getLast4().get());

        // Delete enrollment
        client.agentic().enrollments().delete(enrollment.getId().get());
    }

    @Test
    @Timeout(30)
    void enrollmentsShouldSupportOtpVerificationFlow() {
        BasisTheoryApiClient client = getClient();

        // Create a card token (OTP challenge Visa test card)
        String tokenId = createCardToken(client, "4000000000000002");

        // Create enrollment (will be pending_verification)
        Enrollment enrollment = client.agentic()
                .enrollments()
                .create(CreateEnrollmentRequest.builder()
                        .tokenId(tokenId)
                        .consumer(Consumer.builder().email("sdk-test-otp@example.com").build())
                        .build());

        assertTrue(enrollment.getId().isPresent());
        assertEquals(EnrollmentStatus.PENDING_VERIFICATION, enrollment.getStatus().get());
        assertTrue(enrollment.getProvider().isPresent());
        assertTrue(enrollment.getCreatedAt().isPresent());

        // Verify card object on initial create response
        assertTrue(enrollment.getCard().isPresent());
        AgenticCard card = enrollment.getCard().get();
        assertEquals(AgenticCardBrand.VISA, card.getBrand().get());
        assertTrue(card.getBin().isPresent());
        assertEquals("0002", card.getLast4().get());
        assertTrue(card.getExpirationMonth().isPresent());
        assertTrue(card.getExpirationYear().isPresent());

        // Start verification - expect challenge with OTP methods
        VerificationResponse verifyResponse = client.agentic()
                .enrollments()
                .verify()
                .start(
                        enrollment.getId().get(),
                        StartVerificationRequest.builder()
                                .deviceContext(deviceContext())
                                .build());

        assertTrue(verifyResponse.getStatus().isPresent());
        assertTrue(verifyResponse.getMethods().isPresent());
        assertTrue(verifyResponse.getMethods().get().size() > 0);
        assertTrue(verifyResponse.getMethods().get().get(0).getId().isPresent());
        assertTrue(verifyResponse.getMethods().get().get(0).getType().isPresent());

        // Select verification method
        if (verifyResponse.getMethods().isPresent()
                && !verifyResponse.getMethods().get().isEmpty()) {
            client.agentic()
                    .enrollments()
                    .verify()
                    .method(
                            enrollment.getId().get(),
                            SelectMethodRequest.builder()
                                    .methodId(verifyResponse
                                            .getMethods()
                                            .get()
                                            .get(0)
                                            .getId()
                                            .get())
                                    .build());
        }

        // Submit OTP (mock accepts any code)
        VerificationResponse otpResponse = client.agentic()
                .enrollments()
                .verify()
                .otp(
                        enrollment.getId().get(),
                        SubmitOtpRequest.builder().otpCode("123456").build());
        assertTrue(otpResponse.getStatus().isPresent());

        // Complete verification
        VerificationResponse completeResponse = client.agentic()
                .enrollments()
                .verify()
                .complete(enrollment.getId().get());
        assertTrue(completeResponse.getStatus().isPresent());

        // Verify enrollment is now active with all fields
        Enrollment completed = client.agentic().enrollments().get(enrollment.getId().get());
        assertEquals(enrollment.getId(), completed.getId());
        assertEquals(EnrollmentStatus.ACTIVE, completed.getStatus().get());
        assertEquals(enrollment.getProvider(), completed.getProvider());
        assertEquals(AgenticCardBrand.VISA, completed.getCard().get().getBrand().get());
        assertEquals("0002", completed.getCard().get().getLast4().get());
        assertEquals(enrollment.getCreatedAt(), completed.getCreatedAt());

        // Cleanup
        client.agentic().enrollments().delete(enrollment.getId().get());
    }

    // ========== Instructions Tests ==========

    @Test
    @Timeout(30)
    void instructionsShouldSupportLifecycleWithCredentials() {
        BasisTheoryApiClient client = getClient();

        // Setup: create agent and auto-approved enrollment
        Agent agent = client.agentic()
                .agents()
                .create(CreateAgentRequest.builder()
                        .name("(Deletable) java-SDK-instruction-agent-" + UUID.randomUUID())
                        .build());

        Enrollment enrollment = createAndVerifyEnrollment(
                client,
                "4000056655665556",
                "sdk-test-instructions@example.com",
                Collections.singletonList(agent.getId().get()));
        assertEquals(EnrollmentStatus.ACTIVE, enrollment.getStatus().get());

        // Create instruction
        OffsetDateTime expiresAt = OffsetDateTime.now(ZoneOffset.UTC).plusDays(7);

        Instruction instruction = client.agentic()
                .agents()
                .instructions()
                .create(
                        agent.getId().get(),
                        CreateInstructionRequest.builder()
                                .enrollmentId(enrollment.getId().get())
                                .amount(Amount.builder()
                                        .value("25.00")
                                        .currency("USD")
                                        .build())
                                .description("(Deletable) java-SDK test purchase")
                                .expiresAt(expiresAt)
                                .build());

        assertTrue(instruction.getId().isPresent());
        assertEquals(enrollment.getId().get(), instruction.getEnrollmentId().get());
        assertEquals(InstructionStatus.PENDING_VERIFICATION, instruction.getStatus().get());
        assertTrue(instruction.getAmount().isPresent());
        assertEquals("25.00", instruction.getAmount().get().getValue());
        assertEquals("USD", instruction.getAmount().get().getCurrency().get());
        assertTrue(instruction.getExpiresAt().isPresent());
        assertTrue(instruction.getCreatedAt().isPresent());

        // Get instruction and verify all fields match
        Instruction retrieved = client.agentic()
                .agents()
                .instructions()
                .get(agent.getId().get(), instruction.getId().get());

        assertEquals(instruction.getId(), retrieved.getId());
        assertEquals(instruction.getEnrollmentId(), retrieved.getEnrollmentId());
        assertEquals(instruction.getStatus(), retrieved.getStatus());
        assertEquals(
                instruction.getAmount().get().getValue(),
                retrieved.getAmount().get().getValue());
        assertEquals(
                instruction.getAmount().get().getCurrency(),
                retrieved.getAmount().get().getCurrency());
        assertEquals(instruction.getCreatedAt(), retrieved.getCreatedAt());

        // Update instruction
        Instruction updated = client.agentic()
                .agents()
                .instructions()
                .update(
                        agent.getId().get(),
                        instruction.getId().get(),
                        UpdateInstructionRequest.builder()
                                .amount(Amount.builder()
                                        .value("50.00")
                                        .currency("USD")
                                        .build())
                                .build());

        assertEquals(instruction.getId(), updated.getId());
        assertEquals("50.00", updated.getAmount().get().getValue());
        assertEquals("USD", updated.getAmount().get().getCurrency().get());
        assertEquals(enrollment.getId().get(), updated.getEnrollmentId().get());
        assertEquals(instruction.getCreatedAt(), updated.getCreatedAt());

        // List instructions (auto-paginated)
        SyncPagingIterable<Instruction> instructions = client.agentic()
                .agents()
                .instructions()
                .list(agent.getId().get());

        Instruction listed = null;
        for (Instruction i : instructions) {
            if (i.getId().equals(instruction.getId())) {
                listed = i;
                break;
            }
        }
        assertNotNull(listed);
        assertEquals(enrollment.getId().get(), listed.getEnrollmentId().get());
        assertEquals("50.00", listed.getAmount().get().getValue());

        // Verify instruction (required before credentials can be retrieved)
        VerificationResponse instrVerifyResponse = client.agentic()
                .agents()
                .instructions()
                .verify()
                .start(
                        agent.getId().get(),
                        instruction.getId().get(),
                        StartVerificationRequest.builder()
                                .deviceContext(deviceContext())
                                .build());
        // Passkey bypass card returns verified/active status immediately
        assertTrue(instrVerifyResponse.getStatus().isPresent());

        // Confirm instruction is now approved
        Instruction approved = client.agentic()
                .agents()
                .instructions()
                .get(agent.getId().get(), instruction.getId().get());
        assertTrue(approved.getStatus().isPresent());
        assertEquals(instruction.getId(), approved.getId());
        assertEquals(enrollment.getId().get(), approved.getEnrollmentId().get());

        // Get credentials
        Credentials credentials = client.agentic()
                .agents()
                .instructions()
                .credentials()
                .create(
                        agent.getId().get(),
                        instruction.getId().get(),
                        GetCredentialsRequest.builder()
                                .merchant(AgenticMerchant.builder()
                                        .name("(Deletable) Test Merchant")
                                        .url("https://example.com")
                                        .countryCode("US")
                                        .build())
                                .build());

        assertTrue(credentials.getCard().isPresent());
        CredentialsCard credCard = credentials.getCard().get();
        assertTrue(credCard.getNumber().isPresent());
        assertTrue(credCard.getExpirationMonth().isPresent());
        assertTrue(credCard.getExpirationYear().isPresent());
        assertTrue(credCard.getCvc().isPresent());

        // Verify mock virtual card number format: 400000100000 + last 4
        assertTrue(credCard.getNumber().get().matches("^400000100000\\d{4}$"));

        // Delete instruction
        client.agentic()
                .agents()
                .instructions()
                .delete(agent.getId().get(), instruction.getId().get());

        // Cleanup
        client.agentic().enrollments().delete(enrollment.getId().get());
        client.agentic().agents().delete(agent.getId().get());
    }

    @Test
    @Timeout(30)
    void instructionsShouldSupportListingFilteredByEnrollment() {
        BasisTheoryApiClient client = getClient();

        // Setup
        Agent agent = client.agentic()
                .agents()
                .create(CreateAgentRequest.builder()
                        .name("(Deletable) java-SDK-filter-agent-" + UUID.randomUUID())
                        .build());

        Enrollment enrollment = createAndVerifyEnrollment(
                client,
                "4000056655665556",
                "sdk-test-filter@example.com",
                Collections.singletonList(agent.getId().get()));

        OffsetDateTime expiresAt = OffsetDateTime.now(ZoneOffset.UTC).plusDays(7);

        Instruction instruction = client.agentic()
                .agents()
                .instructions()
                .create(
                        agent.getId().get(),
                        CreateInstructionRequest.builder()
                                .enrollmentId(enrollment.getId().get())
                                .amount(Amount.builder()
                                        .value("10.00")
                                        .currency("USD")
                                        .build())
                                .description("(Deletable) java-SDK filter test")
                                .expiresAt(expiresAt)
                                .build());

        // Verify created instruction fields
        assertTrue(instruction.getId().isPresent());
        assertEquals(enrollment.getId().get(), instruction.getEnrollmentId().get());
        assertEquals(InstructionStatus.PENDING_VERIFICATION, instruction.getStatus().get());
        assertEquals("10.00", instruction.getAmount().get().getValue());
        assertEquals("USD", instruction.getAmount().get().getCurrency().get());
        assertTrue(instruction.getExpiresAt().isPresent());
        assertTrue(instruction.getCreatedAt().isPresent());

        // List with enrollment filter (auto-paginated)
        SyncPagingIterable<Instruction> filtered = client.agentic()
                .agents()
                .instructions()
                .list(
                        agent.getId().get(),
                        InstructionsListRequest.builder()
                                .enrollmentId(enrollment.getId().get())
                                .build());

        int filteredCount = 0;
        // Verify all returned instructions belong to the filtered enrollment
        for (Instruction i : filtered) {
            assertEquals(enrollment.getId().get(), i.getEnrollmentId().get());
            filteredCount++;
        }
        assertTrue(filteredCount > 0);

        // Cleanup
        client.agentic()
                .agents()
                .instructions()
                .delete(agent.getId().get(), instruction.getId().get());
        client.agentic().enrollments().delete(enrollment.getId().get());
        client.agentic().agents().delete(agent.getId().get());
    }
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.Environment;
import com.basistheory.core.pagination.SyncPagingIterable;
import com.basistheory.errors.NotFoundError;
import com.basistheory.resources.applications.ApplicationsClient;
import com.basistheory.resources.applications.requests.CreateApplicationRequest;
import com.basistheory.resources.proxies.ProxiesClient;
import com.basistheory.resources.proxies.requests.CreateProxyRequest;
import com.basistheory.resources.reactors.ReactorsClient;
import com.basistheory.resources.reactors.requests.CreateReactorRequest;
import com.basistheory.resources.reactors.requests.ReactRequest;
import com.basistheory.resources.tenants.TenantsClient;
import com.basistheory.resources.tokens.TokensClient;
import com.basistheory.resources.tokens.requests.CreateTokenRequest;
import com.basistheory.resources.tokens.requests.TokensListRequest;
import com.basistheory.resources.tokens.requests.TokensListV2Request;
import com.basistheory.resources.tokens.requests.UpdateTokenRequest;
import com.basistheory.resources.webhooks.WebhooksClient;
import com.basistheory.resources.webhooks.requests.CreateWebhookRequest;
import com.basistheory.resources.webhooks.requests.UpdateWebhookRequest;
import com.basistheory.types.*;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class TestClient {
    @Test
    public void shouldCallTenantSelf() {
        TenantsClient client = new TenantsClient(managementClientOptions());
        Tenant actual = client.self().get();
        assertEquals("SDK Integration Tests", actual.getName().get());
    }

    @Test
    public void shouldSupportTokenLifecycle() {
        String cardNumber = "6011000990139424";
        TokensClient tokensClient = new TokensClient(privateClientOptions());

        String tokenId = createToken(tokensClient, cardNumber);
        getAndValidateCardNumber(tokensClient, tokenId, cardNumber);

        // Update currently does not support correct `Content-Type` header for PATCH command
//        String updateCardNumber = "4242424242424242";
//        updateToken(tokensClient, tokenId, updateCardNumber);
//        getAndValidateCardNumber(tokensClient, tokenId, updateCardNumber);

        ApplicationsClient applicationsClient = new ApplicationsClient(managementClientOptions());
        String applicationId = createApplication(applicationsClient);

        // Proxies
        ProxiesClient proxyClient = new ProxiesClient(managementClientOptions());
        Proxy proxy = createProxy(proxyClient, applicationId);
        String proxyId = proxy.getId().get();
        proxyClient.delete(proxyId);

        // Reactors
        ReactorsClient reactorsManagementClient = new ReactorsClient(managementClientOptions());
        Reactor reactor = reactorsManagementClient.create(CreateReactorRequest.builder()
                .name("(Deletable) java-SDK-" + UUID.randomUUID())
                .code("module.exports = function (req) {return {raw: req.args}}")
                .application(Application.builder().id(applicationId).build())
                .build()
        );
        String reactorId = reactor.getId().get();
        react(new ReactorsClient(privateClientOptions()), reactorId);
        reactorsManagementClient.delete(reactorId);

        applicationsClient.delete(applicationId);

        tokensClient.delete(tokenId);
        try {
            tokensClient.get(tokenId);
            fail("Should have raised NotFoundError");
        } catch (NotFoundError e) {
            assertTrue(true);
        }
    }

    @Test()
    @Disabled("Idempotency headers are currently NOT supported; Fern needs to update")
    public void shouldSupportIdempotencyHeaders() {

    }

    @Test
    public void shouldSupportPaginationOnListV1() {
        TokensClient tokensClient = new TokensClient(privateClientOptions());
        int pageSize = 3;
        SyncPagingIterable<Token> tokens = tokensClient.list(TokensListRequest.builder()
                .page(1)
                .size(pageSize)
                .build());

        int count = 0;
        for (Token token : tokens) {
            count++;
            if (count > pageSize) {
                break;
            }
        }
        assertTrue(count > pageSize);
    }

    @Test
    public void shouldSupportPaginationOnListV2() {
        TokensClient tokensClient = new TokensClient(privateClientOptions());
        int pageSize = 3;
        SyncPagingIterable<Token> tokens = tokensClient.listV2(TokensListV2Request.builder()
                .size(pageSize)
                .build());

        int count = 0;
        for (Token token : tokens) {
            count++;
            if (count > pageSize) {
                break;
            }
        }
        assertTrue(count > pageSize);
    }

    @Test
    public void shouldManageWebhookLifecycle() throws InterruptedException {
        WebhooksClient webhooksClient = new WebhooksClient(managementClientOptions());
        String url = "https://echo.basistheory.com/" + UUID.randomUUID();
        String webhookId = createWebhook(webhooksClient, url);
        getAndAssertWebhookUrl(webhooksClient, webhookId, url);

        Thread.sleep(2000); // Required to avoid error `The webhook subscription is undergoing another concurrent operation. Please wait a few seconds, then try again.`

        String updatedUrl = "https://echo.basistheory.com/" + UUID.randomUUID();
        updateWebhook(webhooksClient, webhookId, updatedUrl);
        getAndAssertWebhookUrl(webhooksClient, webhookId, updatedUrl);

        Thread.sleep(2000); // Required to avoid error `The webhook subscription is undergoing another concurrent operation. Please wait a few seconds, then try again.`

        webhooksClient.delete(webhookId);

        // This currently does not work due to webhook sending an empty body in 404;
        // Issue eng-7345
//        ensureWebhookIsRemoved(webhooksClient, webhookId);
    }

    @NotNull
    private static ClientOptions managementClientOptions() {
        return ClientOptions.builder()
                .environment(Environment.custom(System.getenv("BT_API_URL")))
                .addHeader("BT-API-KEY", System.getenv("BT_MGT_API_KEY"))
                .build();
    }

    @NotNull
    private static ClientOptions privateClientOptions() {
        return ClientOptions.builder()
                .environment(Environment.custom(System.getenv("BT_API_URL")))
                .addHeader("BT-API-KEY", System.getenv("BT_PVT_API_KEY"))
                .build();
    }

    @NotNull
    private static String createToken(TokensClient tokensClient, String cardNumber) {
        Token token = tokensClient.create(CreateTokenRequest.builder()
                .data(new HashMap<String, Object>() {{
                    put("number", cardNumber);
                    put("expiration_month", 4);
                    put("expiration_year", 2025);
                    put("cvc", 123);
                }})
                .type("card")
                .metadata(new HashMap<String, Optional<String>>() {{
                    put("customer_id", Optional.of("3181"));
                }})
                .searchIndexes(Arrays.asList("{{ data.expiration_month }}", "{{ data.number | last4 }}"))
                .fingerprintExpression("{{ data.number }}")
                .mask(new HashMap<String, Object>() {{
                    put("number", "{{ data.number, reveal_last: 4 }}");
                    put("cvc", "{{ data.cvc }}");
                }})
                .deduplicateToken(false)
                .containers(Arrays.asList("/pci/high/"))
                .build());
        String tokenId = token.getId().get();
        assertNotNull(tokenId);
        return tokenId;
    }

    private static void updateToken(TokensClient tokensClient, String tokenId, String updateCardNumber) {
        tokensClient.update(tokenId, UpdateTokenRequest.builder()
                .data(new HashMap<String, Object>() {{
                    put("number", updateCardNumber);
                }})
                .build());
    }

    private static void getAndValidateCardNumber(TokensClient tokensClient, String tokenId, String cardNumber) {
        Token token = tokensClient.get(tokenId);
        assertEquals(cardNumber, ((Map)token.getData().get()).get("number"));
    }

    @NotNull
    private static String createApplication(ApplicationsClient applicationsClient) {
        Application application =  applicationsClient.create(CreateApplicationRequest.builder()
                .name("(Deletable) java-SDK-" + UUID.randomUUID())
                .type("private")
                .permissions(Collections.singletonList("token:use"))
                .build());
        String applicationId = application.getId().get();
        return applicationId;
    }

    private static Proxy createProxy(ProxiesClient proxyClient, String applicationId) {
        Proxy proxy = proxyClient.create(CreateProxyRequest.builder()
                .name("(Deletable) java-SDK-" + UUID.randomUUID())
                .destinationUrl("https://echo.basistheory.com/" + UUID.randomUUID())
                .application(Application.builder().id(applicationId).build())
                .build()
        );
        return proxy;
    }

    private static void react(ReactorsClient reactorsClient, String reactorId) {
        HashMap<String, Object> expected = new HashMap<String, Object>() {{
            put("Key1", "Key1-" + UUID.randomUUID());
            put("Key2", "Key2-" + UUID.randomUUID());
        }};
        ReactResponse react = reactorsClient.react(reactorId, ReactRequest.builder().args(expected).build());
        assertEquals(expected.get("Key1"), ((Map)react.getRaw().get()).get("Key1"));
        assertEquals(expected.get("Key2"), ((Map)react.getRaw().get()).get("Key2"));
    }

    private static String createWebhook(WebhooksClient webhooksClient, String url) {
        Webhook webhook = webhooksClient.create(CreateWebhookRequest.builder()
                .name("(Deletable) java-SDK-" + UUID.randomUUID())
                .url(url)
                .addEvents("token.created")
                .build()
        );
        String webhookId = webhook.getId();
        return webhookId;
    }

    private static void getAndAssertWebhookUrl(WebhooksClient webhooksClient, String webhookId, String url) {
        Webhook webhook = webhooksClient.get(webhookId);
        assertEquals(url, webhook.getUrl());
    }

    private static void updateWebhook(WebhooksClient webhooksClient, String webhookId, String url) {
        webhooksClient.update(webhookId, UpdateWebhookRequest.builder()
                .name("(Deletable) java-SDK-" + UUID.randomUUID())
                .url(url)
                .addEvents("token.created")
                .addEvents("token.updated")
                .build()
        );
    }

    private static void ensureWebhookIsRemoved(WebhooksClient webhooksClient, String webhookId) {
        try {
            webhooksClient.get(webhookId);
            fail("Should have raised NotFoundError");
        } catch (NotFoundError e) {
            assertTrue(true);
        }
    }
}

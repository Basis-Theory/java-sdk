/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.resources.tenants.invitations.requests;

import com.basis.theory.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreateTenantInvitationRequest.Builder.class)
public final class CreateTenantInvitationRequest {
    private final String email;

    private final Optional<String> role;

    private final Map<String, Object> additionalProperties;

    private CreateTenantInvitationRequest(
            String email, Optional<String> role, Map<String, Object> additionalProperties) {
        this.email = email;
        this.role = role;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("role")
    public Optional<String> getRole() {
        return role;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateTenantInvitationRequest && equalTo((CreateTenantInvitationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateTenantInvitationRequest other) {
        return email.equals(other.email) && role.equals(other.role);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.email, this.role);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EmailStage builder() {
        return new Builder();
    }

    public interface EmailStage {
        _FinalStage email(@NotNull String email);

        Builder from(CreateTenantInvitationRequest other);
    }

    public interface _FinalStage {
        CreateTenantInvitationRequest build();

        _FinalStage role(Optional<String> role);

        _FinalStage role(String role);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EmailStage, _FinalStage {
        private String email;

        private Optional<String> role = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateTenantInvitationRequest other) {
            email(other.getEmail());
            role(other.getRole());
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public _FinalStage email(@NotNull String email) {
            this.email = Objects.requireNonNull(email, "email must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage role(String role) {
            this.role = Optional.ofNullable(role);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "role", nulls = Nulls.SKIP)
        public _FinalStage role(Optional<String> role) {
            this.role = role;
            return this;
        }

        @java.lang.Override
        public CreateTenantInvitationRequest build() {
            return new CreateTenantInvitationRequest(email, role, additionalProperties);
        }
    }
}

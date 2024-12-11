/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.types;

import com.basistheory.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreateSessionResponse.Builder.class)
public final class CreateSessionResponse {
    private final Optional<String> sessionKey;

    private final Optional<String> nonce;

    private final Optional<OffsetDateTime> expiresAt;

    private final Map<String, Object> additionalProperties;

    private CreateSessionResponse(
            Optional<String> sessionKey,
            Optional<String> nonce,
            Optional<OffsetDateTime> expiresAt,
            Map<String, Object> additionalProperties) {
        this.sessionKey = sessionKey;
        this.nonce = nonce;
        this.expiresAt = expiresAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("session_key")
    public Optional<String> getSessionKey() {
        return sessionKey;
    }

    @JsonProperty("nonce")
    public Optional<String> getNonce() {
        return nonce;
    }

    @JsonProperty("expires_at")
    public Optional<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateSessionResponse && equalTo((CreateSessionResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateSessionResponse other) {
        return sessionKey.equals(other.sessionKey) && nonce.equals(other.nonce) && expiresAt.equals(other.expiresAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.sessionKey, this.nonce, this.expiresAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> sessionKey = Optional.empty();

        private Optional<String> nonce = Optional.empty();

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CreateSessionResponse other) {
            sessionKey(other.getSessionKey());
            nonce(other.getNonce());
            expiresAt(other.getExpiresAt());
            return this;
        }

        @JsonSetter(value = "session_key", nulls = Nulls.SKIP)
        public Builder sessionKey(Optional<String> sessionKey) {
            this.sessionKey = sessionKey;
            return this;
        }

        public Builder sessionKey(String sessionKey) {
            this.sessionKey = Optional.ofNullable(sessionKey);
            return this;
        }

        @JsonSetter(value = "nonce", nulls = Nulls.SKIP)
        public Builder nonce(Optional<String> nonce) {
            this.nonce = nonce;
            return this;
        }

        public Builder nonce(String nonce) {
            this.nonce = Optional.ofNullable(nonce);
            return this;
        }

        @JsonSetter(value = "expires_at", nulls = Nulls.SKIP)
        public Builder expiresAt(Optional<OffsetDateTime> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        public CreateSessionResponse build() {
            return new CreateSessionResponse(sessionKey, nonce, expiresAt, additionalProperties);
        }
    }
}
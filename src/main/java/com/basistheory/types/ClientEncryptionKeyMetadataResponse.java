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
@JsonDeserialize(builder = ClientEncryptionKeyMetadataResponse.Builder.class)
public final class ClientEncryptionKeyMetadataResponse {
    private final Optional<String> id;

    private final Optional<OffsetDateTime> expiresAt;

    private final Map<String, Object> additionalProperties;

    private ClientEncryptionKeyMetadataResponse(
            Optional<String> id, Optional<OffsetDateTime> expiresAt, Map<String, Object> additionalProperties) {
        this.id = id;
        this.expiresAt = expiresAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("expiresAt")
    public Optional<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientEncryptionKeyMetadataResponse
                && equalTo((ClientEncryptionKeyMetadataResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientEncryptionKeyMetadataResponse other) {
        return id.equals(other.id) && expiresAt.equals(other.expiresAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.expiresAt);
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
        private Optional<String> id = Optional.empty();

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ClientEncryptionKeyMetadataResponse other) {
            id(other.getId());
            expiresAt(other.getExpiresAt());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @JsonSetter(value = "expiresAt", nulls = Nulls.SKIP)
        public Builder expiresAt(Optional<OffsetDateTime> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        public ClientEncryptionKeyMetadataResponse build() {
            return new ClientEncryptionKeyMetadataResponse(id, expiresAt, additionalProperties);
        }
    }
}

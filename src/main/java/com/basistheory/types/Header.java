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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Header.Builder.class)
public final class Header {
    private final Optional<String> publicKeyHash;

    private final Optional<String> ephemeralPublicKey;

    private final Optional<String> transactionId;

    private final Optional<String> applicationData;

    private final Map<String, Object> additionalProperties;

    private Header(
            Optional<String> publicKeyHash,
            Optional<String> ephemeralPublicKey,
            Optional<String> transactionId,
            Optional<String> applicationData,
            Map<String, Object> additionalProperties) {
        this.publicKeyHash = publicKeyHash;
        this.ephemeralPublicKey = ephemeralPublicKey;
        this.transactionId = transactionId;
        this.applicationData = applicationData;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("publicKeyHash")
    public Optional<String> getPublicKeyHash() {
        return publicKeyHash;
    }

    @JsonProperty("ephemeralPublicKey")
    public Optional<String> getEphemeralPublicKey() {
        return ephemeralPublicKey;
    }

    @JsonProperty("transactionId")
    public Optional<String> getTransactionId() {
        return transactionId;
    }

    @JsonProperty("applicationData")
    public Optional<String> getApplicationData() {
        return applicationData;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Header && equalTo((Header) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Header other) {
        return publicKeyHash.equals(other.publicKeyHash)
                && ephemeralPublicKey.equals(other.ephemeralPublicKey)
                && transactionId.equals(other.transactionId)
                && applicationData.equals(other.applicationData);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.publicKeyHash, this.ephemeralPublicKey, this.transactionId, this.applicationData);
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
        private Optional<String> publicKeyHash = Optional.empty();

        private Optional<String> ephemeralPublicKey = Optional.empty();

        private Optional<String> transactionId = Optional.empty();

        private Optional<String> applicationData = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Header other) {
            publicKeyHash(other.getPublicKeyHash());
            ephemeralPublicKey(other.getEphemeralPublicKey());
            transactionId(other.getTransactionId());
            applicationData(other.getApplicationData());
            return this;
        }

        @JsonSetter(value = "publicKeyHash", nulls = Nulls.SKIP)
        public Builder publicKeyHash(Optional<String> publicKeyHash) {
            this.publicKeyHash = publicKeyHash;
            return this;
        }

        public Builder publicKeyHash(String publicKeyHash) {
            this.publicKeyHash = Optional.ofNullable(publicKeyHash);
            return this;
        }

        @JsonSetter(value = "ephemeralPublicKey", nulls = Nulls.SKIP)
        public Builder ephemeralPublicKey(Optional<String> ephemeralPublicKey) {
            this.ephemeralPublicKey = ephemeralPublicKey;
            return this;
        }

        public Builder ephemeralPublicKey(String ephemeralPublicKey) {
            this.ephemeralPublicKey = Optional.ofNullable(ephemeralPublicKey);
            return this;
        }

        @JsonSetter(value = "transactionId", nulls = Nulls.SKIP)
        public Builder transactionId(Optional<String> transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = Optional.ofNullable(transactionId);
            return this;
        }

        @JsonSetter(value = "applicationData", nulls = Nulls.SKIP)
        public Builder applicationData(Optional<String> applicationData) {
            this.applicationData = applicationData;
            return this;
        }

        public Builder applicationData(String applicationData) {
            this.applicationData = Optional.ofNullable(applicationData);
            return this;
        }

        public Header build() {
            return new Header(publicKeyHash, ephemeralPublicKey, transactionId, applicationData, additionalProperties);
        }
    }
}

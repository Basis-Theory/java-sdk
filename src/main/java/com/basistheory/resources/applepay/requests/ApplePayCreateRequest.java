/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.applepay.requests;

import com.basistheory.core.ObjectMappers;
import com.basistheory.types.ApplePayMethodToken;
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
@JsonDeserialize(builder = ApplePayCreateRequest.Builder.class)
public final class ApplePayCreateRequest {
    private final Optional<String> expiresAt;

    private final Optional<ApplePayMethodToken> applePaymentData;

    private final Map<String, Object> additionalProperties;

    private ApplePayCreateRequest(
            Optional<String> expiresAt,
            Optional<ApplePayMethodToken> applePaymentData,
            Map<String, Object> additionalProperties) {
        this.expiresAt = expiresAt;
        this.applePaymentData = applePaymentData;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("expires_at")
    public Optional<String> getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("apple_payment_data")
    public Optional<ApplePayMethodToken> getApplePaymentData() {
        return applePaymentData;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApplePayCreateRequest && equalTo((ApplePayCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApplePayCreateRequest other) {
        return expiresAt.equals(other.expiresAt) && applePaymentData.equals(other.applePaymentData);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.expiresAt, this.applePaymentData);
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
        private Optional<String> expiresAt = Optional.empty();

        private Optional<ApplePayMethodToken> applePaymentData = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ApplePayCreateRequest other) {
            expiresAt(other.getExpiresAt());
            applePaymentData(other.getApplePaymentData());
            return this;
        }

        @JsonSetter(value = "expires_at", nulls = Nulls.SKIP)
        public Builder expiresAt(Optional<String> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        @JsonSetter(value = "apple_payment_data", nulls = Nulls.SKIP)
        public Builder applePaymentData(Optional<ApplePayMethodToken> applePaymentData) {
            this.applePaymentData = applePaymentData;
            return this;
        }

        public Builder applePaymentData(ApplePayMethodToken applePaymentData) {
            this.applePaymentData = Optional.ofNullable(applePaymentData);
            return this;
        }

        public ApplePayCreateRequest build() {
            return new ApplePayCreateRequest(expiresAt, applePaymentData, additionalProperties);
        }
    }
}

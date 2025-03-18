/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.applepay.domain.requests;

import com.basistheory.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ApplePayDomainRegistrationRequest.Builder.class)
public final class ApplePayDomainRegistrationRequest {
    private final String domain;

    private final Map<String, Object> additionalProperties;

    private ApplePayDomainRegistrationRequest(String domain, Map<String, Object> additionalProperties) {
        this.domain = domain;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApplePayDomainRegistrationRequest && equalTo((ApplePayDomainRegistrationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApplePayDomainRegistrationRequest other) {
        return domain.equals(other.domain);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.domain);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DomainStage builder() {
        return new Builder();
    }

    public interface DomainStage {
        _FinalStage domain(@NotNull String domain);

        Builder from(ApplePayDomainRegistrationRequest other);
    }

    public interface _FinalStage {
        ApplePayDomainRegistrationRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DomainStage, _FinalStage {
        private String domain;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ApplePayDomainRegistrationRequest other) {
            domain(other.getDomain());
            return this;
        }

        @java.lang.Override
        @JsonSetter("domain")
        public _FinalStage domain(@NotNull String domain) {
            this.domain = Objects.requireNonNull(domain, "domain must not be null");
            return this;
        }

        @java.lang.Override
        public ApplePayDomainRegistrationRequest build() {
            return new ApplePayDomainRegistrationRequest(domain, additionalProperties);
        }
    }
}

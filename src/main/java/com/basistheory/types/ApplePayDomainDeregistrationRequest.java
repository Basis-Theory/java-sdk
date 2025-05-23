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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ApplePayDomainDeregistrationRequest.Builder.class)
public final class ApplePayDomainDeregistrationRequest {
    private final String domain;

    private final Map<String, Object> additionalProperties;

    private ApplePayDomainDeregistrationRequest(String domain, Map<String, Object> additionalProperties) {
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
        return other instanceof ApplePayDomainDeregistrationRequest
                && equalTo((ApplePayDomainDeregistrationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApplePayDomainDeregistrationRequest other) {
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

        Builder from(ApplePayDomainDeregistrationRequest other);
    }

    public interface _FinalStage {
        ApplePayDomainDeregistrationRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DomainStage, _FinalStage {
        private String domain;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ApplePayDomainDeregistrationRequest other) {
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
        public ApplePayDomainDeregistrationRequest build() {
            return new ApplePayDomainDeregistrationRequest(domain, additionalProperties);
        }
    }
}

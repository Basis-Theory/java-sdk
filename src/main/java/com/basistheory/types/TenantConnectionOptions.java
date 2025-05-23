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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TenantConnectionOptions.Builder.class)
public final class TenantConnectionOptions {
    private final Optional<List<String>> domainAliases;

    private final Map<String, Object> additionalProperties;

    private TenantConnectionOptions(Optional<List<String>> domainAliases, Map<String, Object> additionalProperties) {
        this.domainAliases = domainAliases;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("domain_aliases")
    public Optional<List<String>> getDomainAliases() {
        return domainAliases;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TenantConnectionOptions && equalTo((TenantConnectionOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TenantConnectionOptions other) {
        return domainAliases.equals(other.domainAliases);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.domainAliases);
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
        private Optional<List<String>> domainAliases = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TenantConnectionOptions other) {
            domainAliases(other.getDomainAliases());
            return this;
        }

        @JsonSetter(value = "domain_aliases", nulls = Nulls.SKIP)
        public Builder domainAliases(Optional<List<String>> domainAliases) {
            this.domainAliases = domainAliases;
            return this;
        }

        public Builder domainAliases(List<String> domainAliases) {
            this.domainAliases = Optional.ofNullable(domainAliases);
            return this;
        }

        public TenantConnectionOptions build() {
            return new TenantConnectionOptions(domainAliases, additionalProperties);
        }
    }
}

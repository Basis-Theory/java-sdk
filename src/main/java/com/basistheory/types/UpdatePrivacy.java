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
@JsonDeserialize(builder = UpdatePrivacy.Builder.class)
public final class UpdatePrivacy {
    private final Optional<String> impactLevel;

    private final Optional<String> restrictionPolicy;

    private final Map<String, Object> additionalProperties;

    private UpdatePrivacy(
            Optional<String> impactLevel,
            Optional<String> restrictionPolicy,
            Map<String, Object> additionalProperties) {
        this.impactLevel = impactLevel;
        this.restrictionPolicy = restrictionPolicy;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("impact_level")
    public Optional<String> getImpactLevel() {
        return impactLevel;
    }

    @JsonProperty("restriction_policy")
    public Optional<String> getRestrictionPolicy() {
        return restrictionPolicy;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdatePrivacy && equalTo((UpdatePrivacy) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdatePrivacy other) {
        return impactLevel.equals(other.impactLevel) && restrictionPolicy.equals(other.restrictionPolicy);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.impactLevel, this.restrictionPolicy);
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
        private Optional<String> impactLevel = Optional.empty();

        private Optional<String> restrictionPolicy = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdatePrivacy other) {
            impactLevel(other.getImpactLevel());
            restrictionPolicy(other.getRestrictionPolicy());
            return this;
        }

        @JsonSetter(value = "impact_level", nulls = Nulls.SKIP)
        public Builder impactLevel(Optional<String> impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }

        public Builder impactLevel(String impactLevel) {
            this.impactLevel = Optional.ofNullable(impactLevel);
            return this;
        }

        @JsonSetter(value = "restriction_policy", nulls = Nulls.SKIP)
        public Builder restrictionPolicy(Optional<String> restrictionPolicy) {
            this.restrictionPolicy = restrictionPolicy;
            return this;
        }

        public Builder restrictionPolicy(String restrictionPolicy) {
            this.restrictionPolicy = Optional.ofNullable(restrictionPolicy);
            return this;
        }

        public UpdatePrivacy build() {
            return new UpdatePrivacy(impactLevel, restrictionPolicy, additionalProperties);
        }
    }
}
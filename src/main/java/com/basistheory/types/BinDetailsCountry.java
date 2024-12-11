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
@JsonDeserialize(builder = BinDetailsCountry.Builder.class)
public final class BinDetailsCountry {
    private final Optional<String> alpha2;

    private final Optional<String> name;

    private final Optional<String> numeric;

    private final Map<String, Object> additionalProperties;

    private BinDetailsCountry(
            Optional<String> alpha2,
            Optional<String> name,
            Optional<String> numeric,
            Map<String, Object> additionalProperties) {
        this.alpha2 = alpha2;
        this.name = name;
        this.numeric = numeric;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("alpha2")
    public Optional<String> getAlpha2() {
        return alpha2;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("numeric")
    public Optional<String> getNumeric() {
        return numeric;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BinDetailsCountry && equalTo((BinDetailsCountry) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BinDetailsCountry other) {
        return alpha2.equals(other.alpha2) && name.equals(other.name) && numeric.equals(other.numeric);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.alpha2, this.name, this.numeric);
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
        private Optional<String> alpha2 = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> numeric = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(BinDetailsCountry other) {
            alpha2(other.getAlpha2());
            name(other.getName());
            numeric(other.getNumeric());
            return this;
        }

        @JsonSetter(value = "alpha2", nulls = Nulls.SKIP)
        public Builder alpha2(Optional<String> alpha2) {
            this.alpha2 = alpha2;
            return this;
        }

        public Builder alpha2(String alpha2) {
            this.alpha2 = Optional.ofNullable(alpha2);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "numeric", nulls = Nulls.SKIP)
        public Builder numeric(Optional<String> numeric) {
            this.numeric = numeric;
            return this;
        }

        public Builder numeric(String numeric) {
            this.numeric = Optional.ofNullable(numeric);
            return this;
        }

        public BinDetailsCountry build() {
            return new BinDetailsCountry(alpha2, name, numeric, additionalProperties);
        }
    }
}
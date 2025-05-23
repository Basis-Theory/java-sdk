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
@JsonDeserialize(builder = CardholderInfo.Builder.class)
public final class CardholderInfo {
    private final Optional<String> name;

    private final Optional<Address> address;

    private final Map<String, Object> additionalProperties;

    private CardholderInfo(Optional<String> name, Optional<Address> address, Map<String, Object> additionalProperties) {
        this.name = name;
        this.address = address;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("address")
    public Optional<Address> getAddress() {
        return address;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CardholderInfo && equalTo((CardholderInfo) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CardholderInfo other) {
        return name.equals(other.name) && address.equals(other.address);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.address);
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
        private Optional<String> name = Optional.empty();

        private Optional<Address> address = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CardholderInfo other) {
            name(other.getName());
            address(other.getAddress());
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

        @JsonSetter(value = "address", nulls = Nulls.SKIP)
        public Builder address(Optional<Address> address) {
            this.address = address;
            return this;
        }

        public Builder address(Address address) {
            this.address = Optional.ofNullable(address);
            return this;
        }

        public CardholderInfo build() {
            return new CardholderInfo(name, address, additionalProperties);
        }
    }
}

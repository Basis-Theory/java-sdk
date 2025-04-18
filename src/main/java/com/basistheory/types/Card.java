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
@JsonDeserialize(builder = Card.Builder.class)
public final class Card {
    private final Optional<String> number;

    private final Optional<Integer> expirationMonth;

    private final Optional<Integer> expirationYear;

    private final Optional<String> cvc;

    private final Map<String, Object> additionalProperties;

    private Card(
            Optional<String> number,
            Optional<Integer> expirationMonth,
            Optional<Integer> expirationYear,
            Optional<String> cvc,
            Map<String, Object> additionalProperties) {
        this.number = number;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvc = cvc;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("number")
    public Optional<String> getNumber() {
        return number;
    }

    @JsonProperty("expiration_month")
    public Optional<Integer> getExpirationMonth() {
        return expirationMonth;
    }

    @JsonProperty("expiration_year")
    public Optional<Integer> getExpirationYear() {
        return expirationYear;
    }

    @JsonProperty("cvc")
    public Optional<String> getCvc() {
        return cvc;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Card && equalTo((Card) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Card other) {
        return number.equals(other.number)
                && expirationMonth.equals(other.expirationMonth)
                && expirationYear.equals(other.expirationYear)
                && cvc.equals(other.cvc);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.number, this.expirationMonth, this.expirationYear, this.cvc);
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
        private Optional<String> number = Optional.empty();

        private Optional<Integer> expirationMonth = Optional.empty();

        private Optional<Integer> expirationYear = Optional.empty();

        private Optional<String> cvc = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Card other) {
            number(other.getNumber());
            expirationMonth(other.getExpirationMonth());
            expirationYear(other.getExpirationYear());
            cvc(other.getCvc());
            return this;
        }

        @JsonSetter(value = "number", nulls = Nulls.SKIP)
        public Builder number(Optional<String> number) {
            this.number = number;
            return this;
        }

        public Builder number(String number) {
            this.number = Optional.ofNullable(number);
            return this;
        }

        @JsonSetter(value = "expiration_month", nulls = Nulls.SKIP)
        public Builder expirationMonth(Optional<Integer> expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        public Builder expirationMonth(Integer expirationMonth) {
            this.expirationMonth = Optional.ofNullable(expirationMonth);
            return this;
        }

        @JsonSetter(value = "expiration_year", nulls = Nulls.SKIP)
        public Builder expirationYear(Optional<Integer> expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        public Builder expirationYear(Integer expirationYear) {
            this.expirationYear = Optional.ofNullable(expirationYear);
            return this;
        }

        @JsonSetter(value = "cvc", nulls = Nulls.SKIP)
        public Builder cvc(Optional<String> cvc) {
            this.cvc = cvc;
            return this;
        }

        public Builder cvc(String cvc) {
            this.cvc = Optional.ofNullable(cvc);
            return this;
        }

        public Card build() {
            return new Card(number, expirationMonth, expirationYear, cvc, additionalProperties);
        }
    }
}

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
@JsonDeserialize(builder = ThreeDsPurchaseInfo.Builder.class)
public final class ThreeDsPurchaseInfo {
    private final Optional<String> amount;

    private final Optional<String> currency;

    private final Optional<String> exponent;

    private final Optional<String> date;

    private final Optional<String> transactionType;

    private final Optional<String> installmentCount;

    private final Optional<String> recurringExpiration;

    private final Optional<String> recurringFrequency;

    private final Map<String, Object> additionalProperties;

    private ThreeDsPurchaseInfo(
            Optional<String> amount,
            Optional<String> currency,
            Optional<String> exponent,
            Optional<String> date,
            Optional<String> transactionType,
            Optional<String> installmentCount,
            Optional<String> recurringExpiration,
            Optional<String> recurringFrequency,
            Map<String, Object> additionalProperties) {
        this.amount = amount;
        this.currency = currency;
        this.exponent = exponent;
        this.date = date;
        this.transactionType = transactionType;
        this.installmentCount = installmentCount;
        this.recurringExpiration = recurringExpiration;
        this.recurringFrequency = recurringFrequency;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("amount")
    public Optional<String> getAmount() {
        return amount;
    }

    @JsonProperty("currency")
    public Optional<String> getCurrency() {
        return currency;
    }

    @JsonProperty("exponent")
    public Optional<String> getExponent() {
        return exponent;
    }

    @JsonProperty("date")
    public Optional<String> getDate() {
        return date;
    }

    @JsonProperty("transaction_type")
    public Optional<String> getTransactionType() {
        return transactionType;
    }

    @JsonProperty("installment_count")
    public Optional<String> getInstallmentCount() {
        return installmentCount;
    }

    @JsonProperty("recurring_expiration")
    public Optional<String> getRecurringExpiration() {
        return recurringExpiration;
    }

    @JsonProperty("recurring_frequency")
    public Optional<String> getRecurringFrequency() {
        return recurringFrequency;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThreeDsPurchaseInfo && equalTo((ThreeDsPurchaseInfo) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ThreeDsPurchaseInfo other) {
        return amount.equals(other.amount)
                && currency.equals(other.currency)
                && exponent.equals(other.exponent)
                && date.equals(other.date)
                && transactionType.equals(other.transactionType)
                && installmentCount.equals(other.installmentCount)
                && recurringExpiration.equals(other.recurringExpiration)
                && recurringFrequency.equals(other.recurringFrequency);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.amount,
                this.currency,
                this.exponent,
                this.date,
                this.transactionType,
                this.installmentCount,
                this.recurringExpiration,
                this.recurringFrequency);
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
        private Optional<String> amount = Optional.empty();

        private Optional<String> currency = Optional.empty();

        private Optional<String> exponent = Optional.empty();

        private Optional<String> date = Optional.empty();

        private Optional<String> transactionType = Optional.empty();

        private Optional<String> installmentCount = Optional.empty();

        private Optional<String> recurringExpiration = Optional.empty();

        private Optional<String> recurringFrequency = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ThreeDsPurchaseInfo other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            exponent(other.getExponent());
            date(other.getDate());
            transactionType(other.getTransactionType());
            installmentCount(other.getInstallmentCount());
            recurringExpiration(other.getRecurringExpiration());
            recurringFrequency(other.getRecurringFrequency());
            return this;
        }

        @JsonSetter(value = "amount", nulls = Nulls.SKIP)
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        @JsonSetter(value = "exponent", nulls = Nulls.SKIP)
        public Builder exponent(Optional<String> exponent) {
            this.exponent = exponent;
            return this;
        }

        public Builder exponent(String exponent) {
            this.exponent = Optional.ofNullable(exponent);
            return this;
        }

        @JsonSetter(value = "date", nulls = Nulls.SKIP)
        public Builder date(Optional<String> date) {
            this.date = date;
            return this;
        }

        public Builder date(String date) {
            this.date = Optional.ofNullable(date);
            return this;
        }

        @JsonSetter(value = "transaction_type", nulls = Nulls.SKIP)
        public Builder transactionType(Optional<String> transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public Builder transactionType(String transactionType) {
            this.transactionType = Optional.ofNullable(transactionType);
            return this;
        }

        @JsonSetter(value = "installment_count", nulls = Nulls.SKIP)
        public Builder installmentCount(Optional<String> installmentCount) {
            this.installmentCount = installmentCount;
            return this;
        }

        public Builder installmentCount(String installmentCount) {
            this.installmentCount = Optional.ofNullable(installmentCount);
            return this;
        }

        @JsonSetter(value = "recurring_expiration", nulls = Nulls.SKIP)
        public Builder recurringExpiration(Optional<String> recurringExpiration) {
            this.recurringExpiration = recurringExpiration;
            return this;
        }

        public Builder recurringExpiration(String recurringExpiration) {
            this.recurringExpiration = Optional.ofNullable(recurringExpiration);
            return this;
        }

        @JsonSetter(value = "recurring_frequency", nulls = Nulls.SKIP)
        public Builder recurringFrequency(Optional<String> recurringFrequency) {
            this.recurringFrequency = recurringFrequency;
            return this;
        }

        public Builder recurringFrequency(String recurringFrequency) {
            this.recurringFrequency = Optional.ofNullable(recurringFrequency);
            return this;
        }

        public ThreeDsPurchaseInfo build() {
            return new ThreeDsPurchaseInfo(
                    amount,
                    currency,
                    exponent,
                    date,
                    transactionType,
                    installmentCount,
                    recurringExpiration,
                    recurringFrequency,
                    additionalProperties);
        }
    }
}
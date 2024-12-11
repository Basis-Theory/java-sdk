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
@JsonDeserialize(builder = TokenReport.Builder.class)
public final class TokenReport {
    private final Optional<Long> includedMonthlyActiveTokens;

    private final Optional<Long> monthlyActiveTokens;

    private final Optional<Map<String, Optional<TokenMetrics>>> metricsByType;

    private final Optional<Long> totalTokens;

    private final Map<String, Object> additionalProperties;

    private TokenReport(
            Optional<Long> includedMonthlyActiveTokens,
            Optional<Long> monthlyActiveTokens,
            Optional<Map<String, Optional<TokenMetrics>>> metricsByType,
            Optional<Long> totalTokens,
            Map<String, Object> additionalProperties) {
        this.includedMonthlyActiveTokens = includedMonthlyActiveTokens;
        this.monthlyActiveTokens = monthlyActiveTokens;
        this.metricsByType = metricsByType;
        this.totalTokens = totalTokens;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("included_monthly_active_tokens")
    public Optional<Long> getIncludedMonthlyActiveTokens() {
        return includedMonthlyActiveTokens;
    }

    @JsonProperty("monthly_active_tokens")
    public Optional<Long> getMonthlyActiveTokens() {
        return monthlyActiveTokens;
    }

    @JsonProperty("metrics_by_type")
    public Optional<Map<String, Optional<TokenMetrics>>> getMetricsByType() {
        return metricsByType;
    }

    @JsonProperty("total_tokens")
    public Optional<Long> getTotalTokens() {
        return totalTokens;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TokenReport && equalTo((TokenReport) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TokenReport other) {
        return includedMonthlyActiveTokens.equals(other.includedMonthlyActiveTokens)
                && monthlyActiveTokens.equals(other.monthlyActiveTokens)
                && metricsByType.equals(other.metricsByType)
                && totalTokens.equals(other.totalTokens);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.includedMonthlyActiveTokens, this.monthlyActiveTokens, this.metricsByType, this.totalTokens);
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
        private Optional<Long> includedMonthlyActiveTokens = Optional.empty();

        private Optional<Long> monthlyActiveTokens = Optional.empty();

        private Optional<Map<String, Optional<TokenMetrics>>> metricsByType = Optional.empty();

        private Optional<Long> totalTokens = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TokenReport other) {
            includedMonthlyActiveTokens(other.getIncludedMonthlyActiveTokens());
            monthlyActiveTokens(other.getMonthlyActiveTokens());
            metricsByType(other.getMetricsByType());
            totalTokens(other.getTotalTokens());
            return this;
        }

        @JsonSetter(value = "included_monthly_active_tokens", nulls = Nulls.SKIP)
        public Builder includedMonthlyActiveTokens(Optional<Long> includedMonthlyActiveTokens) {
            this.includedMonthlyActiveTokens = includedMonthlyActiveTokens;
            return this;
        }

        public Builder includedMonthlyActiveTokens(Long includedMonthlyActiveTokens) {
            this.includedMonthlyActiveTokens = Optional.ofNullable(includedMonthlyActiveTokens);
            return this;
        }

        @JsonSetter(value = "monthly_active_tokens", nulls = Nulls.SKIP)
        public Builder monthlyActiveTokens(Optional<Long> monthlyActiveTokens) {
            this.monthlyActiveTokens = monthlyActiveTokens;
            return this;
        }

        public Builder monthlyActiveTokens(Long monthlyActiveTokens) {
            this.monthlyActiveTokens = Optional.ofNullable(monthlyActiveTokens);
            return this;
        }

        @JsonSetter(value = "metrics_by_type", nulls = Nulls.SKIP)
        public Builder metricsByType(Optional<Map<String, Optional<TokenMetrics>>> metricsByType) {
            this.metricsByType = metricsByType;
            return this;
        }

        public Builder metricsByType(Map<String, Optional<TokenMetrics>> metricsByType) {
            this.metricsByType = Optional.ofNullable(metricsByType);
            return this;
        }

        @JsonSetter(value = "total_tokens", nulls = Nulls.SKIP)
        public Builder totalTokens(Optional<Long> totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        public Builder totalTokens(Long totalTokens) {
            this.totalTokens = Optional.ofNullable(totalTokens);
            return this;
        }

        public TokenReport build() {
            return new TokenReport(
                    includedMonthlyActiveTokens, monthlyActiveTokens, metricsByType, totalTokens, additionalProperties);
        }
    }
}
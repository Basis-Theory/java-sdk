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
@JsonDeserialize(builder = ThreeDsVersion.Builder.class)
public final class ThreeDsVersion {
    private final Optional<String> recommendedVersion;

    private final Optional<List<String>> availableVersions;

    private final Optional<String> earliestAcsSupportedVersion;

    private final Optional<String> earliestDsSupportedVersion;

    private final Optional<String> latestAcsSupportedVersion;

    private final Optional<String> latestDsSupportedVersion;

    private final Optional<List<String>> acsInformation;

    private final Map<String, Object> additionalProperties;

    private ThreeDsVersion(
            Optional<String> recommendedVersion,
            Optional<List<String>> availableVersions,
            Optional<String> earliestAcsSupportedVersion,
            Optional<String> earliestDsSupportedVersion,
            Optional<String> latestAcsSupportedVersion,
            Optional<String> latestDsSupportedVersion,
            Optional<List<String>> acsInformation,
            Map<String, Object> additionalProperties) {
        this.recommendedVersion = recommendedVersion;
        this.availableVersions = availableVersions;
        this.earliestAcsSupportedVersion = earliestAcsSupportedVersion;
        this.earliestDsSupportedVersion = earliestDsSupportedVersion;
        this.latestAcsSupportedVersion = latestAcsSupportedVersion;
        this.latestDsSupportedVersion = latestDsSupportedVersion;
        this.acsInformation = acsInformation;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("recommended_version")
    public Optional<String> getRecommendedVersion() {
        return recommendedVersion;
    }

    @JsonProperty("available_versions")
    public Optional<List<String>> getAvailableVersions() {
        return availableVersions;
    }

    @JsonProperty("earliest_acs_supported_version")
    public Optional<String> getEarliestAcsSupportedVersion() {
        return earliestAcsSupportedVersion;
    }

    @JsonProperty("earliest_ds_supported_version")
    public Optional<String> getEarliestDsSupportedVersion() {
        return earliestDsSupportedVersion;
    }

    @JsonProperty("latest_acs_supported_version")
    public Optional<String> getLatestAcsSupportedVersion() {
        return latestAcsSupportedVersion;
    }

    @JsonProperty("latest_ds_supported_version")
    public Optional<String> getLatestDsSupportedVersion() {
        return latestDsSupportedVersion;
    }

    @JsonProperty("acs_information")
    public Optional<List<String>> getAcsInformation() {
        return acsInformation;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThreeDsVersion && equalTo((ThreeDsVersion) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ThreeDsVersion other) {
        return recommendedVersion.equals(other.recommendedVersion)
                && availableVersions.equals(other.availableVersions)
                && earliestAcsSupportedVersion.equals(other.earliestAcsSupportedVersion)
                && earliestDsSupportedVersion.equals(other.earliestDsSupportedVersion)
                && latestAcsSupportedVersion.equals(other.latestAcsSupportedVersion)
                && latestDsSupportedVersion.equals(other.latestDsSupportedVersion)
                && acsInformation.equals(other.acsInformation);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.recommendedVersion,
                this.availableVersions,
                this.earliestAcsSupportedVersion,
                this.earliestDsSupportedVersion,
                this.latestAcsSupportedVersion,
                this.latestDsSupportedVersion,
                this.acsInformation);
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
        private Optional<String> recommendedVersion = Optional.empty();

        private Optional<List<String>> availableVersions = Optional.empty();

        private Optional<String> earliestAcsSupportedVersion = Optional.empty();

        private Optional<String> earliestDsSupportedVersion = Optional.empty();

        private Optional<String> latestAcsSupportedVersion = Optional.empty();

        private Optional<String> latestDsSupportedVersion = Optional.empty();

        private Optional<List<String>> acsInformation = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ThreeDsVersion other) {
            recommendedVersion(other.getRecommendedVersion());
            availableVersions(other.getAvailableVersions());
            earliestAcsSupportedVersion(other.getEarliestAcsSupportedVersion());
            earliestDsSupportedVersion(other.getEarliestDsSupportedVersion());
            latestAcsSupportedVersion(other.getLatestAcsSupportedVersion());
            latestDsSupportedVersion(other.getLatestDsSupportedVersion());
            acsInformation(other.getAcsInformation());
            return this;
        }

        @JsonSetter(value = "recommended_version", nulls = Nulls.SKIP)
        public Builder recommendedVersion(Optional<String> recommendedVersion) {
            this.recommendedVersion = recommendedVersion;
            return this;
        }

        public Builder recommendedVersion(String recommendedVersion) {
            this.recommendedVersion = Optional.ofNullable(recommendedVersion);
            return this;
        }

        @JsonSetter(value = "available_versions", nulls = Nulls.SKIP)
        public Builder availableVersions(Optional<List<String>> availableVersions) {
            this.availableVersions = availableVersions;
            return this;
        }

        public Builder availableVersions(List<String> availableVersions) {
            this.availableVersions = Optional.ofNullable(availableVersions);
            return this;
        }

        @JsonSetter(value = "earliest_acs_supported_version", nulls = Nulls.SKIP)
        public Builder earliestAcsSupportedVersion(Optional<String> earliestAcsSupportedVersion) {
            this.earliestAcsSupportedVersion = earliestAcsSupportedVersion;
            return this;
        }

        public Builder earliestAcsSupportedVersion(String earliestAcsSupportedVersion) {
            this.earliestAcsSupportedVersion = Optional.ofNullable(earliestAcsSupportedVersion);
            return this;
        }

        @JsonSetter(value = "earliest_ds_supported_version", nulls = Nulls.SKIP)
        public Builder earliestDsSupportedVersion(Optional<String> earliestDsSupportedVersion) {
            this.earliestDsSupportedVersion = earliestDsSupportedVersion;
            return this;
        }

        public Builder earliestDsSupportedVersion(String earliestDsSupportedVersion) {
            this.earliestDsSupportedVersion = Optional.ofNullable(earliestDsSupportedVersion);
            return this;
        }

        @JsonSetter(value = "latest_acs_supported_version", nulls = Nulls.SKIP)
        public Builder latestAcsSupportedVersion(Optional<String> latestAcsSupportedVersion) {
            this.latestAcsSupportedVersion = latestAcsSupportedVersion;
            return this;
        }

        public Builder latestAcsSupportedVersion(String latestAcsSupportedVersion) {
            this.latestAcsSupportedVersion = Optional.ofNullable(latestAcsSupportedVersion);
            return this;
        }

        @JsonSetter(value = "latest_ds_supported_version", nulls = Nulls.SKIP)
        public Builder latestDsSupportedVersion(Optional<String> latestDsSupportedVersion) {
            this.latestDsSupportedVersion = latestDsSupportedVersion;
            return this;
        }

        public Builder latestDsSupportedVersion(String latestDsSupportedVersion) {
            this.latestDsSupportedVersion = Optional.ofNullable(latestDsSupportedVersion);
            return this;
        }

        @JsonSetter(value = "acs_information", nulls = Nulls.SKIP)
        public Builder acsInformation(Optional<List<String>> acsInformation) {
            this.acsInformation = acsInformation;
            return this;
        }

        public Builder acsInformation(List<String> acsInformation) {
            this.acsInformation = Optional.ofNullable(acsInformation);
            return this;
        }

        public ThreeDsVersion build() {
            return new ThreeDsVersion(
                    recommendedVersion,
                    availableVersions,
                    earliestAcsSupportedVersion,
                    earliestDsSupportedVersion,
                    latestAcsSupportedVersion,
                    latestDsSupportedVersion,
                    acsInformation,
                    additionalProperties);
        }
    }
}

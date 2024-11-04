/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.types;

import com.basis.theory.api.core.ObjectMappers;
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
@JsonDeserialize(builder = CreateThreeDsSessionResponse.Builder.class)
public final class CreateThreeDsSessionResponse {
    private final Optional<String> id;

    private final Optional<String> type;

    private final Optional<String> cardBrand;

    private final Optional<String> methodUrl;

    private final Optional<String> methodNotificationUrl;

    private final Optional<String> directoryServerId;

    private final Optional<String> recommendedVersion;

    private final Map<String, Object> additionalProperties;

    private CreateThreeDsSessionResponse(
            Optional<String> id,
            Optional<String> type,
            Optional<String> cardBrand,
            Optional<String> methodUrl,
            Optional<String> methodNotificationUrl,
            Optional<String> directoryServerId,
            Optional<String> recommendedVersion,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.type = type;
        this.cardBrand = cardBrand;
        this.methodUrl = methodUrl;
        this.methodNotificationUrl = methodNotificationUrl;
        this.directoryServerId = directoryServerId;
        this.recommendedVersion = recommendedVersion;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    @JsonProperty("cardBrand")
    public Optional<String> getCardBrand() {
        return cardBrand;
    }

    @JsonProperty("method_url")
    public Optional<String> getMethodUrl() {
        return methodUrl;
    }

    @JsonProperty("method_notification_url")
    public Optional<String> getMethodNotificationUrl() {
        return methodNotificationUrl;
    }

    @JsonProperty("directory_server_id")
    public Optional<String> getDirectoryServerId() {
        return directoryServerId;
    }

    @JsonProperty("recommended_version")
    public Optional<String> getRecommendedVersion() {
        return recommendedVersion;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateThreeDsSessionResponse && equalTo((CreateThreeDsSessionResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateThreeDsSessionResponse other) {
        return id.equals(other.id)
                && type.equals(other.type)
                && cardBrand.equals(other.cardBrand)
                && methodUrl.equals(other.methodUrl)
                && methodNotificationUrl.equals(other.methodNotificationUrl)
                && directoryServerId.equals(other.directoryServerId)
                && recommendedVersion.equals(other.recommendedVersion);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.type,
                this.cardBrand,
                this.methodUrl,
                this.methodNotificationUrl,
                this.directoryServerId,
                this.recommendedVersion);
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
        private Optional<String> id = Optional.empty();

        private Optional<String> type = Optional.empty();

        private Optional<String> cardBrand = Optional.empty();

        private Optional<String> methodUrl = Optional.empty();

        private Optional<String> methodNotificationUrl = Optional.empty();

        private Optional<String> directoryServerId = Optional.empty();

        private Optional<String> recommendedVersion = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CreateThreeDsSessionResponse other) {
            id(other.getId());
            type(other.getType());
            cardBrand(other.getCardBrand());
            methodUrl(other.getMethodUrl());
            methodNotificationUrl(other.getMethodNotificationUrl());
            directoryServerId(other.getDirectoryServerId());
            recommendedVersion(other.getRecommendedVersion());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(String type) {
            this.type = Optional.ofNullable(type);
            return this;
        }

        @JsonSetter(value = "cardBrand", nulls = Nulls.SKIP)
        public Builder cardBrand(Optional<String> cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        public Builder cardBrand(String cardBrand) {
            this.cardBrand = Optional.ofNullable(cardBrand);
            return this;
        }

        @JsonSetter(value = "method_url", nulls = Nulls.SKIP)
        public Builder methodUrl(Optional<String> methodUrl) {
            this.methodUrl = methodUrl;
            return this;
        }

        public Builder methodUrl(String methodUrl) {
            this.methodUrl = Optional.ofNullable(methodUrl);
            return this;
        }

        @JsonSetter(value = "method_notification_url", nulls = Nulls.SKIP)
        public Builder methodNotificationUrl(Optional<String> methodNotificationUrl) {
            this.methodNotificationUrl = methodNotificationUrl;
            return this;
        }

        public Builder methodNotificationUrl(String methodNotificationUrl) {
            this.methodNotificationUrl = Optional.ofNullable(methodNotificationUrl);
            return this;
        }

        @JsonSetter(value = "directory_server_id", nulls = Nulls.SKIP)
        public Builder directoryServerId(Optional<String> directoryServerId) {
            this.directoryServerId = directoryServerId;
            return this;
        }

        public Builder directoryServerId(String directoryServerId) {
            this.directoryServerId = Optional.ofNullable(directoryServerId);
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

        public CreateThreeDsSessionResponse build() {
            return new CreateThreeDsSessionResponse(
                    id,
                    type,
                    cardBrand,
                    methodUrl,
                    methodNotificationUrl,
                    directoryServerId,
                    recommendedVersion,
                    additionalProperties);
        }
    }
}
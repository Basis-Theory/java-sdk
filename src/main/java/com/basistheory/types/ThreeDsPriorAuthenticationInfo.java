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
@JsonDeserialize(builder = ThreeDsPriorAuthenticationInfo.Builder.class)
public final class ThreeDsPriorAuthenticationInfo {
    private final Optional<String> method;

    private final Optional<String> timestamp;

    private final Optional<String> referenceId;

    private final Optional<String> data;

    private final Map<String, Object> additionalProperties;

    private ThreeDsPriorAuthenticationInfo(
            Optional<String> method,
            Optional<String> timestamp,
            Optional<String> referenceId,
            Optional<String> data,
            Map<String, Object> additionalProperties) {
        this.method = method;
        this.timestamp = timestamp;
        this.referenceId = referenceId;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("method")
    public Optional<String> getMethod() {
        return method;
    }

    @JsonProperty("timestamp")
    public Optional<String> getTimestamp() {
        return timestamp;
    }

    @JsonProperty("reference_id")
    public Optional<String> getReferenceId() {
        return referenceId;
    }

    @JsonProperty("data")
    public Optional<String> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThreeDsPriorAuthenticationInfo && equalTo((ThreeDsPriorAuthenticationInfo) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ThreeDsPriorAuthenticationInfo other) {
        return method.equals(other.method)
                && timestamp.equals(other.timestamp)
                && referenceId.equals(other.referenceId)
                && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.method, this.timestamp, this.referenceId, this.data);
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
        private Optional<String> method = Optional.empty();

        private Optional<String> timestamp = Optional.empty();

        private Optional<String> referenceId = Optional.empty();

        private Optional<String> data = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ThreeDsPriorAuthenticationInfo other) {
            method(other.getMethod());
            timestamp(other.getTimestamp());
            referenceId(other.getReferenceId());
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "method", nulls = Nulls.SKIP)
        public Builder method(Optional<String> method) {
            this.method = method;
            return this;
        }

        public Builder method(String method) {
            this.method = Optional.ofNullable(method);
            return this;
        }

        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public Builder timestamp(Optional<String> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder timestamp(String timestamp) {
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        @JsonSetter(value = "reference_id", nulls = Nulls.SKIP)
        public Builder referenceId(Optional<String> referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        public Builder referenceId(String referenceId) {
            this.referenceId = Optional.ofNullable(referenceId);
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<String> data) {
            this.data = data;
            return this;
        }

        public Builder data(String data) {
            this.data = Optional.ofNullable(data);
            return this;
        }

        public ThreeDsPriorAuthenticationInfo build() {
            return new ThreeDsPriorAuthenticationInfo(method, timestamp, referenceId, data, additionalProperties);
        }
    }
}

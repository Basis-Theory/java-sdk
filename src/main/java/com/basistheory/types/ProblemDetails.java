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
@JsonDeserialize(builder = ProblemDetails.Builder.class)
public final class ProblemDetails {
    private final Optional<String> type;

    private final Optional<String> title;

    private final Optional<Integer> status;

    private final Optional<String> detail;

    private final Optional<String> instance;

    private final Map<String, Object> additionalProperties;

    private ProblemDetails(
            Optional<String> type,
            Optional<String> title,
            Optional<Integer> status,
            Optional<String> detail,
            Optional<String> instance,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.title = title;
        this.status = status;
        this.detail = detail;
        this.instance = instance;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    @JsonProperty("status")
    public Optional<Integer> getStatus() {
        return status;
    }

    @JsonProperty("detail")
    public Optional<String> getDetail() {
        return detail;
    }

    @JsonProperty("instance")
    public Optional<String> getInstance() {
        return instance;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProblemDetails && equalTo((ProblemDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProblemDetails other) {
        return type.equals(other.type)
                && title.equals(other.title)
                && status.equals(other.status)
                && detail.equals(other.detail)
                && instance.equals(other.instance);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.title, this.status, this.detail, this.instance);
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
        private Optional<String> type = Optional.empty();

        private Optional<String> title = Optional.empty();

        private Optional<Integer> status = Optional.empty();

        private Optional<String> detail = Optional.empty();

        private Optional<String> instance = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ProblemDetails other) {
            type(other.getType());
            title(other.getTitle());
            status(other.getStatus());
            detail(other.getDetail());
            instance(other.getInstance());
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

        @JsonSetter(value = "title", nulls = Nulls.SKIP)
        public Builder title(Optional<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(String title) {
            this.title = Optional.ofNullable(title);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<Integer> status) {
            this.status = status;
            return this;
        }

        public Builder status(Integer status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        @JsonSetter(value = "detail", nulls = Nulls.SKIP)
        public Builder detail(Optional<String> detail) {
            this.detail = detail;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = Optional.ofNullable(detail);
            return this;
        }

        @JsonSetter(value = "instance", nulls = Nulls.SKIP)
        public Builder instance(Optional<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Optional.ofNullable(instance);
            return this;
        }

        public ProblemDetails build() {
            return new ProblemDetails(type, title, status, detail, instance, additionalProperties);
        }
    }
}

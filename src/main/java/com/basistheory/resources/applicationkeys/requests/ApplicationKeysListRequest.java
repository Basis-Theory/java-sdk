/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.applicationkeys.requests;

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
@JsonDeserialize(builder = ApplicationKeysListRequest.Builder.class)
public final class ApplicationKeysListRequest {
    private final Optional<String> id;

    private final Optional<String> type;

    private final Map<String, Object> additionalProperties;

    private ApplicationKeysListRequest(
            Optional<String> id, Optional<String> type, Map<String, Object> additionalProperties) {
        this.id = id;
        this.type = type;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApplicationKeysListRequest && equalTo((ApplicationKeysListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApplicationKeysListRequest other) {
        return id.equals(other.id) && type.equals(other.type);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.type);
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

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ApplicationKeysListRequest other) {
            id(other.getId());
            type(other.getType());
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

        public ApplicationKeysListRequest build() {
            return new ApplicationKeysListRequest(id, type, additionalProperties);
        }
    }
}
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
@JsonDeserialize(builder = GetTokensV2.Builder.class)
public final class GetTokensV2 {
    private final Optional<String> start;

    private final Optional<Integer> size;

    private final Map<String, Object> additionalProperties;

    private GetTokensV2(Optional<String> start, Optional<Integer> size, Map<String, Object> additionalProperties) {
        this.start = start;
        this.size = size;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("start")
    public Optional<String> getStart() {
        return start;
    }

    @JsonProperty("size")
    public Optional<Integer> getSize() {
        return size;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetTokensV2 && equalTo((GetTokensV2) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetTokensV2 other) {
        return start.equals(other.start) && size.equals(other.size);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.start, this.size);
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
        private Optional<String> start = Optional.empty();

        private Optional<Integer> size = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetTokensV2 other) {
            start(other.getStart());
            size(other.getSize());
            return this;
        }

        @JsonSetter(value = "start", nulls = Nulls.SKIP)
        public Builder start(Optional<String> start) {
            this.start = start;
            return this;
        }

        public Builder start(String start) {
            this.start = Optional.ofNullable(start);
            return this;
        }

        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public Builder size(Optional<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder size(Integer size) {
            this.size = Optional.ofNullable(size);
            return this;
        }

        public GetTokensV2 build() {
            return new GetTokensV2(start, size, additionalProperties);
        }
    }
}

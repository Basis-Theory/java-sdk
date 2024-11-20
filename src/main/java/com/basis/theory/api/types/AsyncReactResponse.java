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
@JsonDeserialize(builder = AsyncReactResponse.Builder.class)
public final class AsyncReactResponse {
    private final Optional<String> asyncReactorRequestId;

    private final Map<String, Object> additionalProperties;

    private AsyncReactResponse(Optional<String> asyncReactorRequestId, Map<String, Object> additionalProperties) {
        this.asyncReactorRequestId = asyncReactorRequestId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("asyncReactorRequestId")
    public Optional<String> getAsyncReactorRequestId() {
        return asyncReactorRequestId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AsyncReactResponse && equalTo((AsyncReactResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AsyncReactResponse other) {
        return asyncReactorRequestId.equals(other.asyncReactorRequestId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.asyncReactorRequestId);
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
        private Optional<String> asyncReactorRequestId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AsyncReactResponse other) {
            asyncReactorRequestId(other.getAsyncReactorRequestId());
            return this;
        }

        @JsonSetter(value = "asyncReactorRequestId", nulls = Nulls.SKIP)
        public Builder asyncReactorRequestId(Optional<String> asyncReactorRequestId) {
            this.asyncReactorRequestId = asyncReactorRequestId;
            return this;
        }

        public Builder asyncReactorRequestId(String asyncReactorRequestId) {
            this.asyncReactorRequestId = Optional.ofNullable(asyncReactorRequestId);
            return this;
        }

        public AsyncReactResponse build() {
            return new AsyncReactResponse(asyncReactorRequestId, additionalProperties);
        }
    }
}

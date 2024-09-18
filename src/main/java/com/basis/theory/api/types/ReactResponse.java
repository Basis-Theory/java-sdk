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
@JsonDeserialize(builder = ReactResponse.Builder.class)
public final class ReactResponse {
    private final Optional<Object> tokens;

    private final Optional<Object> raw;

    private final Optional<Object> body;

    private final Optional<Object> headers;

    private final Map<String, Object> additionalProperties;

    private ReactResponse(
            Optional<Object> tokens,
            Optional<Object> raw,
            Optional<Object> body,
            Optional<Object> headers,
            Map<String, Object> additionalProperties) {
        this.tokens = tokens;
        this.raw = raw;
        this.body = body;
        this.headers = headers;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("tokens")
    public Optional<Object> getTokens() {
        return tokens;
    }

    @JsonProperty("raw")
    public Optional<Object> getRaw() {
        return raw;
    }

    @JsonProperty("body")
    public Optional<Object> getBody() {
        return body;
    }

    @JsonProperty("headers")
    public Optional<Object> getHeaders() {
        return headers;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ReactResponse && equalTo((ReactResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ReactResponse other) {
        return tokens.equals(other.tokens)
                && raw.equals(other.raw)
                && body.equals(other.body)
                && headers.equals(other.headers);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.tokens, this.raw, this.body, this.headers);
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
        private Optional<Object> tokens = Optional.empty();

        private Optional<Object> raw = Optional.empty();

        private Optional<Object> body = Optional.empty();

        private Optional<Object> headers = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ReactResponse other) {
            tokens(other.getTokens());
            raw(other.getRaw());
            body(other.getBody());
            headers(other.getHeaders());
            return this;
        }

        @JsonSetter(value = "tokens", nulls = Nulls.SKIP)
        public Builder tokens(Optional<Object> tokens) {
            this.tokens = tokens;
            return this;
        }

        public Builder tokens(Object tokens) {
            this.tokens = Optional.ofNullable(tokens);
            return this;
        }

        @JsonSetter(value = "raw", nulls = Nulls.SKIP)
        public Builder raw(Optional<Object> raw) {
            this.raw = raw;
            return this;
        }

        public Builder raw(Object raw) {
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        @JsonSetter(value = "body", nulls = Nulls.SKIP)
        public Builder body(Optional<Object> body) {
            this.body = body;
            return this;
        }

        public Builder body(Object body) {
            this.body = Optional.ofNullable(body);
            return this;
        }

        @JsonSetter(value = "headers", nulls = Nulls.SKIP)
        public Builder headers(Optional<Object> headers) {
            this.headers = headers;
            return this;
        }

        public Builder headers(Object headers) {
            this.headers = Optional.ofNullable(headers);
            return this;
        }

        public ReactResponse build() {
            return new ReactResponse(tokens, raw, body, headers, additionalProperties);
        }
    }
}

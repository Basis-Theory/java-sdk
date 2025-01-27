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
@JsonDeserialize(builder = GooglePayTokenizeResponse.Builder.class)
public final class GooglePayTokenizeResponse {
    private final Optional<CreateTokenIntentResponse> tokenIntent;

    private final Map<String, Object> additionalProperties;

    private GooglePayTokenizeResponse(
            Optional<CreateTokenIntentResponse> tokenIntent, Map<String, Object> additionalProperties) {
        this.tokenIntent = tokenIntent;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("token_intent")
    public Optional<CreateTokenIntentResponse> getTokenIntent() {
        return tokenIntent;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GooglePayTokenizeResponse && equalTo((GooglePayTokenizeResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GooglePayTokenizeResponse other) {
        return tokenIntent.equals(other.tokenIntent);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.tokenIntent);
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
        private Optional<CreateTokenIntentResponse> tokenIntent = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GooglePayTokenizeResponse other) {
            tokenIntent(other.getTokenIntent());
            return this;
        }

        @JsonSetter(value = "token_intent", nulls = Nulls.SKIP)
        public Builder tokenIntent(Optional<CreateTokenIntentResponse> tokenIntent) {
            this.tokenIntent = tokenIntent;
            return this;
        }

        public Builder tokenIntent(CreateTokenIntentResponse tokenIntent) {
            this.tokenIntent = Optional.ofNullable(tokenIntent);
            return this;
        }

        public GooglePayTokenizeResponse build() {
            return new GooglePayTokenizeResponse(tokenIntent, additionalProperties);
        }
    }
}

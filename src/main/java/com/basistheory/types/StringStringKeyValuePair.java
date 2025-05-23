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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = StringStringKeyValuePair.Builder.class)
public final class StringStringKeyValuePair {
    private final String key;

    private final String value;

    private final Map<String, Object> additionalProperties;

    private StringStringKeyValuePair(String key, String value, Map<String, Object> additionalProperties) {
        this.key = key;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof StringStringKeyValuePair && equalTo((StringStringKeyValuePair) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(StringStringKeyValuePair other) {
        return key.equals(other.key) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        ValueStage key(@NotNull String key);

        Builder from(StringStringKeyValuePair other);
    }

    public interface ValueStage {
        _FinalStage value(@NotNull String value);
    }

    public interface _FinalStage {
        StringStringKeyValuePair build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, ValueStage, _FinalStage {
        private String key;

        private String value;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(StringStringKeyValuePair other) {
            key(other.getKey());
            value(other.getValue());
            return this;
        }

        @java.lang.Override
        @JsonSetter("key")
        public ValueStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(@NotNull String value) {
            this.value = Objects.requireNonNull(value, "value must not be null");
            return this;
        }

        @java.lang.Override
        public StringStringKeyValuePair build() {
            return new StringStringKeyValuePair(key, value, additionalProperties);
        }
    }
}

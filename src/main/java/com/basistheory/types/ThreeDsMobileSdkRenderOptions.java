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
@JsonDeserialize(builder = ThreeDsMobileSdkRenderOptions.Builder.class)
public final class ThreeDsMobileSdkRenderOptions {
    private final Optional<String> sdkInterface;

    private final Optional<List<String>> sdkUiType;

    private final Map<String, Object> additionalProperties;

    private ThreeDsMobileSdkRenderOptions(
            Optional<String> sdkInterface, Optional<List<String>> sdkUiType, Map<String, Object> additionalProperties) {
        this.sdkInterface = sdkInterface;
        this.sdkUiType = sdkUiType;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("sdk_interface")
    public Optional<String> getSdkInterface() {
        return sdkInterface;
    }

    @JsonProperty("sdk_ui_type")
    public Optional<List<String>> getSdkUiType() {
        return sdkUiType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThreeDsMobileSdkRenderOptions && equalTo((ThreeDsMobileSdkRenderOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ThreeDsMobileSdkRenderOptions other) {
        return sdkInterface.equals(other.sdkInterface) && sdkUiType.equals(other.sdkUiType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.sdkInterface, this.sdkUiType);
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
        private Optional<String> sdkInterface = Optional.empty();

        private Optional<List<String>> sdkUiType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ThreeDsMobileSdkRenderOptions other) {
            sdkInterface(other.getSdkInterface());
            sdkUiType(other.getSdkUiType());
            return this;
        }

        @JsonSetter(value = "sdk_interface", nulls = Nulls.SKIP)
        public Builder sdkInterface(Optional<String> sdkInterface) {
            this.sdkInterface = sdkInterface;
            return this;
        }

        public Builder sdkInterface(String sdkInterface) {
            this.sdkInterface = Optional.ofNullable(sdkInterface);
            return this;
        }

        @JsonSetter(value = "sdk_ui_type", nulls = Nulls.SKIP)
        public Builder sdkUiType(Optional<List<String>> sdkUiType) {
            this.sdkUiType = sdkUiType;
            return this;
        }

        public Builder sdkUiType(List<String> sdkUiType) {
            this.sdkUiType = Optional.ofNullable(sdkUiType);
            return this;
        }

        public ThreeDsMobileSdkRenderOptions build() {
            return new ThreeDsMobileSdkRenderOptions(sdkInterface, sdkUiType, additionalProperties);
        }
    }
}

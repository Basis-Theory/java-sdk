/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.tenants.members.requests;

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
@JsonDeserialize(builder = UpdateTenantMemberRequest.Builder.class)
public final class UpdateTenantMemberRequest {
    private final String role;

    private final Map<String, Object> additionalProperties;

    private UpdateTenantMemberRequest(String role, Map<String, Object> additionalProperties) {
        this.role = role;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateTenantMemberRequest && equalTo((UpdateTenantMemberRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateTenantMemberRequest other) {
        return role.equals(other.role);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.role);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoleStage builder() {
        return new Builder();
    }

    public interface RoleStage {
        _FinalStage role(@NotNull String role);

        Builder from(UpdateTenantMemberRequest other);
    }

    public interface _FinalStage {
        UpdateTenantMemberRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RoleStage, _FinalStage {
        private String role;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UpdateTenantMemberRequest other) {
            role(other.getRole());
            return this;
        }

        @java.lang.Override
        @JsonSetter("role")
        public _FinalStage role(@NotNull String role) {
            this.role = Objects.requireNonNull(role, "role must not be null");
            return this;
        }

        @java.lang.Override
        public UpdateTenantMemberRequest build() {
            return new UpdateTenantMemberRequest(role, additionalProperties);
        }
    }
}
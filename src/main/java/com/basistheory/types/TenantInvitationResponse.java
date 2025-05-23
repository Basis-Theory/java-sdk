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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TenantInvitationResponse.Builder.class)
public final class TenantInvitationResponse {
    private final Optional<String> id;

    private final Optional<String> tenantId;

    private final Optional<String> email;

    private final Optional<String> role;

    private final Optional<TenantInvitationStatus> status;

    private final Optional<OffsetDateTime> expiresAt;

    private final Optional<String> createdBy;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<String> modifiedBy;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Map<String, Object> additionalProperties;

    private TenantInvitationResponse(
            Optional<String> id,
            Optional<String> tenantId,
            Optional<String> email,
            Optional<String> role,
            Optional<TenantInvitationStatus> status,
            Optional<OffsetDateTime> expiresAt,
            Optional<String> createdBy,
            Optional<OffsetDateTime> createdAt,
            Optional<String> modifiedBy,
            Optional<OffsetDateTime> modifiedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.tenantId = tenantId;
        this.email = email;
        this.role = role;
        this.status = status;
        this.expiresAt = expiresAt;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.modifiedBy = modifiedBy;
        this.modifiedAt = modifiedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("tenant_id")
    public Optional<String> getTenantId() {
        return tenantId;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("role")
    public Optional<String> getRole() {
        return role;
    }

    @JsonProperty("status")
    public Optional<TenantInvitationStatus> getStatus() {
        return status;
    }

    @JsonProperty("expires_at")
    public Optional<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("created_by")
    public Optional<String> getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("modified_by")
    public Optional<String> getModifiedBy() {
        return modifiedBy;
    }

    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TenantInvitationResponse && equalTo((TenantInvitationResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TenantInvitationResponse other) {
        return id.equals(other.id)
                && tenantId.equals(other.tenantId)
                && email.equals(other.email)
                && role.equals(other.role)
                && status.equals(other.status)
                && expiresAt.equals(other.expiresAt)
                && createdBy.equals(other.createdBy)
                && createdAt.equals(other.createdAt)
                && modifiedBy.equals(other.modifiedBy)
                && modifiedAt.equals(other.modifiedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.tenantId,
                this.email,
                this.role,
                this.status,
                this.expiresAt,
                this.createdBy,
                this.createdAt,
                this.modifiedBy,
                this.modifiedAt);
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

        private Optional<String> tenantId = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Optional<String> role = Optional.empty();

        private Optional<TenantInvitationStatus> status = Optional.empty();

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        private Optional<String> createdBy = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> modifiedBy = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TenantInvitationResponse other) {
            id(other.getId());
            tenantId(other.getTenantId());
            email(other.getEmail());
            role(other.getRole());
            status(other.getStatus());
            expiresAt(other.getExpiresAt());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            modifiedBy(other.getModifiedBy());
            modifiedAt(other.getModifiedAt());
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

        @JsonSetter(value = "tenant_id", nulls = Nulls.SKIP)
        public Builder tenantId(Optional<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Optional.ofNullable(tenantId);
            return this;
        }

        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public Builder email(Optional<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(String email) {
            this.email = Optional.ofNullable(email);
            return this;
        }

        @JsonSetter(value = "role", nulls = Nulls.SKIP)
        public Builder role(Optional<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(String role) {
            this.role = Optional.ofNullable(role);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<TenantInvitationStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(TenantInvitationStatus status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        @JsonSetter(value = "expires_at", nulls = Nulls.SKIP)
        public Builder expiresAt(Optional<OffsetDateTime> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        @JsonSetter(value = "created_by", nulls = Nulls.SKIP)
        public Builder createdBy(Optional<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            this.createdBy = Optional.ofNullable(createdBy);
            return this;
        }

        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        @JsonSetter(value = "modified_by", nulls = Nulls.SKIP)
        public Builder modifiedBy(Optional<String> modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = Optional.ofNullable(modifiedBy);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.ofNullable(modifiedAt);
            return this;
        }

        public TenantInvitationResponse build() {
            return new TenantInvitationResponse(
                    id,
                    tenantId,
                    email,
                    role,
                    status,
                    expiresAt,
                    createdBy,
                    createdAt,
                    modifiedBy,
                    modifiedAt,
                    additionalProperties);
        }
    }
}

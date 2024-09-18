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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Application.Builder.class)
public final class Application {
    private final Optional<String> id;

    private final Optional<String> tenantId;

    private final Optional<String> name;

    private final Optional<String> key;

    private final Optional<List<ApplicationKey>> keys;

    private final Optional<String> type;

    private final Optional<String> createdBy;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<String> modifiedBy;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<OffsetDateTime> expiresAt;

    private final Optional<List<String>> permissions;

    private final Optional<List<AccessRule>> rules;

    private final Map<String, Object> additionalProperties;

    private Application(
            Optional<String> id,
            Optional<String> tenantId,
            Optional<String> name,
            Optional<String> key,
            Optional<List<ApplicationKey>> keys,
            Optional<String> type,
            Optional<String> createdBy,
            Optional<OffsetDateTime> createdAt,
            Optional<String> modifiedBy,
            Optional<OffsetDateTime> modifiedAt,
            Optional<OffsetDateTime> expiresAt,
            Optional<List<String>> permissions,
            Optional<List<AccessRule>> rules,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.tenantId = tenantId;
        this.name = name;
        this.key = key;
        this.keys = keys;
        this.type = type;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.modifiedBy = modifiedBy;
        this.modifiedAt = modifiedAt;
        this.expiresAt = expiresAt;
        this.permissions = permissions;
        this.rules = rules;
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

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("key")
    public Optional<String> getKey() {
        return key;
    }

    @JsonProperty("keys")
    public Optional<List<ApplicationKey>> getKeys() {
        return keys;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
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

    @JsonProperty("expires_at")
    public Optional<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("permissions")
    public Optional<List<String>> getPermissions() {
        return permissions;
    }

    @JsonProperty("rules")
    public Optional<List<AccessRule>> getRules() {
        return rules;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Application && equalTo((Application) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Application other) {
        return id.equals(other.id)
                && tenantId.equals(other.tenantId)
                && name.equals(other.name)
                && key.equals(other.key)
                && keys.equals(other.keys)
                && type.equals(other.type)
                && createdBy.equals(other.createdBy)
                && createdAt.equals(other.createdAt)
                && modifiedBy.equals(other.modifiedBy)
                && modifiedAt.equals(other.modifiedAt)
                && expiresAt.equals(other.expiresAt)
                && permissions.equals(other.permissions)
                && rules.equals(other.rules);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.tenantId,
                this.name,
                this.key,
                this.keys,
                this.type,
                this.createdBy,
                this.createdAt,
                this.modifiedBy,
                this.modifiedAt,
                this.expiresAt,
                this.permissions,
                this.rules);
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

        private Optional<String> name = Optional.empty();

        private Optional<String> key = Optional.empty();

        private Optional<List<ApplicationKey>> keys = Optional.empty();

        private Optional<String> type = Optional.empty();

        private Optional<String> createdBy = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> modifiedBy = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        private Optional<List<String>> permissions = Optional.empty();

        private Optional<List<AccessRule>> rules = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Application other) {
            id(other.getId());
            tenantId(other.getTenantId());
            name(other.getName());
            key(other.getKey());
            keys(other.getKeys());
            type(other.getType());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            modifiedBy(other.getModifiedBy());
            modifiedAt(other.getModifiedAt());
            expiresAt(other.getExpiresAt());
            permissions(other.getPermissions());
            rules(other.getRules());
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

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "key", nulls = Nulls.SKIP)
        public Builder key(Optional<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(String key) {
            this.key = Optional.ofNullable(key);
            return this;
        }

        @JsonSetter(value = "keys", nulls = Nulls.SKIP)
        public Builder keys(Optional<List<ApplicationKey>> keys) {
            this.keys = keys;
            return this;
        }

        public Builder keys(List<ApplicationKey> keys) {
            this.keys = Optional.ofNullable(keys);
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

        @JsonSetter(value = "expires_at", nulls = Nulls.SKIP)
        public Builder expiresAt(Optional<OffsetDateTime> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        @JsonSetter(value = "permissions", nulls = Nulls.SKIP)
        public Builder permissions(Optional<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(List<String> permissions) {
            this.permissions = Optional.ofNullable(permissions);
            return this;
        }

        @JsonSetter(value = "rules", nulls = Nulls.SKIP)
        public Builder rules(Optional<List<AccessRule>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(List<AccessRule> rules) {
            this.rules = Optional.ofNullable(rules);
            return this;
        }

        public Application build() {
            return new Application(
                    id,
                    tenantId,
                    name,
                    key,
                    keys,
                    type,
                    createdBy,
                    createdAt,
                    modifiedBy,
                    modifiedAt,
                    expiresAt,
                    permissions,
                    rules,
                    additionalProperties);
        }
    }
}

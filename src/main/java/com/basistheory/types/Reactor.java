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
@JsonDeserialize(builder = Reactor.Builder.class)
public final class Reactor {
    private final Optional<String> id;

    private final Optional<String> tenantId;

    private final Optional<String> name;

    private final Optional<ReactorFormula> formula;

    private final Optional<String> code;

    private final Optional<Application> application;

    private final Optional<String> createdBy;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<String> modifiedBy;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, Optional<String>>> configuration;

    private final Map<String, Object> additionalProperties;

    private Reactor(
            Optional<String> id,
            Optional<String> tenantId,
            Optional<String> name,
            Optional<ReactorFormula> formula,
            Optional<String> code,
            Optional<Application> application,
            Optional<String> createdBy,
            Optional<OffsetDateTime> createdAt,
            Optional<String> modifiedBy,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, Optional<String>>> configuration,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.tenantId = tenantId;
        this.name = name;
        this.formula = formula;
        this.code = code;
        this.application = application;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.modifiedBy = modifiedBy;
        this.modifiedAt = modifiedAt;
        this.configuration = configuration;
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

    @JsonProperty("formula")
    public Optional<ReactorFormula> getFormula() {
        return formula;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @JsonProperty("application")
    public Optional<Application> getApplication() {
        return application;
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

    @JsonProperty("configuration")
    public Optional<Map<String, Optional<String>>> getConfiguration() {
        return configuration;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Reactor && equalTo((Reactor) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Reactor other) {
        return id.equals(other.id)
                && tenantId.equals(other.tenantId)
                && name.equals(other.name)
                && formula.equals(other.formula)
                && code.equals(other.code)
                && application.equals(other.application)
                && createdBy.equals(other.createdBy)
                && createdAt.equals(other.createdAt)
                && modifiedBy.equals(other.modifiedBy)
                && modifiedAt.equals(other.modifiedAt)
                && configuration.equals(other.configuration);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.tenantId,
                this.name,
                this.formula,
                this.code,
                this.application,
                this.createdBy,
                this.createdAt,
                this.modifiedBy,
                this.modifiedAt,
                this.configuration);
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

        private Optional<ReactorFormula> formula = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<Application> application = Optional.empty();

        private Optional<String> createdBy = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> modifiedBy = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, Optional<String>>> configuration = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Reactor other) {
            id(other.getId());
            tenantId(other.getTenantId());
            name(other.getName());
            formula(other.getFormula());
            code(other.getCode());
            application(other.getApplication());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            modifiedBy(other.getModifiedBy());
            modifiedAt(other.getModifiedAt());
            configuration(other.getConfiguration());
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

        @JsonSetter(value = "formula", nulls = Nulls.SKIP)
        public Builder formula(Optional<ReactorFormula> formula) {
            this.formula = formula;
            return this;
        }

        public Builder formula(ReactorFormula formula) {
            this.formula = Optional.ofNullable(formula);
            return this;
        }

        @JsonSetter(value = "code", nulls = Nulls.SKIP)
        public Builder code(Optional<String> code) {
            this.code = code;
            return this;
        }

        public Builder code(String code) {
            this.code = Optional.ofNullable(code);
            return this;
        }

        @JsonSetter(value = "application", nulls = Nulls.SKIP)
        public Builder application(Optional<Application> application) {
            this.application = application;
            return this;
        }

        public Builder application(Application application) {
            this.application = Optional.ofNullable(application);
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

        @JsonSetter(value = "configuration", nulls = Nulls.SKIP)
        public Builder configuration(Optional<Map<String, Optional<String>>> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configuration(Map<String, Optional<String>> configuration) {
            this.configuration = Optional.ofNullable(configuration);
            return this;
        }

        public Reactor build() {
            return new Reactor(
                    id,
                    tenantId,
                    name,
                    formula,
                    code,
                    application,
                    createdBy,
                    createdAt,
                    modifiedBy,
                    modifiedAt,
                    configuration,
                    additionalProperties);
        }
    }
}

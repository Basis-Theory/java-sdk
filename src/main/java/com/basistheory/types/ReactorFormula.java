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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ReactorFormula.Builder.class)
public final class ReactorFormula {
    private final Optional<String> id;

    private final Optional<String> type;

    private final Optional<String> status;

    private final Optional<String> name;

    private final Optional<String> description;

    private final Optional<String> icon;

    private final Optional<String> code;

    private final Optional<String> createdBy;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<String> modifiedBy;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<List<ReactorFormulaConfiguration>> configuration;

    private final Optional<List<ReactorFormulaRequestParameter>> requestParameters;

    private final Map<String, Object> additionalProperties;

    private ReactorFormula(
            Optional<String> id,
            Optional<String> type,
            Optional<String> status,
            Optional<String> name,
            Optional<String> description,
            Optional<String> icon,
            Optional<String> code,
            Optional<String> createdBy,
            Optional<OffsetDateTime> createdAt,
            Optional<String> modifiedBy,
            Optional<OffsetDateTime> modifiedAt,
            Optional<List<ReactorFormulaConfiguration>> configuration,
            Optional<List<ReactorFormulaRequestParameter>> requestParameters,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.code = code;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.modifiedBy = modifiedBy;
        this.modifiedAt = modifiedAt;
        this.configuration = configuration;
        this.requestParameters = requestParameters;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("icon")
    public Optional<String> getIcon() {
        return icon;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
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
    public Optional<List<ReactorFormulaConfiguration>> getConfiguration() {
        return configuration;
    }

    @JsonProperty("request_parameters")
    public Optional<List<ReactorFormulaRequestParameter>> getRequestParameters() {
        return requestParameters;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ReactorFormula && equalTo((ReactorFormula) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ReactorFormula other) {
        return id.equals(other.id)
                && type.equals(other.type)
                && status.equals(other.status)
                && name.equals(other.name)
                && description.equals(other.description)
                && icon.equals(other.icon)
                && code.equals(other.code)
                && createdBy.equals(other.createdBy)
                && createdAt.equals(other.createdAt)
                && modifiedBy.equals(other.modifiedBy)
                && modifiedAt.equals(other.modifiedAt)
                && configuration.equals(other.configuration)
                && requestParameters.equals(other.requestParameters);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.type,
                this.status,
                this.name,
                this.description,
                this.icon,
                this.code,
                this.createdBy,
                this.createdAt,
                this.modifiedBy,
                this.modifiedAt,
                this.configuration,
                this.requestParameters);
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

        private Optional<String> type = Optional.empty();

        private Optional<String> status = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> icon = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> createdBy = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> modifiedBy = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<List<ReactorFormulaConfiguration>> configuration = Optional.empty();

        private Optional<List<ReactorFormulaRequestParameter>> requestParameters = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ReactorFormula other) {
            id(other.getId());
            type(other.getType());
            status(other.getStatus());
            name(other.getName());
            description(other.getDescription());
            icon(other.getIcon());
            code(other.getCode());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            modifiedBy(other.getModifiedBy());
            modifiedAt(other.getModifiedAt());
            configuration(other.getConfiguration());
            requestParameters(other.getRequestParameters());
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

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(String type) {
            this.type = Optional.ofNullable(type);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(String status) {
            this.status = Optional.ofNullable(status);
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

        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @JsonSetter(value = "icon", nulls = Nulls.SKIP)
        public Builder icon(Optional<String> icon) {
            this.icon = icon;
            return this;
        }

        public Builder icon(String icon) {
            this.icon = Optional.ofNullable(icon);
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
        public Builder configuration(Optional<List<ReactorFormulaConfiguration>> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configuration(List<ReactorFormulaConfiguration> configuration) {
            this.configuration = Optional.ofNullable(configuration);
            return this;
        }

        @JsonSetter(value = "request_parameters", nulls = Nulls.SKIP)
        public Builder requestParameters(Optional<List<ReactorFormulaRequestParameter>> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        public Builder requestParameters(List<ReactorFormulaRequestParameter> requestParameters) {
            this.requestParameters = Optional.ofNullable(requestParameters);
            return this;
        }

        public ReactorFormula build() {
            return new ReactorFormula(
                    id,
                    type,
                    status,
                    name,
                    description,
                    icon,
                    code,
                    createdBy,
                    createdAt,
                    modifiedBy,
                    modifiedAt,
                    configuration,
                    requestParameters,
                    additionalProperties);
        }
    }
}

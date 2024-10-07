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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Webhook.Builder.class)
public final class Webhook {
    private final String id;

    private final String tenantId;

    private final WebhookStatus status;

    private final String name;

    private final String url;

    private final List<String> events;

    private final String createdBy;

    private final OffsetDateTime createdAt;

    private final Optional<String> modifiedBy;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Map<String, Object> additionalProperties;

    private Webhook(
            String id,
            String tenantId,
            WebhookStatus status,
            String name,
            String url,
            List<String> events,
            String createdBy,
            OffsetDateTime createdAt,
            Optional<String> modifiedBy,
            Optional<OffsetDateTime> modifiedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.tenantId = tenantId;
        this.status = status;
        this.name = name;
        this.url = url;
        this.events = events;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.modifiedBy = modifiedBy;
        this.modifiedAt = modifiedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("tenant_id")
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("status")
    public WebhookStatus getStatus() {
        return status;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    @JsonProperty("created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
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
        return other instanceof Webhook && equalTo((Webhook) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Webhook other) {
        return id.equals(other.id)
                && tenantId.equals(other.tenantId)
                && status.equals(other.status)
                && name.equals(other.name)
                && url.equals(other.url)
                && events.equals(other.events)
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
                this.status,
                this.name,
                this.url,
                this.events,
                this.createdBy,
                this.createdAt,
                this.modifiedBy,
                this.modifiedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        TenantIdStage id(@NotNull String id);

        Builder from(Webhook other);
    }

    public interface TenantIdStage {
        StatusStage tenantId(@NotNull String tenantId);
    }

    public interface StatusStage {
        NameStage status(@NotNull WebhookStatus status);
    }

    public interface NameStage {
        UrlStage name(@NotNull String name);
    }

    public interface UrlStage {
        CreatedByStage url(@NotNull String url);
    }

    public interface CreatedByStage {
        CreatedAtStage createdBy(@NotNull String createdBy);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        Webhook build();

        _FinalStage events(List<String> events);

        _FinalStage addEvents(String events);

        _FinalStage addAllEvents(List<String> events);

        _FinalStage modifiedBy(Optional<String> modifiedBy);

        _FinalStage modifiedBy(String modifiedBy);

        _FinalStage modifiedAt(Optional<OffsetDateTime> modifiedAt);

        _FinalStage modifiedAt(OffsetDateTime modifiedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    TenantIdStage,
                    StatusStage,
                    NameStage,
                    UrlStage,
                    CreatedByStage,
                    CreatedAtStage,
                    _FinalStage {
        private String id;

        private String tenantId;

        private WebhookStatus status;

        private String name;

        private String url;

        private String createdBy;

        private OffsetDateTime createdAt;

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<String> modifiedBy = Optional.empty();

        private List<String> events = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Webhook other) {
            id(other.getId());
            tenantId(other.getTenantId());
            status(other.getStatus());
            name(other.getName());
            url(other.getUrl());
            events(other.getEvents());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            modifiedBy(other.getModifiedBy());
            modifiedAt(other.getModifiedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public TenantIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("tenant_id")
        public StatusStage tenantId(@NotNull String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId, "tenantId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public NameStage status(@NotNull WebhookStatus status) {
            this.status = Objects.requireNonNull(status, "status must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public UrlStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("url")
        public CreatedByStage url(@NotNull String url) {
            this.url = Objects.requireNonNull(url, "url must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("created_by")
        public CreatedAtStage createdBy(@NotNull String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy, "createdBy must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("created_at")
        public _FinalStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.ofNullable(modifiedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public _FinalStage modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage modifiedBy(String modifiedBy) {
            this.modifiedBy = Optional.ofNullable(modifiedBy);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "modified_by", nulls = Nulls.SKIP)
        public _FinalStage modifiedBy(Optional<String> modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllEvents(List<String> events) {
            this.events.addAll(events);
            return this;
        }

        @java.lang.Override
        public _FinalStage addEvents(String events) {
            this.events.add(events);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "events", nulls = Nulls.SKIP)
        public _FinalStage events(List<String> events) {
            this.events.clear();
            this.events.addAll(events);
            return this;
        }

        @java.lang.Override
        public Webhook build() {
            return new Webhook(
                    id,
                    tenantId,
                    status,
                    name,
                    url,
                    events,
                    createdBy,
                    createdAt,
                    modifiedBy,
                    modifiedAt,
                    additionalProperties);
        }
    }
}

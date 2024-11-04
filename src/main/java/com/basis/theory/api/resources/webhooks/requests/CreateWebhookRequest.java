/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.resources.webhooks.requests;

import com.basis.theory.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreateWebhookRequest.Builder.class)
public final class CreateWebhookRequest {
    private final String name;

    private final String url;

    private final Optional<String> notifyEmail;

    private final List<String> events;

    private final Map<String, Object> additionalProperties;

    private CreateWebhookRequest(
            String name,
            String url,
            Optional<String> notifyEmail,
            List<String> events,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.url = url;
        this.notifyEmail = notifyEmail;
        this.events = events;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The name of the webhook
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The URL to which the webhook will send events
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @return The email address to use for management notification events. Ie: webhook disabled
     */
    @JsonProperty("notify_email")
    public Optional<String> getNotifyEmail() {
        return notifyEmail;
    }

    /**
     * @return An array of event types that the webhook will listen for
     */
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateWebhookRequest && equalTo((CreateWebhookRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateWebhookRequest other) {
        return name.equals(other.name)
                && url.equals(other.url)
                && notifyEmail.equals(other.notifyEmail)
                && events.equals(other.events);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.url, this.notifyEmail, this.events);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        UrlStage name(@NotNull String name);

        Builder from(CreateWebhookRequest other);
    }

    public interface UrlStage {
        _FinalStage url(@NotNull String url);
    }

    public interface _FinalStage {
        CreateWebhookRequest build();

        _FinalStage notifyEmail(Optional<String> notifyEmail);

        _FinalStage notifyEmail(String notifyEmail);

        _FinalStage events(List<String> events);

        _FinalStage addEvents(String events);

        _FinalStage addAllEvents(List<String> events);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, UrlStage, _FinalStage {
        private String name;

        private String url;

        private List<String> events = new ArrayList<>();

        private Optional<String> notifyEmail = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateWebhookRequest other) {
            name(other.getName());
            url(other.getUrl());
            notifyEmail(other.getNotifyEmail());
            events(other.getEvents());
            return this;
        }

        /**
         * <p>The name of the webhook</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public UrlStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>The URL to which the webhook will send events</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("url")
        public _FinalStage url(@NotNull String url) {
            this.url = Objects.requireNonNull(url, "url must not be null");
            return this;
        }

        /**
         * <p>An array of event types that the webhook will listen for</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllEvents(List<String> events) {
            this.events.addAll(events);
            return this;
        }

        /**
         * <p>An array of event types that the webhook will listen for</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
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

        /**
         * <p>The email address to use for management notification events. Ie: webhook disabled</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage notifyEmail(String notifyEmail) {
            this.notifyEmail = Optional.ofNullable(notifyEmail);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "notify_email", nulls = Nulls.SKIP)
        public _FinalStage notifyEmail(Optional<String> notifyEmail) {
            this.notifyEmail = notifyEmail;
            return this;
        }

        @java.lang.Override
        public CreateWebhookRequest build() {
            return new CreateWebhookRequest(name, url, notifyEmail, events, additionalProperties);
        }
    }
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.reactors.requests;

import com.basistheory.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ReactorsListRequest.Builder.class)
public final class ReactorsListRequest {
    private final Optional<List<String>> id;

    private final Optional<String> name;

    private final Optional<Integer> page;

    private final Optional<String> start;

    private final Optional<Integer> size;

    private final Map<String, Object> additionalProperties;

    private ReactorsListRequest(
            Optional<List<String>> id,
            Optional<String> name,
            Optional<Integer> page,
            Optional<String> start,
            Optional<Integer> size,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.page = page;
        this.start = start;
        this.size = size;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<List<String>> getId() {
        return id;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("page")
    public Optional<Integer> getPage() {
        return page;
    }

    @JsonProperty("start")
    public Optional<String> getStart() {
        return start;
    }

    @JsonProperty("size")
    public Optional<Integer> getSize() {
        return size;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ReactorsListRequest && equalTo((ReactorsListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ReactorsListRequest other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && page.equals(other.page)
                && start.equals(other.start)
                && size.equals(other.size);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.page, this.start, this.size);
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
        private Optional<List<String>> id = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Integer> page = Optional.empty();

        private Optional<String> start = Optional.empty();

        private Optional<Integer> size = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ReactorsListRequest other) {
            id(other.getId());
            name(other.getName());
            page(other.getPage());
            start(other.getStart());
            size(other.getSize());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<List<String>> id) {
            this.id = id;
            return this;
        }

        public Builder id(List<String> id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(Collections.singletonList(id));
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

        @JsonSetter(value = "page", nulls = Nulls.SKIP)
        public Builder page(Optional<Integer> page) {
            this.page = page;
            return this;
        }

        public Builder page(Integer page) {
            this.page = Optional.ofNullable(page);
            return this;
        }

        @JsonSetter(value = "start", nulls = Nulls.SKIP)
        public Builder start(Optional<String> start) {
            this.start = start;
            return this;
        }

        public Builder start(String start) {
            this.start = Optional.ofNullable(start);
            return this;
        }

        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public Builder size(Optional<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder size(Integer size) {
            this.size = Optional.ofNullable(size);
            return this;
        }

        public ReactorsListRequest build() {
            return new ReactorsListRequest(id, name, page, start, size, additionalProperties);
        }
    }
}

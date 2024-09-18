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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TokenPaginatedList.Builder.class)
public final class TokenPaginatedList {
    private final Optional<Pagination> pagination;

    private final Optional<List<Token>> data;

    private final Map<String, Object> additionalProperties;

    private TokenPaginatedList(
            Optional<Pagination> pagination, Optional<List<Token>> data, Map<String, Object> additionalProperties) {
        this.pagination = pagination;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("pagination")
    public Optional<Pagination> getPagination() {
        return pagination;
    }

    @JsonProperty("data")
    public Optional<List<Token>> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TokenPaginatedList && equalTo((TokenPaginatedList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TokenPaginatedList other) {
        return pagination.equals(other.pagination) && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.pagination, this.data);
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
        private Optional<Pagination> pagination = Optional.empty();

        private Optional<List<Token>> data = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TokenPaginatedList other) {
            pagination(other.getPagination());
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "pagination", nulls = Nulls.SKIP)
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = Optional.ofNullable(pagination);
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<List<Token>> data) {
            this.data = data;
            return this;
        }

        public Builder data(List<Token> data) {
            this.data = Optional.ofNullable(data);
            return this;
        }

        public TokenPaginatedList build() {
            return new TokenPaginatedList(pagination, data, additionalProperties);
        }
    }
}

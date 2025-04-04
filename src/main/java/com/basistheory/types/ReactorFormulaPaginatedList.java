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
@JsonDeserialize(builder = ReactorFormulaPaginatedList.Builder.class)
public final class ReactorFormulaPaginatedList {
    private final Optional<Pagination> pagination;

    private final Optional<List<ReactorFormula>> data;

    private final Map<String, Object> additionalProperties;

    private ReactorFormulaPaginatedList(
            Optional<Pagination> pagination,
            Optional<List<ReactorFormula>> data,
            Map<String, Object> additionalProperties) {
        this.pagination = pagination;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("pagination")
    public Optional<Pagination> getPagination() {
        return pagination;
    }

    @JsonProperty("data")
    public Optional<List<ReactorFormula>> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ReactorFormulaPaginatedList && equalTo((ReactorFormulaPaginatedList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ReactorFormulaPaginatedList other) {
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

        private Optional<List<ReactorFormula>> data = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ReactorFormulaPaginatedList other) {
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
        public Builder data(Optional<List<ReactorFormula>> data) {
            this.data = data;
            return this;
        }

        public Builder data(List<ReactorFormula> data) {
            this.data = Optional.ofNullable(data);
            return this;
        }

        public ReactorFormulaPaginatedList build() {
            return new ReactorFormulaPaginatedList(pagination, data, additionalProperties);
        }
    }
}

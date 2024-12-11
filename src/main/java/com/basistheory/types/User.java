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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = User.Builder.class)
public final class User {
    private final Optional<String> id;

    private final Optional<String> email;

    private final Optional<String> provider;

    private final Optional<Boolean> mfaEnrolled;

    private final Optional<String> firstName;

    private final Optional<String> lastName;

    private final Optional<String> picture;

    private final Map<String, Object> additionalProperties;

    private User(
            Optional<String> id,
            Optional<String> email,
            Optional<String> provider,
            Optional<Boolean> mfaEnrolled,
            Optional<String> firstName,
            Optional<String> lastName,
            Optional<String> picture,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.email = email;
        this.provider = provider;
        this.mfaEnrolled = mfaEnrolled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    @JsonProperty("mfa_enrolled")
    public Optional<Boolean> getMfaEnrolled() {
        return mfaEnrolled;
    }

    @JsonProperty("first_name")
    public Optional<String> getFirstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public Optional<String> getLastName() {
        return lastName;
    }

    @JsonProperty("picture")
    public Optional<String> getPicture() {
        return picture;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof User && equalTo((User) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(User other) {
        return id.equals(other.id)
                && email.equals(other.email)
                && provider.equals(other.provider)
                && mfaEnrolled.equals(other.mfaEnrolled)
                && firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && picture.equals(other.picture);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.email, this.provider, this.mfaEnrolled, this.firstName, this.lastName, this.picture);
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

        private Optional<String> email = Optional.empty();

        private Optional<String> provider = Optional.empty();

        private Optional<Boolean> mfaEnrolled = Optional.empty();

        private Optional<String> firstName = Optional.empty();

        private Optional<String> lastName = Optional.empty();

        private Optional<String> picture = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(User other) {
            id(other.getId());
            email(other.getEmail());
            provider(other.getProvider());
            mfaEnrolled(other.getMfaEnrolled());
            firstName(other.getFirstName());
            lastName(other.getLastName());
            picture(other.getPicture());
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

        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public Builder email(Optional<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(String email) {
            this.email = Optional.ofNullable(email);
            return this;
        }

        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public Builder provider(Optional<String> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(String provider) {
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        @JsonSetter(value = "mfa_enrolled", nulls = Nulls.SKIP)
        public Builder mfaEnrolled(Optional<Boolean> mfaEnrolled) {
            this.mfaEnrolled = mfaEnrolled;
            return this;
        }

        public Builder mfaEnrolled(Boolean mfaEnrolled) {
            this.mfaEnrolled = Optional.ofNullable(mfaEnrolled);
            return this;
        }

        @JsonSetter(value = "first_name", nulls = Nulls.SKIP)
        public Builder firstName(Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        @JsonSetter(value = "last_name", nulls = Nulls.SKIP)
        public Builder lastName(Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        @JsonSetter(value = "picture", nulls = Nulls.SKIP)
        public Builder picture(Optional<String> picture) {
            this.picture = picture;
            return this;
        }

        public Builder picture(String picture) {
            this.picture = Optional.ofNullable(picture);
            return this;
        }

        public User build() {
            return new User(id, email, provider, mfaEnrolled, firstName, lastName, picture, additionalProperties);
        }
    }
}
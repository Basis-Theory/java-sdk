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
@JsonDeserialize(builder = Token.Builder.class)
public final class Token {
    private final Optional<String> id;

    private final Optional<String> type;

    private final Optional<String> tenantId;

    private final Optional<Object> data;

    private final Optional<Map<String, Optional<String>>> metadata;

    private final Optional<TokenEnrichments> enrichments;

    private final Optional<String> createdBy;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<CardDetails> card;

    private final Optional<BankDetails> bank;

    private final Optional<CardDetails> networkToken;

    private final Optional<String> modifiedBy;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<String> fingerprint;

    private final Optional<String> fingerprintExpression;

    private final Optional<Object> mask;

    private final Optional<Privacy> privacy;

    private final Optional<List<String>> searchIndexes;

    private final Optional<OffsetDateTime> expiresAt;

    private final Optional<List<String>> containers;

    private final Optional<List<String>> aliases;

    private final Optional<Object> authentication;

    private final Optional<TokenExtras> extras;

    private final Map<String, Object> additionalProperties;

    private Token(
            Optional<String> id,
            Optional<String> type,
            Optional<String> tenantId,
            Optional<Object> data,
            Optional<Map<String, Optional<String>>> metadata,
            Optional<TokenEnrichments> enrichments,
            Optional<String> createdBy,
            Optional<OffsetDateTime> createdAt,
            Optional<CardDetails> card,
            Optional<BankDetails> bank,
            Optional<CardDetails> networkToken,
            Optional<String> modifiedBy,
            Optional<OffsetDateTime> modifiedAt,
            Optional<String> fingerprint,
            Optional<String> fingerprintExpression,
            Optional<Object> mask,
            Optional<Privacy> privacy,
            Optional<List<String>> searchIndexes,
            Optional<OffsetDateTime> expiresAt,
            Optional<List<String>> containers,
            Optional<List<String>> aliases,
            Optional<Object> authentication,
            Optional<TokenExtras> extras,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.type = type;
        this.tenantId = tenantId;
        this.data = data;
        this.metadata = metadata;
        this.enrichments = enrichments;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.card = card;
        this.bank = bank;
        this.networkToken = networkToken;
        this.modifiedBy = modifiedBy;
        this.modifiedAt = modifiedAt;
        this.fingerprint = fingerprint;
        this.fingerprintExpression = fingerprintExpression;
        this.mask = mask;
        this.privacy = privacy;
        this.searchIndexes = searchIndexes;
        this.expiresAt = expiresAt;
        this.containers = containers;
        this.aliases = aliases;
        this.authentication = authentication;
        this.extras = extras;
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

    @JsonProperty("tenant_id")
    public Optional<String> getTenantId() {
        return tenantId;
    }

    @JsonProperty("data")
    public Optional<Object> getData() {
        return data;
    }

    @JsonProperty("metadata")
    public Optional<Map<String, Optional<String>>> getMetadata() {
        return metadata;
    }

    @JsonProperty("enrichments")
    public Optional<TokenEnrichments> getEnrichments() {
        return enrichments;
    }

    @JsonProperty("created_by")
    public Optional<String> getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("card")
    public Optional<CardDetails> getCard() {
        return card;
    }

    @JsonProperty("bank")
    public Optional<BankDetails> getBank() {
        return bank;
    }

    @JsonProperty("network_token")
    public Optional<CardDetails> getNetworkToken() {
        return networkToken;
    }

    @JsonProperty("modified_by")
    public Optional<String> getModifiedBy() {
        return modifiedBy;
    }

    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("fingerprint")
    public Optional<String> getFingerprint() {
        return fingerprint;
    }

    @JsonProperty("fingerprint_expression")
    public Optional<String> getFingerprintExpression() {
        return fingerprintExpression;
    }

    @JsonProperty("mask")
    public Optional<Object> getMask() {
        return mask;
    }

    @JsonProperty("privacy")
    public Optional<Privacy> getPrivacy() {
        return privacy;
    }

    @JsonProperty("search_indexes")
    public Optional<List<String>> getSearchIndexes() {
        return searchIndexes;
    }

    @JsonProperty("expires_at")
    public Optional<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("containers")
    public Optional<List<String>> getContainers() {
        return containers;
    }

    @JsonProperty("aliases")
    public Optional<List<String>> getAliases() {
        return aliases;
    }

    @JsonProperty("authentication")
    public Optional<Object> getAuthentication() {
        return authentication;
    }

    @JsonProperty("_extras")
    public Optional<TokenExtras> getExtras() {
        return extras;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Token && equalTo((Token) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Token other) {
        return id.equals(other.id)
                && type.equals(other.type)
                && tenantId.equals(other.tenantId)
                && data.equals(other.data)
                && metadata.equals(other.metadata)
                && enrichments.equals(other.enrichments)
                && createdBy.equals(other.createdBy)
                && createdAt.equals(other.createdAt)
                && card.equals(other.card)
                && bank.equals(other.bank)
                && networkToken.equals(other.networkToken)
                && modifiedBy.equals(other.modifiedBy)
                && modifiedAt.equals(other.modifiedAt)
                && fingerprint.equals(other.fingerprint)
                && fingerprintExpression.equals(other.fingerprintExpression)
                && mask.equals(other.mask)
                && privacy.equals(other.privacy)
                && searchIndexes.equals(other.searchIndexes)
                && expiresAt.equals(other.expiresAt)
                && containers.equals(other.containers)
                && aliases.equals(other.aliases)
                && authentication.equals(other.authentication)
                && extras.equals(other.extras);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.type,
                this.tenantId,
                this.data,
                this.metadata,
                this.enrichments,
                this.createdBy,
                this.createdAt,
                this.card,
                this.bank,
                this.networkToken,
                this.modifiedBy,
                this.modifiedAt,
                this.fingerprint,
                this.fingerprintExpression,
                this.mask,
                this.privacy,
                this.searchIndexes,
                this.expiresAt,
                this.containers,
                this.aliases,
                this.authentication,
                this.extras);
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

        private Optional<String> tenantId = Optional.empty();

        private Optional<Object> data = Optional.empty();

        private Optional<Map<String, Optional<String>>> metadata = Optional.empty();

        private Optional<TokenEnrichments> enrichments = Optional.empty();

        private Optional<String> createdBy = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<CardDetails> card = Optional.empty();

        private Optional<BankDetails> bank = Optional.empty();

        private Optional<CardDetails> networkToken = Optional.empty();

        private Optional<String> modifiedBy = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<String> fingerprint = Optional.empty();

        private Optional<String> fingerprintExpression = Optional.empty();

        private Optional<Object> mask = Optional.empty();

        private Optional<Privacy> privacy = Optional.empty();

        private Optional<List<String>> searchIndexes = Optional.empty();

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        private Optional<List<String>> containers = Optional.empty();

        private Optional<List<String>> aliases = Optional.empty();

        private Optional<Object> authentication = Optional.empty();

        private Optional<TokenExtras> extras = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Token other) {
            id(other.getId());
            type(other.getType());
            tenantId(other.getTenantId());
            data(other.getData());
            metadata(other.getMetadata());
            enrichments(other.getEnrichments());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            card(other.getCard());
            bank(other.getBank());
            networkToken(other.getNetworkToken());
            modifiedBy(other.getModifiedBy());
            modifiedAt(other.getModifiedAt());
            fingerprint(other.getFingerprint());
            fingerprintExpression(other.getFingerprintExpression());
            mask(other.getMask());
            privacy(other.getPrivacy());
            searchIndexes(other.getSearchIndexes());
            expiresAt(other.getExpiresAt());
            containers(other.getContainers());
            aliases(other.getAliases());
            authentication(other.getAuthentication());
            extras(other.getExtras());
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

        @JsonSetter(value = "tenant_id", nulls = Nulls.SKIP)
        public Builder tenantId(Optional<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Optional.ofNullable(tenantId);
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<Object> data) {
            this.data = data;
            return this;
        }

        public Builder data(Object data) {
            this.data = Optional.ofNullable(data);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Map<String, Optional<String>>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String, Optional<String>> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "enrichments", nulls = Nulls.SKIP)
        public Builder enrichments(Optional<TokenEnrichments> enrichments) {
            this.enrichments = enrichments;
            return this;
        }

        public Builder enrichments(TokenEnrichments enrichments) {
            this.enrichments = Optional.ofNullable(enrichments);
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

        @JsonSetter(value = "card", nulls = Nulls.SKIP)
        public Builder card(Optional<CardDetails> card) {
            this.card = card;
            return this;
        }

        public Builder card(CardDetails card) {
            this.card = Optional.ofNullable(card);
            return this;
        }

        @JsonSetter(value = "bank", nulls = Nulls.SKIP)
        public Builder bank(Optional<BankDetails> bank) {
            this.bank = bank;
            return this;
        }

        public Builder bank(BankDetails bank) {
            this.bank = Optional.ofNullable(bank);
            return this;
        }

        @JsonSetter(value = "network_token", nulls = Nulls.SKIP)
        public Builder networkToken(Optional<CardDetails> networkToken) {
            this.networkToken = networkToken;
            return this;
        }

        public Builder networkToken(CardDetails networkToken) {
            this.networkToken = Optional.ofNullable(networkToken);
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

        @JsonSetter(value = "fingerprint", nulls = Nulls.SKIP)
        public Builder fingerprint(Optional<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Optional.ofNullable(fingerprint);
            return this;
        }

        @JsonSetter(value = "fingerprint_expression", nulls = Nulls.SKIP)
        public Builder fingerprintExpression(Optional<String> fingerprintExpression) {
            this.fingerprintExpression = fingerprintExpression;
            return this;
        }

        public Builder fingerprintExpression(String fingerprintExpression) {
            this.fingerprintExpression = Optional.ofNullable(fingerprintExpression);
            return this;
        }

        @JsonSetter(value = "mask", nulls = Nulls.SKIP)
        public Builder mask(Optional<Object> mask) {
            this.mask = mask;
            return this;
        }

        public Builder mask(Object mask) {
            this.mask = Optional.ofNullable(mask);
            return this;
        }

        @JsonSetter(value = "privacy", nulls = Nulls.SKIP)
        public Builder privacy(Optional<Privacy> privacy) {
            this.privacy = privacy;
            return this;
        }

        public Builder privacy(Privacy privacy) {
            this.privacy = Optional.ofNullable(privacy);
            return this;
        }

        @JsonSetter(value = "search_indexes", nulls = Nulls.SKIP)
        public Builder searchIndexes(Optional<List<String>> searchIndexes) {
            this.searchIndexes = searchIndexes;
            return this;
        }

        public Builder searchIndexes(List<String> searchIndexes) {
            this.searchIndexes = Optional.ofNullable(searchIndexes);
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

        @JsonSetter(value = "containers", nulls = Nulls.SKIP)
        public Builder containers(Optional<List<String>> containers) {
            this.containers = containers;
            return this;
        }

        public Builder containers(List<String> containers) {
            this.containers = Optional.ofNullable(containers);
            return this;
        }

        @JsonSetter(value = "aliases", nulls = Nulls.SKIP)
        public Builder aliases(Optional<List<String>> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder aliases(List<String> aliases) {
            this.aliases = Optional.ofNullable(aliases);
            return this;
        }

        @JsonSetter(value = "authentication", nulls = Nulls.SKIP)
        public Builder authentication(Optional<Object> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder authentication(Object authentication) {
            this.authentication = Optional.ofNullable(authentication);
            return this;
        }

        @JsonSetter(value = "_extras", nulls = Nulls.SKIP)
        public Builder extras(Optional<TokenExtras> extras) {
            this.extras = extras;
            return this;
        }

        public Builder extras(TokenExtras extras) {
            this.extras = Optional.ofNullable(extras);
            return this;
        }

        public Token build() {
            return new Token(
                    id,
                    type,
                    tenantId,
                    data,
                    metadata,
                    enrichments,
                    createdBy,
                    createdAt,
                    card,
                    bank,
                    networkToken,
                    modifiedBy,
                    modifiedAt,
                    fingerprint,
                    fingerprintExpression,
                    mask,
                    privacy,
                    searchIndexes,
                    expiresAt,
                    containers,
                    aliases,
                    authentication,
                    extras,
                    additionalProperties);
        }
    }
}

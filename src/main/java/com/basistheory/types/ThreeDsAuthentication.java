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
@JsonDeserialize(builder = ThreeDsAuthentication.Builder.class)
public final class ThreeDsAuthentication {
    private final Optional<String> panTokenId;

    private final Optional<String> tokenId;

    private final Optional<String> tokenIntentId;

    private final Optional<String> threedsVersion;

    private final Optional<String> acsTransactionId;

    private final Optional<String> dsTransactionId;

    private final Optional<String> sdkTransactionId;

    private final Optional<String> acsReferenceNumber;

    private final Optional<String> dsReferenceNumber;

    private final Optional<String> authenticationValue;

    private final Optional<String> authenticationStatus;

    private final Optional<String> authenticationStatusCode;

    private final Optional<String> authenticationStatusReason;

    private final Optional<String> eci;

    private final Optional<String> acsChallengeMandated;

    private final Optional<String> acsDecoupledAuthentication;

    private final Optional<String> authenticationChallengeType;

    private final Optional<ThreeDsAcsRenderingType> acsRenderingType;

    private final Optional<String> acsSignedContent;

    private final Optional<String> acsChallengeUrl;

    private final Optional<String> challengePreference;

    private final Optional<String> challengePreferenceCode;

    private final Optional<String> challengeAttempts;

    private final Optional<String> challengeCancelReason;

    private final Optional<String> challengeCancelReasonCode;

    private final Optional<String> cardholderInfo;

    private final Optional<String> whitelistStatus;

    private final Optional<String> whitelistStatusSource;

    private final Optional<List<ThreeDsMessageExtension>> messageExtensions;

    private final Map<String, Object> additionalProperties;

    private ThreeDsAuthentication(
            Optional<String> panTokenId,
            Optional<String> tokenId,
            Optional<String> tokenIntentId,
            Optional<String> threedsVersion,
            Optional<String> acsTransactionId,
            Optional<String> dsTransactionId,
            Optional<String> sdkTransactionId,
            Optional<String> acsReferenceNumber,
            Optional<String> dsReferenceNumber,
            Optional<String> authenticationValue,
            Optional<String> authenticationStatus,
            Optional<String> authenticationStatusCode,
            Optional<String> authenticationStatusReason,
            Optional<String> eci,
            Optional<String> acsChallengeMandated,
            Optional<String> acsDecoupledAuthentication,
            Optional<String> authenticationChallengeType,
            Optional<ThreeDsAcsRenderingType> acsRenderingType,
            Optional<String> acsSignedContent,
            Optional<String> acsChallengeUrl,
            Optional<String> challengePreference,
            Optional<String> challengePreferenceCode,
            Optional<String> challengeAttempts,
            Optional<String> challengeCancelReason,
            Optional<String> challengeCancelReasonCode,
            Optional<String> cardholderInfo,
            Optional<String> whitelistStatus,
            Optional<String> whitelistStatusSource,
            Optional<List<ThreeDsMessageExtension>> messageExtensions,
            Map<String, Object> additionalProperties) {
        this.panTokenId = panTokenId;
        this.tokenId = tokenId;
        this.tokenIntentId = tokenIntentId;
        this.threedsVersion = threedsVersion;
        this.acsTransactionId = acsTransactionId;
        this.dsTransactionId = dsTransactionId;
        this.sdkTransactionId = sdkTransactionId;
        this.acsReferenceNumber = acsReferenceNumber;
        this.dsReferenceNumber = dsReferenceNumber;
        this.authenticationValue = authenticationValue;
        this.authenticationStatus = authenticationStatus;
        this.authenticationStatusCode = authenticationStatusCode;
        this.authenticationStatusReason = authenticationStatusReason;
        this.eci = eci;
        this.acsChallengeMandated = acsChallengeMandated;
        this.acsDecoupledAuthentication = acsDecoupledAuthentication;
        this.authenticationChallengeType = authenticationChallengeType;
        this.acsRenderingType = acsRenderingType;
        this.acsSignedContent = acsSignedContent;
        this.acsChallengeUrl = acsChallengeUrl;
        this.challengePreference = challengePreference;
        this.challengePreferenceCode = challengePreferenceCode;
        this.challengeAttempts = challengeAttempts;
        this.challengeCancelReason = challengeCancelReason;
        this.challengeCancelReasonCode = challengeCancelReasonCode;
        this.cardholderInfo = cardholderInfo;
        this.whitelistStatus = whitelistStatus;
        this.whitelistStatusSource = whitelistStatusSource;
        this.messageExtensions = messageExtensions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("pan_token_id")
    public Optional<String> getPanTokenId() {
        return panTokenId;
    }

    @JsonProperty("token_id")
    public Optional<String> getTokenId() {
        return tokenId;
    }

    @JsonProperty("token_intent_id")
    public Optional<String> getTokenIntentId() {
        return tokenIntentId;
    }

    @JsonProperty("threeds_version")
    public Optional<String> getThreedsVersion() {
        return threedsVersion;
    }

    @JsonProperty("acs_transaction_id")
    public Optional<String> getAcsTransactionId() {
        return acsTransactionId;
    }

    @JsonProperty("ds_transaction_id")
    public Optional<String> getDsTransactionId() {
        return dsTransactionId;
    }

    @JsonProperty("sdk_transaction_id")
    public Optional<String> getSdkTransactionId() {
        return sdkTransactionId;
    }

    @JsonProperty("acs_reference_number")
    public Optional<String> getAcsReferenceNumber() {
        return acsReferenceNumber;
    }

    @JsonProperty("ds_reference_number")
    public Optional<String> getDsReferenceNumber() {
        return dsReferenceNumber;
    }

    @JsonProperty("authentication_value")
    public Optional<String> getAuthenticationValue() {
        return authenticationValue;
    }

    @JsonProperty("authentication_status")
    public Optional<String> getAuthenticationStatus() {
        return authenticationStatus;
    }

    @JsonProperty("authentication_status_code")
    public Optional<String> getAuthenticationStatusCode() {
        return authenticationStatusCode;
    }

    @JsonProperty("authentication_status_reason")
    public Optional<String> getAuthenticationStatusReason() {
        return authenticationStatusReason;
    }

    @JsonProperty("eci")
    public Optional<String> getEci() {
        return eci;
    }

    @JsonProperty("acs_challenge_mandated")
    public Optional<String> getAcsChallengeMandated() {
        return acsChallengeMandated;
    }

    @JsonProperty("acs_decoupled_authentication")
    public Optional<String> getAcsDecoupledAuthentication() {
        return acsDecoupledAuthentication;
    }

    @JsonProperty("authentication_challenge_type")
    public Optional<String> getAuthenticationChallengeType() {
        return authenticationChallengeType;
    }

    @JsonProperty("acs_rendering_type")
    public Optional<ThreeDsAcsRenderingType> getAcsRenderingType() {
        return acsRenderingType;
    }

    @JsonProperty("acs_signed_content")
    public Optional<String> getAcsSignedContent() {
        return acsSignedContent;
    }

    @JsonProperty("acs_challenge_url")
    public Optional<String> getAcsChallengeUrl() {
        return acsChallengeUrl;
    }

    @JsonProperty("challenge_preference")
    public Optional<String> getChallengePreference() {
        return challengePreference;
    }

    @JsonProperty("challenge_preference_code")
    public Optional<String> getChallengePreferenceCode() {
        return challengePreferenceCode;
    }

    @JsonProperty("challenge_attempts")
    public Optional<String> getChallengeAttempts() {
        return challengeAttempts;
    }

    @JsonProperty("challenge_cancel_reason")
    public Optional<String> getChallengeCancelReason() {
        return challengeCancelReason;
    }

    @JsonProperty("challenge_cancel_reason_code")
    public Optional<String> getChallengeCancelReasonCode() {
        return challengeCancelReasonCode;
    }

    @JsonProperty("cardholder_info")
    public Optional<String> getCardholderInfo() {
        return cardholderInfo;
    }

    @JsonProperty("whitelist_status")
    public Optional<String> getWhitelistStatus() {
        return whitelistStatus;
    }

    @JsonProperty("whitelist_status_source")
    public Optional<String> getWhitelistStatusSource() {
        return whitelistStatusSource;
    }

    @JsonProperty("message_extensions")
    public Optional<List<ThreeDsMessageExtension>> getMessageExtensions() {
        return messageExtensions;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThreeDsAuthentication && equalTo((ThreeDsAuthentication) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ThreeDsAuthentication other) {
        return panTokenId.equals(other.panTokenId)
                && tokenId.equals(other.tokenId)
                && tokenIntentId.equals(other.tokenIntentId)
                && threedsVersion.equals(other.threedsVersion)
                && acsTransactionId.equals(other.acsTransactionId)
                && dsTransactionId.equals(other.dsTransactionId)
                && sdkTransactionId.equals(other.sdkTransactionId)
                && acsReferenceNumber.equals(other.acsReferenceNumber)
                && dsReferenceNumber.equals(other.dsReferenceNumber)
                && authenticationValue.equals(other.authenticationValue)
                && authenticationStatus.equals(other.authenticationStatus)
                && authenticationStatusCode.equals(other.authenticationStatusCode)
                && authenticationStatusReason.equals(other.authenticationStatusReason)
                && eci.equals(other.eci)
                && acsChallengeMandated.equals(other.acsChallengeMandated)
                && acsDecoupledAuthentication.equals(other.acsDecoupledAuthentication)
                && authenticationChallengeType.equals(other.authenticationChallengeType)
                && acsRenderingType.equals(other.acsRenderingType)
                && acsSignedContent.equals(other.acsSignedContent)
                && acsChallengeUrl.equals(other.acsChallengeUrl)
                && challengePreference.equals(other.challengePreference)
                && challengePreferenceCode.equals(other.challengePreferenceCode)
                && challengeAttempts.equals(other.challengeAttempts)
                && challengeCancelReason.equals(other.challengeCancelReason)
                && challengeCancelReasonCode.equals(other.challengeCancelReasonCode)
                && cardholderInfo.equals(other.cardholderInfo)
                && whitelistStatus.equals(other.whitelistStatus)
                && whitelistStatusSource.equals(other.whitelistStatusSource)
                && messageExtensions.equals(other.messageExtensions);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.panTokenId,
                this.tokenId,
                this.tokenIntentId,
                this.threedsVersion,
                this.acsTransactionId,
                this.dsTransactionId,
                this.sdkTransactionId,
                this.acsReferenceNumber,
                this.dsReferenceNumber,
                this.authenticationValue,
                this.authenticationStatus,
                this.authenticationStatusCode,
                this.authenticationStatusReason,
                this.eci,
                this.acsChallengeMandated,
                this.acsDecoupledAuthentication,
                this.authenticationChallengeType,
                this.acsRenderingType,
                this.acsSignedContent,
                this.acsChallengeUrl,
                this.challengePreference,
                this.challengePreferenceCode,
                this.challengeAttempts,
                this.challengeCancelReason,
                this.challengeCancelReasonCode,
                this.cardholderInfo,
                this.whitelistStatus,
                this.whitelistStatusSource,
                this.messageExtensions);
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
        private Optional<String> panTokenId = Optional.empty();

        private Optional<String> tokenId = Optional.empty();

        private Optional<String> tokenIntentId = Optional.empty();

        private Optional<String> threedsVersion = Optional.empty();

        private Optional<String> acsTransactionId = Optional.empty();

        private Optional<String> dsTransactionId = Optional.empty();

        private Optional<String> sdkTransactionId = Optional.empty();

        private Optional<String> acsReferenceNumber = Optional.empty();

        private Optional<String> dsReferenceNumber = Optional.empty();

        private Optional<String> authenticationValue = Optional.empty();

        private Optional<String> authenticationStatus = Optional.empty();

        private Optional<String> authenticationStatusCode = Optional.empty();

        private Optional<String> authenticationStatusReason = Optional.empty();

        private Optional<String> eci = Optional.empty();

        private Optional<String> acsChallengeMandated = Optional.empty();

        private Optional<String> acsDecoupledAuthentication = Optional.empty();

        private Optional<String> authenticationChallengeType = Optional.empty();

        private Optional<ThreeDsAcsRenderingType> acsRenderingType = Optional.empty();

        private Optional<String> acsSignedContent = Optional.empty();

        private Optional<String> acsChallengeUrl = Optional.empty();

        private Optional<String> challengePreference = Optional.empty();

        private Optional<String> challengePreferenceCode = Optional.empty();

        private Optional<String> challengeAttempts = Optional.empty();

        private Optional<String> challengeCancelReason = Optional.empty();

        private Optional<String> challengeCancelReasonCode = Optional.empty();

        private Optional<String> cardholderInfo = Optional.empty();

        private Optional<String> whitelistStatus = Optional.empty();

        private Optional<String> whitelistStatusSource = Optional.empty();

        private Optional<List<ThreeDsMessageExtension>> messageExtensions = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ThreeDsAuthentication other) {
            panTokenId(other.getPanTokenId());
            tokenId(other.getTokenId());
            tokenIntentId(other.getTokenIntentId());
            threedsVersion(other.getThreedsVersion());
            acsTransactionId(other.getAcsTransactionId());
            dsTransactionId(other.getDsTransactionId());
            sdkTransactionId(other.getSdkTransactionId());
            acsReferenceNumber(other.getAcsReferenceNumber());
            dsReferenceNumber(other.getDsReferenceNumber());
            authenticationValue(other.getAuthenticationValue());
            authenticationStatus(other.getAuthenticationStatus());
            authenticationStatusCode(other.getAuthenticationStatusCode());
            authenticationStatusReason(other.getAuthenticationStatusReason());
            eci(other.getEci());
            acsChallengeMandated(other.getAcsChallengeMandated());
            acsDecoupledAuthentication(other.getAcsDecoupledAuthentication());
            authenticationChallengeType(other.getAuthenticationChallengeType());
            acsRenderingType(other.getAcsRenderingType());
            acsSignedContent(other.getAcsSignedContent());
            acsChallengeUrl(other.getAcsChallengeUrl());
            challengePreference(other.getChallengePreference());
            challengePreferenceCode(other.getChallengePreferenceCode());
            challengeAttempts(other.getChallengeAttempts());
            challengeCancelReason(other.getChallengeCancelReason());
            challengeCancelReasonCode(other.getChallengeCancelReasonCode());
            cardholderInfo(other.getCardholderInfo());
            whitelistStatus(other.getWhitelistStatus());
            whitelistStatusSource(other.getWhitelistStatusSource());
            messageExtensions(other.getMessageExtensions());
            return this;
        }

        @JsonSetter(value = "pan_token_id", nulls = Nulls.SKIP)
        public Builder panTokenId(Optional<String> panTokenId) {
            this.panTokenId = panTokenId;
            return this;
        }

        public Builder panTokenId(String panTokenId) {
            this.panTokenId = Optional.ofNullable(panTokenId);
            return this;
        }

        @JsonSetter(value = "token_id", nulls = Nulls.SKIP)
        public Builder tokenId(Optional<String> tokenId) {
            this.tokenId = tokenId;
            return this;
        }

        public Builder tokenId(String tokenId) {
            this.tokenId = Optional.ofNullable(tokenId);
            return this;
        }

        @JsonSetter(value = "token_intent_id", nulls = Nulls.SKIP)
        public Builder tokenIntentId(Optional<String> tokenIntentId) {
            this.tokenIntentId = tokenIntentId;
            return this;
        }

        public Builder tokenIntentId(String tokenIntentId) {
            this.tokenIntentId = Optional.ofNullable(tokenIntentId);
            return this;
        }

        @JsonSetter(value = "threeds_version", nulls = Nulls.SKIP)
        public Builder threedsVersion(Optional<String> threedsVersion) {
            this.threedsVersion = threedsVersion;
            return this;
        }

        public Builder threedsVersion(String threedsVersion) {
            this.threedsVersion = Optional.ofNullable(threedsVersion);
            return this;
        }

        @JsonSetter(value = "acs_transaction_id", nulls = Nulls.SKIP)
        public Builder acsTransactionId(Optional<String> acsTransactionId) {
            this.acsTransactionId = acsTransactionId;
            return this;
        }

        public Builder acsTransactionId(String acsTransactionId) {
            this.acsTransactionId = Optional.ofNullable(acsTransactionId);
            return this;
        }

        @JsonSetter(value = "ds_transaction_id", nulls = Nulls.SKIP)
        public Builder dsTransactionId(Optional<String> dsTransactionId) {
            this.dsTransactionId = dsTransactionId;
            return this;
        }

        public Builder dsTransactionId(String dsTransactionId) {
            this.dsTransactionId = Optional.ofNullable(dsTransactionId);
            return this;
        }

        @JsonSetter(value = "sdk_transaction_id", nulls = Nulls.SKIP)
        public Builder sdkTransactionId(Optional<String> sdkTransactionId) {
            this.sdkTransactionId = sdkTransactionId;
            return this;
        }

        public Builder sdkTransactionId(String sdkTransactionId) {
            this.sdkTransactionId = Optional.ofNullable(sdkTransactionId);
            return this;
        }

        @JsonSetter(value = "acs_reference_number", nulls = Nulls.SKIP)
        public Builder acsReferenceNumber(Optional<String> acsReferenceNumber) {
            this.acsReferenceNumber = acsReferenceNumber;
            return this;
        }

        public Builder acsReferenceNumber(String acsReferenceNumber) {
            this.acsReferenceNumber = Optional.ofNullable(acsReferenceNumber);
            return this;
        }

        @JsonSetter(value = "ds_reference_number", nulls = Nulls.SKIP)
        public Builder dsReferenceNumber(Optional<String> dsReferenceNumber) {
            this.dsReferenceNumber = dsReferenceNumber;
            return this;
        }

        public Builder dsReferenceNumber(String dsReferenceNumber) {
            this.dsReferenceNumber = Optional.ofNullable(dsReferenceNumber);
            return this;
        }

        @JsonSetter(value = "authentication_value", nulls = Nulls.SKIP)
        public Builder authenticationValue(Optional<String> authenticationValue) {
            this.authenticationValue = authenticationValue;
            return this;
        }

        public Builder authenticationValue(String authenticationValue) {
            this.authenticationValue = Optional.ofNullable(authenticationValue);
            return this;
        }

        @JsonSetter(value = "authentication_status", nulls = Nulls.SKIP)
        public Builder authenticationStatus(Optional<String> authenticationStatus) {
            this.authenticationStatus = authenticationStatus;
            return this;
        }

        public Builder authenticationStatus(String authenticationStatus) {
            this.authenticationStatus = Optional.ofNullable(authenticationStatus);
            return this;
        }

        @JsonSetter(value = "authentication_status_code", nulls = Nulls.SKIP)
        public Builder authenticationStatusCode(Optional<String> authenticationStatusCode) {
            this.authenticationStatusCode = authenticationStatusCode;
            return this;
        }

        public Builder authenticationStatusCode(String authenticationStatusCode) {
            this.authenticationStatusCode = Optional.ofNullable(authenticationStatusCode);
            return this;
        }

        @JsonSetter(value = "authentication_status_reason", nulls = Nulls.SKIP)
        public Builder authenticationStatusReason(Optional<String> authenticationStatusReason) {
            this.authenticationStatusReason = authenticationStatusReason;
            return this;
        }

        public Builder authenticationStatusReason(String authenticationStatusReason) {
            this.authenticationStatusReason = Optional.ofNullable(authenticationStatusReason);
            return this;
        }

        @JsonSetter(value = "eci", nulls = Nulls.SKIP)
        public Builder eci(Optional<String> eci) {
            this.eci = eci;
            return this;
        }

        public Builder eci(String eci) {
            this.eci = Optional.ofNullable(eci);
            return this;
        }

        @JsonSetter(value = "acs_challenge_mandated", nulls = Nulls.SKIP)
        public Builder acsChallengeMandated(Optional<String> acsChallengeMandated) {
            this.acsChallengeMandated = acsChallengeMandated;
            return this;
        }

        public Builder acsChallengeMandated(String acsChallengeMandated) {
            this.acsChallengeMandated = Optional.ofNullable(acsChallengeMandated);
            return this;
        }

        @JsonSetter(value = "acs_decoupled_authentication", nulls = Nulls.SKIP)
        public Builder acsDecoupledAuthentication(Optional<String> acsDecoupledAuthentication) {
            this.acsDecoupledAuthentication = acsDecoupledAuthentication;
            return this;
        }

        public Builder acsDecoupledAuthentication(String acsDecoupledAuthentication) {
            this.acsDecoupledAuthentication = Optional.ofNullable(acsDecoupledAuthentication);
            return this;
        }

        @JsonSetter(value = "authentication_challenge_type", nulls = Nulls.SKIP)
        public Builder authenticationChallengeType(Optional<String> authenticationChallengeType) {
            this.authenticationChallengeType = authenticationChallengeType;
            return this;
        }

        public Builder authenticationChallengeType(String authenticationChallengeType) {
            this.authenticationChallengeType = Optional.ofNullable(authenticationChallengeType);
            return this;
        }

        @JsonSetter(value = "acs_rendering_type", nulls = Nulls.SKIP)
        public Builder acsRenderingType(Optional<ThreeDsAcsRenderingType> acsRenderingType) {
            this.acsRenderingType = acsRenderingType;
            return this;
        }

        public Builder acsRenderingType(ThreeDsAcsRenderingType acsRenderingType) {
            this.acsRenderingType = Optional.ofNullable(acsRenderingType);
            return this;
        }

        @JsonSetter(value = "acs_signed_content", nulls = Nulls.SKIP)
        public Builder acsSignedContent(Optional<String> acsSignedContent) {
            this.acsSignedContent = acsSignedContent;
            return this;
        }

        public Builder acsSignedContent(String acsSignedContent) {
            this.acsSignedContent = Optional.ofNullable(acsSignedContent);
            return this;
        }

        @JsonSetter(value = "acs_challenge_url", nulls = Nulls.SKIP)
        public Builder acsChallengeUrl(Optional<String> acsChallengeUrl) {
            this.acsChallengeUrl = acsChallengeUrl;
            return this;
        }

        public Builder acsChallengeUrl(String acsChallengeUrl) {
            this.acsChallengeUrl = Optional.ofNullable(acsChallengeUrl);
            return this;
        }

        @JsonSetter(value = "challenge_preference", nulls = Nulls.SKIP)
        public Builder challengePreference(Optional<String> challengePreference) {
            this.challengePreference = challengePreference;
            return this;
        }

        public Builder challengePreference(String challengePreference) {
            this.challengePreference = Optional.ofNullable(challengePreference);
            return this;
        }

        @JsonSetter(value = "challenge_preference_code", nulls = Nulls.SKIP)
        public Builder challengePreferenceCode(Optional<String> challengePreferenceCode) {
            this.challengePreferenceCode = challengePreferenceCode;
            return this;
        }

        public Builder challengePreferenceCode(String challengePreferenceCode) {
            this.challengePreferenceCode = Optional.ofNullable(challengePreferenceCode);
            return this;
        }

        @JsonSetter(value = "challenge_attempts", nulls = Nulls.SKIP)
        public Builder challengeAttempts(Optional<String> challengeAttempts) {
            this.challengeAttempts = challengeAttempts;
            return this;
        }

        public Builder challengeAttempts(String challengeAttempts) {
            this.challengeAttempts = Optional.ofNullable(challengeAttempts);
            return this;
        }

        @JsonSetter(value = "challenge_cancel_reason", nulls = Nulls.SKIP)
        public Builder challengeCancelReason(Optional<String> challengeCancelReason) {
            this.challengeCancelReason = challengeCancelReason;
            return this;
        }

        public Builder challengeCancelReason(String challengeCancelReason) {
            this.challengeCancelReason = Optional.ofNullable(challengeCancelReason);
            return this;
        }

        @JsonSetter(value = "challenge_cancel_reason_code", nulls = Nulls.SKIP)
        public Builder challengeCancelReasonCode(Optional<String> challengeCancelReasonCode) {
            this.challengeCancelReasonCode = challengeCancelReasonCode;
            return this;
        }

        public Builder challengeCancelReasonCode(String challengeCancelReasonCode) {
            this.challengeCancelReasonCode = Optional.ofNullable(challengeCancelReasonCode);
            return this;
        }

        @JsonSetter(value = "cardholder_info", nulls = Nulls.SKIP)
        public Builder cardholderInfo(Optional<String> cardholderInfo) {
            this.cardholderInfo = cardholderInfo;
            return this;
        }

        public Builder cardholderInfo(String cardholderInfo) {
            this.cardholderInfo = Optional.ofNullable(cardholderInfo);
            return this;
        }

        @JsonSetter(value = "whitelist_status", nulls = Nulls.SKIP)
        public Builder whitelistStatus(Optional<String> whitelistStatus) {
            this.whitelistStatus = whitelistStatus;
            return this;
        }

        public Builder whitelistStatus(String whitelistStatus) {
            this.whitelistStatus = Optional.ofNullable(whitelistStatus);
            return this;
        }

        @JsonSetter(value = "whitelist_status_source", nulls = Nulls.SKIP)
        public Builder whitelistStatusSource(Optional<String> whitelistStatusSource) {
            this.whitelistStatusSource = whitelistStatusSource;
            return this;
        }

        public Builder whitelistStatusSource(String whitelistStatusSource) {
            this.whitelistStatusSource = Optional.ofNullable(whitelistStatusSource);
            return this;
        }

        @JsonSetter(value = "message_extensions", nulls = Nulls.SKIP)
        public Builder messageExtensions(Optional<List<ThreeDsMessageExtension>> messageExtensions) {
            this.messageExtensions = messageExtensions;
            return this;
        }

        public Builder messageExtensions(List<ThreeDsMessageExtension> messageExtensions) {
            this.messageExtensions = Optional.ofNullable(messageExtensions);
            return this;
        }

        public ThreeDsAuthentication build() {
            return new ThreeDsAuthentication(
                    panTokenId,
                    tokenId,
                    tokenIntentId,
                    threedsVersion,
                    acsTransactionId,
                    dsTransactionId,
                    sdkTransactionId,
                    acsReferenceNumber,
                    dsReferenceNumber,
                    authenticationValue,
                    authenticationStatus,
                    authenticationStatusCode,
                    authenticationStatusReason,
                    eci,
                    acsChallengeMandated,
                    acsDecoupledAuthentication,
                    authenticationChallengeType,
                    acsRenderingType,
                    acsSignedContent,
                    acsChallengeUrl,
                    challengePreference,
                    challengePreferenceCode,
                    challengeAttempts,
                    challengeCancelReason,
                    challengeCancelReasonCode,
                    cardholderInfo,
                    whitelistStatus,
                    whitelistStatusSource,
                    messageExtensions,
                    additionalProperties);
        }
    }
}

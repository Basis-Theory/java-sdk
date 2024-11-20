/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.resources.threeds.sessions.requests;

import com.basis.theory.api.core.ObjectMappers;
import com.basis.theory.api.types.ThreeDsCardholderInfo;
import com.basis.theory.api.types.ThreeDsMerchantInfo;
import com.basis.theory.api.types.ThreeDsMessageExtension;
import com.basis.theory.api.types.ThreeDsPurchaseInfo;
import com.basis.theory.api.types.ThreeDsRequestorInfo;
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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AuthenticateThreeDsSessionRequest.Builder.class)
public final class AuthenticateThreeDsSessionRequest {
    private final String authenticationCategory;

    private final String authenticationType;

    private final Optional<String> challengePreference;

    private final Optional<Boolean> requestDecoupledChallenge;

    private final Optional<Integer> decoupledChallengeMaxTime;

    private final Optional<ThreeDsPurchaseInfo> purchaseInfo;

    private final Optional<ThreeDsMerchantInfo> merchantInfo;

    private final ThreeDsRequestorInfo requestorInfo;

    private final Optional<ThreeDsCardholderInfo> cardholderInfo;

    private final Optional<Object> broadcastInfo;

    private final Optional<List<ThreeDsMessageExtension>> messageExtensions;

    private final Map<String, Object> additionalProperties;

    private AuthenticateThreeDsSessionRequest(
            String authenticationCategory,
            String authenticationType,
            Optional<String> challengePreference,
            Optional<Boolean> requestDecoupledChallenge,
            Optional<Integer> decoupledChallengeMaxTime,
            Optional<ThreeDsPurchaseInfo> purchaseInfo,
            Optional<ThreeDsMerchantInfo> merchantInfo,
            ThreeDsRequestorInfo requestorInfo,
            Optional<ThreeDsCardholderInfo> cardholderInfo,
            Optional<Object> broadcastInfo,
            Optional<List<ThreeDsMessageExtension>> messageExtensions,
            Map<String, Object> additionalProperties) {
        this.authenticationCategory = authenticationCategory;
        this.authenticationType = authenticationType;
        this.challengePreference = challengePreference;
        this.requestDecoupledChallenge = requestDecoupledChallenge;
        this.decoupledChallengeMaxTime = decoupledChallengeMaxTime;
        this.purchaseInfo = purchaseInfo;
        this.merchantInfo = merchantInfo;
        this.requestorInfo = requestorInfo;
        this.cardholderInfo = cardholderInfo;
        this.broadcastInfo = broadcastInfo;
        this.messageExtensions = messageExtensions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("authentication_category")
    public String getAuthenticationCategory() {
        return authenticationCategory;
    }

    @JsonProperty("authentication_type")
    public String getAuthenticationType() {
        return authenticationType;
    }

    @JsonProperty("challenge_preference")
    public Optional<String> getChallengePreference() {
        return challengePreference;
    }

    @JsonProperty("request_decoupled_challenge")
    public Optional<Boolean> getRequestDecoupledChallenge() {
        return requestDecoupledChallenge;
    }

    @JsonProperty("decoupled_challenge_max_time")
    public Optional<Integer> getDecoupledChallengeMaxTime() {
        return decoupledChallengeMaxTime;
    }

    @JsonProperty("purchase_info")
    public Optional<ThreeDsPurchaseInfo> getPurchaseInfo() {
        return purchaseInfo;
    }

    @JsonProperty("merchant_info")
    public Optional<ThreeDsMerchantInfo> getMerchantInfo() {
        return merchantInfo;
    }

    @JsonProperty("requestor_info")
    public ThreeDsRequestorInfo getRequestorInfo() {
        return requestorInfo;
    }

    @JsonProperty("cardholder_info")
    public Optional<ThreeDsCardholderInfo> getCardholderInfo() {
        return cardholderInfo;
    }

    @JsonProperty("broadcast_info")
    public Optional<Object> getBroadcastInfo() {
        return broadcastInfo;
    }

    @JsonProperty("message_extensions")
    public Optional<List<ThreeDsMessageExtension>> getMessageExtensions() {
        return messageExtensions;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AuthenticateThreeDsSessionRequest && equalTo((AuthenticateThreeDsSessionRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AuthenticateThreeDsSessionRequest other) {
        return authenticationCategory.equals(other.authenticationCategory)
                && authenticationType.equals(other.authenticationType)
                && challengePreference.equals(other.challengePreference)
                && requestDecoupledChallenge.equals(other.requestDecoupledChallenge)
                && decoupledChallengeMaxTime.equals(other.decoupledChallengeMaxTime)
                && purchaseInfo.equals(other.purchaseInfo)
                && merchantInfo.equals(other.merchantInfo)
                && requestorInfo.equals(other.requestorInfo)
                && cardholderInfo.equals(other.cardholderInfo)
                && broadcastInfo.equals(other.broadcastInfo)
                && messageExtensions.equals(other.messageExtensions);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.authenticationCategory,
                this.authenticationType,
                this.challengePreference,
                this.requestDecoupledChallenge,
                this.decoupledChallengeMaxTime,
                this.purchaseInfo,
                this.merchantInfo,
                this.requestorInfo,
                this.cardholderInfo,
                this.broadcastInfo,
                this.messageExtensions);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AuthenticationCategoryStage builder() {
        return new Builder();
    }

    public interface AuthenticationCategoryStage {
        AuthenticationTypeStage authenticationCategory(@NotNull String authenticationCategory);

        Builder from(AuthenticateThreeDsSessionRequest other);
    }

    public interface AuthenticationTypeStage {
        RequestorInfoStage authenticationType(@NotNull String authenticationType);
    }

    public interface RequestorInfoStage {
        _FinalStage requestorInfo(@NotNull ThreeDsRequestorInfo requestorInfo);
    }

    public interface _FinalStage {
        AuthenticateThreeDsSessionRequest build();

        _FinalStage challengePreference(Optional<String> challengePreference);

        _FinalStage challengePreference(String challengePreference);

        _FinalStage requestDecoupledChallenge(Optional<Boolean> requestDecoupledChallenge);

        _FinalStage requestDecoupledChallenge(Boolean requestDecoupledChallenge);

        _FinalStage decoupledChallengeMaxTime(Optional<Integer> decoupledChallengeMaxTime);

        _FinalStage decoupledChallengeMaxTime(Integer decoupledChallengeMaxTime);

        _FinalStage purchaseInfo(Optional<ThreeDsPurchaseInfo> purchaseInfo);

        _FinalStage purchaseInfo(ThreeDsPurchaseInfo purchaseInfo);

        _FinalStage merchantInfo(Optional<ThreeDsMerchantInfo> merchantInfo);

        _FinalStage merchantInfo(ThreeDsMerchantInfo merchantInfo);

        _FinalStage cardholderInfo(Optional<ThreeDsCardholderInfo> cardholderInfo);

        _FinalStage cardholderInfo(ThreeDsCardholderInfo cardholderInfo);

        _FinalStage broadcastInfo(Optional<Object> broadcastInfo);

        _FinalStage broadcastInfo(Object broadcastInfo);

        _FinalStage messageExtensions(Optional<List<ThreeDsMessageExtension>> messageExtensions);

        _FinalStage messageExtensions(List<ThreeDsMessageExtension> messageExtensions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AuthenticationCategoryStage, AuthenticationTypeStage, RequestorInfoStage, _FinalStage {
        private String authenticationCategory;

        private String authenticationType;

        private ThreeDsRequestorInfo requestorInfo;

        private Optional<List<ThreeDsMessageExtension>> messageExtensions = Optional.empty();

        private Optional<Object> broadcastInfo = Optional.empty();

        private Optional<ThreeDsCardholderInfo> cardholderInfo = Optional.empty();

        private Optional<ThreeDsMerchantInfo> merchantInfo = Optional.empty();

        private Optional<ThreeDsPurchaseInfo> purchaseInfo = Optional.empty();

        private Optional<Integer> decoupledChallengeMaxTime = Optional.empty();

        private Optional<Boolean> requestDecoupledChallenge = Optional.empty();

        private Optional<String> challengePreference = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AuthenticateThreeDsSessionRequest other) {
            authenticationCategory(other.getAuthenticationCategory());
            authenticationType(other.getAuthenticationType());
            challengePreference(other.getChallengePreference());
            requestDecoupledChallenge(other.getRequestDecoupledChallenge());
            decoupledChallengeMaxTime(other.getDecoupledChallengeMaxTime());
            purchaseInfo(other.getPurchaseInfo());
            merchantInfo(other.getMerchantInfo());
            requestorInfo(other.getRequestorInfo());
            cardholderInfo(other.getCardholderInfo());
            broadcastInfo(other.getBroadcastInfo());
            messageExtensions(other.getMessageExtensions());
            return this;
        }

        @java.lang.Override
        @JsonSetter("authentication_category")
        public AuthenticationTypeStage authenticationCategory(@NotNull String authenticationCategory) {
            this.authenticationCategory =
                    Objects.requireNonNull(authenticationCategory, "authenticationCategory must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("authentication_type")
        public RequestorInfoStage authenticationType(@NotNull String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType, "authenticationType must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("requestor_info")
        public _FinalStage requestorInfo(@NotNull ThreeDsRequestorInfo requestorInfo) {
            this.requestorInfo = Objects.requireNonNull(requestorInfo, "requestorInfo must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage messageExtensions(List<ThreeDsMessageExtension> messageExtensions) {
            this.messageExtensions = Optional.ofNullable(messageExtensions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "message_extensions", nulls = Nulls.SKIP)
        public _FinalStage messageExtensions(Optional<List<ThreeDsMessageExtension>> messageExtensions) {
            this.messageExtensions = messageExtensions;
            return this;
        }

        @java.lang.Override
        public _FinalStage broadcastInfo(Object broadcastInfo) {
            this.broadcastInfo = Optional.ofNullable(broadcastInfo);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "broadcast_info", nulls = Nulls.SKIP)
        public _FinalStage broadcastInfo(Optional<Object> broadcastInfo) {
            this.broadcastInfo = broadcastInfo;
            return this;
        }

        @java.lang.Override
        public _FinalStage cardholderInfo(ThreeDsCardholderInfo cardholderInfo) {
            this.cardholderInfo = Optional.ofNullable(cardholderInfo);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "cardholder_info", nulls = Nulls.SKIP)
        public _FinalStage cardholderInfo(Optional<ThreeDsCardholderInfo> cardholderInfo) {
            this.cardholderInfo = cardholderInfo;
            return this;
        }

        @java.lang.Override
        public _FinalStage merchantInfo(ThreeDsMerchantInfo merchantInfo) {
            this.merchantInfo = Optional.ofNullable(merchantInfo);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "merchant_info", nulls = Nulls.SKIP)
        public _FinalStage merchantInfo(Optional<ThreeDsMerchantInfo> merchantInfo) {
            this.merchantInfo = merchantInfo;
            return this;
        }

        @java.lang.Override
        public _FinalStage purchaseInfo(ThreeDsPurchaseInfo purchaseInfo) {
            this.purchaseInfo = Optional.ofNullable(purchaseInfo);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "purchase_info", nulls = Nulls.SKIP)
        public _FinalStage purchaseInfo(Optional<ThreeDsPurchaseInfo> purchaseInfo) {
            this.purchaseInfo = purchaseInfo;
            return this;
        }

        @java.lang.Override
        public _FinalStage decoupledChallengeMaxTime(Integer decoupledChallengeMaxTime) {
            this.decoupledChallengeMaxTime = Optional.ofNullable(decoupledChallengeMaxTime);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "decoupled_challenge_max_time", nulls = Nulls.SKIP)
        public _FinalStage decoupledChallengeMaxTime(Optional<Integer> decoupledChallengeMaxTime) {
            this.decoupledChallengeMaxTime = decoupledChallengeMaxTime;
            return this;
        }

        @java.lang.Override
        public _FinalStage requestDecoupledChallenge(Boolean requestDecoupledChallenge) {
            this.requestDecoupledChallenge = Optional.ofNullable(requestDecoupledChallenge);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "request_decoupled_challenge", nulls = Nulls.SKIP)
        public _FinalStage requestDecoupledChallenge(Optional<Boolean> requestDecoupledChallenge) {
            this.requestDecoupledChallenge = requestDecoupledChallenge;
            return this;
        }

        @java.lang.Override
        public _FinalStage challengePreference(String challengePreference) {
            this.challengePreference = Optional.ofNullable(challengePreference);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "challenge_preference", nulls = Nulls.SKIP)
        public _FinalStage challengePreference(Optional<String> challengePreference) {
            this.challengePreference = challengePreference;
            return this;
        }

        @java.lang.Override
        public AuthenticateThreeDsSessionRequest build() {
            return new AuthenticateThreeDsSessionRequest(
                    authenticationCategory,
                    authenticationType,
                    challengePreference,
                    requestDecoupledChallenge,
                    decoupledChallengeMaxTime,
                    purchaseInfo,
                    merchantInfo,
                    requestorInfo,
                    cardholderInfo,
                    broadcastInfo,
                    messageExtensions,
                    additionalProperties);
        }
    }
}

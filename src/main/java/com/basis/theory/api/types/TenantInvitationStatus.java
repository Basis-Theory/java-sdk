/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TenantInvitationStatus {
    PENDING("PENDING"),

    EXPIRED("EXPIRED");

    private final String value;

    TenantInvitationStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}

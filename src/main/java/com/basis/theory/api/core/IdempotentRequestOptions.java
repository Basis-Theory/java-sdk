/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public final class IdempotentRequestOptions {
    private final String apiKey;

    private final String idempotencyKey;

    private final Optional<Integer> timeout;

    private final TimeUnit timeoutTimeUnit;

    private IdempotentRequestOptions(
            String apiKey, String idempotencyKey, Optional<Integer> timeout, TimeUnit timeoutTimeUnit) {
        this.apiKey = apiKey;
        this.idempotencyKey = idempotencyKey;
        this.timeout = timeout;
        this.timeoutTimeUnit = timeoutTimeUnit;
    }

    public Optional<Integer> getTimeout() {
        return timeout;
    }

    public TimeUnit getTimeoutTimeUnit() {
        return timeoutTimeUnit;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        if (this.apiKey != null) {
            headers.put("BT-API-KEY", this.apiKey);
        }
        if (this.idempotencyKey != null) {
            headers.put("BT-IDEMPOTENCY-KEY", this.idempotencyKey);
        }
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String apiKey = null;

        private String idempotencyKey = null;

        private Optional<Integer> timeout = Optional.empty();

        private TimeUnit timeoutTimeUnit = TimeUnit.SECONDS;

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder timeout(Integer timeout) {
            this.timeout = Optional.of(timeout);
            return this;
        }

        public Builder timeout(Integer timeout, TimeUnit timeoutTimeUnit) {
            this.timeout = Optional.of(timeout);
            this.timeoutTimeUnit = timeoutTimeUnit;
            return this;
        }

        public IdempotentRequestOptions build() {
            return new IdempotentRequestOptions(apiKey, idempotencyKey, timeout, timeoutTimeUnit);
        }
    }
}

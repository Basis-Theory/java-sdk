/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api;

import com.basis.theory.api.core.ClientOptions;
import com.basis.theory.api.core.Environment;

public final class BasisTheoryApiClientBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private String apiKey = System.getenv("BT-API-KEY");

    private String correlationId = null;

    private Environment environment = Environment.DEFAULT;

    /**
     * Sets apiKey.
     * Defaults to the BT-API-KEY environment variable.
     */
    public BasisTheoryApiClientBuilder apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Sets correlationId
     */
    public BasisTheoryApiClientBuilder correlationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    public BasisTheoryApiClientBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public BasisTheoryApiClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public BasisTheoryApiClient build() {
        if (apiKey == null) {
            throw new RuntimeException("Please provide apiKey or set the BT-API-KEY environment variable.");
        }
        this.clientOptionsBuilder.addHeader("BT-API-KEY", this.apiKey);
        if (correlationId != null) {
            this.clientOptionsBuilder.addHeader("BT-TRACE-ID", this.correlationId);
        }
        clientOptionsBuilder.environment(this.environment);
        return new BasisTheoryApiClient(clientOptionsBuilder.build());
    }
}

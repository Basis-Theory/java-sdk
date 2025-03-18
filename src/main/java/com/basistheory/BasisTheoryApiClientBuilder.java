/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.Environment;
import okhttp3.OkHttpClient;

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

    /**
     * Sets the timeout (in seconds) for the client. Defaults to 60 seconds.
     */
    public BasisTheoryApiClientBuilder timeout(int timeout) {
        this.clientOptionsBuilder.timeout(timeout);
        return this;
    }

    /**
     * Sets the maximum number of retries for the client. Defaults to 2 retries.
     */
    public BasisTheoryApiClientBuilder maxRetries(int maxRetries) {
        this.clientOptionsBuilder.maxRetries(maxRetries);
        return this;
    }

    /**
     * Sets the underlying OkHttp client
     */
    public BasisTheoryApiClientBuilder httpClient(OkHttpClient httpClient) {
        this.clientOptionsBuilder.httpClient(httpClient);
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

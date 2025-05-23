/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.reactors.results;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import java.util.concurrent.CompletableFuture;

public class AsyncResultsClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawResultsClient rawClient;

    public AsyncResultsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawResultsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawResultsClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<Object> get(String id, String requestId) {
        return this.rawClient.get(id, requestId).thenApply(response -> response.body());
    }

    public CompletableFuture<Object> get(String id, String requestId, RequestOptions requestOptions) {
        return this.rawClient.get(id, requestId, requestOptions).thenApply(response -> response.body());
    }
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.connection.applepay.session;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.types.ApplePaySessionRequest;
import java.util.concurrent.CompletableFuture;

public class AsyncSessionClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawSessionClient rawClient;

    public AsyncSessionClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawSessionClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawSessionClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<String> create() {
        return this.rawClient.create().thenApply(response -> response.body());
    }

    public CompletableFuture<String> create(ApplePaySessionRequest request) {
        return this.rawClient.create(request).thenApply(response -> response.body());
    }

    public CompletableFuture<String> create(ApplePaySessionRequest request, RequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).thenApply(response -> response.body());
    }
}

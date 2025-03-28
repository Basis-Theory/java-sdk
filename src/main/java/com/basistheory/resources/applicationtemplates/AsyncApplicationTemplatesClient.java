/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.applicationtemplates;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.types.ApplicationTemplate;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AsyncApplicationTemplatesClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawApplicationTemplatesClient rawClient;

    public AsyncApplicationTemplatesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawApplicationTemplatesClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawApplicationTemplatesClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<List<ApplicationTemplate>> list() {
        return this.rawClient.list().thenApply(response -> response.body());
    }

    public CompletableFuture<List<ApplicationTemplate>> list(RequestOptions requestOptions) {
        return this.rawClient.list(requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<ApplicationTemplate> get(String id) {
        return this.rawClient.get(id).thenApply(response -> response.body());
    }

    public CompletableFuture<ApplicationTemplate> get(String id, RequestOptions requestOptions) {
        return this.rawClient.get(id, requestOptions).thenApply(response -> response.body());
    }
}

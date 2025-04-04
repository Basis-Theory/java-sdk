/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.tenants.owner;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.types.TenantMemberResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncOwnerClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawOwnerClient rawClient;

    public AsyncOwnerClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawOwnerClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawOwnerClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<TenantMemberResponse> get() {
        return this.rawClient.get().thenApply(response -> response.body());
    }

    public CompletableFuture<TenantMemberResponse> get(RequestOptions requestOptions) {
        return this.rawClient.get(requestOptions).thenApply(response -> response.body());
    }
}

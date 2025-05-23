/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.tenants.self;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.IdempotentRequestOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.resources.tenants.self.requests.UpdateTenantRequest;
import com.basistheory.types.Tenant;
import com.basistheory.types.TenantUsageReport;
import java.util.concurrent.CompletableFuture;

public class AsyncSelfClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawSelfClient rawClient;

    public AsyncSelfClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawSelfClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawSelfClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<TenantUsageReport> getUsageReports() {
        return this.rawClient.getUsageReports().thenApply(response -> response.body());
    }

    public CompletableFuture<TenantUsageReport> getUsageReports(RequestOptions requestOptions) {
        return this.rawClient.getUsageReports(requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Tenant> get() {
        return this.rawClient.get().thenApply(response -> response.body());
    }

    public CompletableFuture<Tenant> get(RequestOptions requestOptions) {
        return this.rawClient.get(requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Tenant> update(UpdateTenantRequest request) {
        return this.rawClient.update(request).thenApply(response -> response.body());
    }

    public CompletableFuture<Tenant> update(UpdateTenantRequest request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.update(request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Void> delete() {
        return this.rawClient.delete().thenApply(response -> response.body());
    }

    public CompletableFuture<Void> delete(RequestOptions requestOptions) {
        return this.rawClient.delete(requestOptions).thenApply(response -> response.body());
    }
}

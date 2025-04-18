/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.reactors;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.IdempotentRequestOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.core.Suppliers;
import com.basistheory.core.pagination.SyncPagingIterable;
import com.basistheory.resources.reactors.requests.CreateReactorRequest;
import com.basistheory.resources.reactors.requests.PatchReactorRequest;
import com.basistheory.resources.reactors.requests.ReactRequest;
import com.basistheory.resources.reactors.requests.ReactRequestAsync;
import com.basistheory.resources.reactors.requests.ReactorsListRequest;
import com.basistheory.resources.reactors.requests.UpdateReactorRequest;
import com.basistheory.resources.reactors.results.ResultsClient;
import com.basistheory.types.AsyncReactResponse;
import com.basistheory.types.ReactResponse;
import com.basistheory.types.Reactor;
import java.util.function.Supplier;

public class ReactorsClient {
    protected final ClientOptions clientOptions;

    private final RawReactorsClient rawClient;

    protected final Supplier<ResultsClient> resultsClient;

    public ReactorsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawReactorsClient(clientOptions);
        this.resultsClient = Suppliers.memoize(() -> new ResultsClient(clientOptions));
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawReactorsClient withRawResponse() {
        return this.rawClient;
    }

    public SyncPagingIterable<Reactor> list() {
        return this.rawClient.list().body();
    }

    public SyncPagingIterable<Reactor> list(ReactorsListRequest request) {
        return this.rawClient.list(request).body();
    }

    public SyncPagingIterable<Reactor> list(ReactorsListRequest request, RequestOptions requestOptions) {
        return this.rawClient.list(request, requestOptions).body();
    }

    public Reactor create(CreateReactorRequest request) {
        return this.rawClient.create(request).body();
    }

    public Reactor create(CreateReactorRequest request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).body();
    }

    public Reactor get(String id) {
        return this.rawClient.get(id).body();
    }

    public Reactor get(String id, RequestOptions requestOptions) {
        return this.rawClient.get(id, requestOptions).body();
    }

    public Reactor update(String id, UpdateReactorRequest request) {
        return this.rawClient.update(id, request).body();
    }

    public Reactor update(String id, UpdateReactorRequest request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.update(id, request, requestOptions).body();
    }

    public void delete(String id) {
        this.rawClient.delete(id).body();
    }

    public void delete(String id, RequestOptions requestOptions) {
        this.rawClient.delete(id, requestOptions).body();
    }

    public void patch(String id) {
        this.rawClient.patch(id).body();
    }

    public void patch(String id, PatchReactorRequest request) {
        this.rawClient.patch(id, request).body();
    }

    public void patch(String id, PatchReactorRequest request, IdempotentRequestOptions requestOptions) {
        this.rawClient.patch(id, request, requestOptions).body();
    }

    public ReactResponse react(String id) {
        return this.rawClient.react(id).body();
    }

    public ReactResponse react(String id, ReactRequest request) {
        return this.rawClient.react(id, request).body();
    }

    public ReactResponse react(String id, ReactRequest request, RequestOptions requestOptions) {
        return this.rawClient.react(id, request, requestOptions).body();
    }

    public AsyncReactResponse reactAsync(String id) {
        return this.rawClient.reactAsync(id).body();
    }

    public AsyncReactResponse reactAsync(String id, ReactRequestAsync request) {
        return this.rawClient.reactAsync(id, request).body();
    }

    public AsyncReactResponse reactAsync(String id, ReactRequestAsync request, RequestOptions requestOptions) {
        return this.rawClient.reactAsync(id, request, requestOptions).body();
    }

    public ResultsClient results() {
        return this.resultsClient.get();
    }
}

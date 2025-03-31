/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.tokens;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.IdempotentRequestOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.core.pagination.SyncPagingIterable;
import com.basistheory.resources.tokens.requests.CreateTokenRequest;
import com.basistheory.resources.tokens.requests.SearchTokensRequest;
import com.basistheory.resources.tokens.requests.SearchTokensRequestV2;
import com.basistheory.resources.tokens.requests.TokensListRequest;
import com.basistheory.resources.tokens.requests.TokensListV2Request;
import com.basistheory.resources.tokens.requests.UpdateTokenRequest;
import com.basistheory.types.Token;
import java.util.concurrent.CompletableFuture;

public class AsyncTokensClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawTokensClient rawClient;

    public AsyncTokensClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawTokensClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawTokensClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<Object> detokenize(Object request) {
        return this.rawClient.detokenize(request).thenApply(response -> response.body());
    }

    public CompletableFuture<Object> detokenize(Object request, RequestOptions requestOptions) {
        return this.rawClient.detokenize(request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Object> tokenize(Object request) {
        return this.rawClient.tokenize(request).thenApply(response -> response.body());
    }

    public CompletableFuture<Object> tokenize(Object request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.tokenize(request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> list() {
        return this.rawClient.list().thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> list(TokensListRequest request) {
        return this.rawClient.list(request).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> list(TokensListRequest request, RequestOptions requestOptions) {
        return this.rawClient.list(request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Token> create() {
        return this.rawClient.create().thenApply(response -> response.body());
    }

    public CompletableFuture<Token> create(CreateTokenRequest request) {
        return this.rawClient.create(request).thenApply(response -> response.body());
    }

    public CompletableFuture<Token> create(CreateTokenRequest request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> search() {
        return this.rawClient.search().thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> search(SearchTokensRequest request) {
        return this.rawClient.search(request).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> search(
            SearchTokensRequest request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.search(request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Token> get(String id) {
        return this.rawClient.get(id).thenApply(response -> response.body());
    }

    public CompletableFuture<Token> get(String id, RequestOptions requestOptions) {
        return this.rawClient.get(id, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Void> delete(String id) {
        return this.rawClient.delete(id).thenApply(response -> response.body());
    }

    public CompletableFuture<Void> delete(String id, RequestOptions requestOptions) {
        return this.rawClient.delete(id, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<Token> update(String id) {
        return this.rawClient.update(id).thenApply(response -> response.body());
    }

    public CompletableFuture<Token> update(String id, UpdateTokenRequest request) {
        return this.rawClient.update(id, request).thenApply(response -> response.body());
    }

    public CompletableFuture<Token> update(
            String id, UpdateTokenRequest request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.update(id, request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> listV2() {
        return this.rawClient.listV2().thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> listV2(TokensListV2Request request) {
        return this.rawClient.listV2(request).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> listV2(
            TokensListV2Request request, RequestOptions requestOptions) {
        return this.rawClient.listV2(request, requestOptions).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> searchV2() {
        return this.rawClient.searchV2().thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> searchV2(SearchTokensRequestV2 request) {
        return this.rawClient.searchV2(request).thenApply(response -> response.body());
    }

    public CompletableFuture<SyncPagingIterable<Token>> searchV2(
            SearchTokensRequestV2 request, IdempotentRequestOptions requestOptions) {
        return this.rawClient.searchV2(request, requestOptions).thenApply(response -> response.body());
    }
}

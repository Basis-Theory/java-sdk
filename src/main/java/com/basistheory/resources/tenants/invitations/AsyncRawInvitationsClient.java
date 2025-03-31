/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.tenants.invitations;

import com.basistheory.core.BasisTheoryApiApiException;
import com.basistheory.core.BasisTheoryApiHttpResponse;
import com.basistheory.core.BasisTheoryException;
import com.basistheory.core.ClientOptions;
import com.basistheory.core.IdempotentRequestOptions;
import com.basistheory.core.MediaTypes;
import com.basistheory.core.ObjectMappers;
import com.basistheory.core.QueryStringMapper;
import com.basistheory.core.RequestOptions;
import com.basistheory.core.pagination.SyncPagingIterable;
import com.basistheory.errors.BadRequestError;
import com.basistheory.errors.ForbiddenError;
import com.basistheory.errors.NotFoundError;
import com.basistheory.errors.UnauthorizedError;
import com.basistheory.resources.tenants.invitations.requests.CreateTenantInvitationRequest;
import com.basistheory.resources.tenants.invitations.requests.InvitationsListRequest;
import com.basistheory.types.ProblemDetails;
import com.basistheory.types.TenantInvitationResponse;
import com.basistheory.types.TenantInvitationResponsePaginatedList;
import com.basistheory.types.ValidationProblemDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncRawInvitationsClient {
    protected final ClientOptions clientOptions;

    public AsyncRawInvitationsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<TenantInvitationResponse>>> list() {
        return list(InvitationsListRequest.builder().build());
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<TenantInvitationResponse>>> list(
            InvitationsListRequest request) {
        return list(request, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<TenantInvitationResponse>>> list(
            InvitationsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self/invitations");
        if (request.getStatus().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "status", request.getStatus().get().toString(), false);
        }
        if (request.getPage().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "page", request.getPage().get().toString(), false);
        }
        if (request.getStart().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "start", request.getStart().get(), false);
        }
        if (request.getSize().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "size", request.getSize().get().toString(), false);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<TenantInvitationResponse>>> future =
                new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        TenantInvitationResponsePaginatedList parsedResponse = ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), TenantInvitationResponsePaginatedList.class);
                        int newPageNumber =
                                request.getPage().map(page -> page + 1).orElse(1);
                        InvitationsListRequest nextRequest = InvitationsListRequest.builder()
                                .from(request)
                                .page(newPageNumber)
                                .build();
                        List<TenantInvitationResponse> result =
                                parsedResponse.getData().orElse(Collections.emptyList());
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                new SyncPagingIterable<TenantInvitationResponse>(true, result, () -> {
                                    try {
                                        return list(nextRequest, requestOptions)
                                                .get()
                                                .body();
                                    } catch (InterruptedException | ExecutionException e) {
                                        throw new RuntimeException(e);
                                    }
                                }),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 403:
                                future.completeExceptionally(new ForbiddenError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new BasisTheoryApiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> create(
            CreateTenantInvitationRequest request) {
        return create(request, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> create(
            CreateTenantInvitationRequest request, IdempotentRequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self/invitations")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new BasisTheoryException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), TenantInvitationResponse.class),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 400:
                                future.completeExceptionally(new BadRequestError(
                                        ObjectMappers.JSON_MAPPER.readValue(
                                                responseBodyString, ValidationProblemDetails.class),
                                        response));
                                return;
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 403:
                                future.completeExceptionally(new ForbiddenError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new BasisTheoryApiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> resend(String invitationId) {
        return resend(invitationId, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> resend(
            String invitationId, IdempotentRequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self/invitations")
                .addPathSegment(invitationId)
                .addPathSegments("resend")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), TenantInvitationResponse.class),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 400:
                                future.completeExceptionally(new BadRequestError(
                                        ObjectMappers.JSON_MAPPER.readValue(
                                                responseBodyString, ValidationProblemDetails.class),
                                        response));
                                return;
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 403:
                                future.completeExceptionally(new ForbiddenError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new BasisTheoryApiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> get(String invitationId) {
        return get(invitationId, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> get(
            String invitationId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self/invitations")
                .addPathSegment(invitationId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<TenantInvitationResponse>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), TenantInvitationResponse.class),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 403:
                                future.completeExceptionally(new ForbiddenError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 404:
                                future.completeExceptionally(new NotFoundError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new BasisTheoryApiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<Void>> delete(String invitationId) {
        return delete(invitationId, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<Void>> delete(
            String invitationId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self/invitations")
                .addPathSegment(invitationId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<Void>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(null, response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 403:
                                future.completeExceptionally(new ForbiddenError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 404:
                                future.completeExceptionally(new NotFoundError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new BasisTheoryApiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new BasisTheoryException("Network error executing HTTP request", e));
            }
        });
        return future;
    }
}

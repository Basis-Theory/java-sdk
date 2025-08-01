/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.keys;

import com.basistheory.core.BasisTheoryApiApiException;
import com.basistheory.core.BasisTheoryApiHttpResponse;
import com.basistheory.core.BasisTheoryException;
import com.basistheory.core.ClientOptions;
import com.basistheory.core.ObjectMappers;
import com.basistheory.core.RequestOptions;
import com.basistheory.errors.BadRequestError;
import com.basistheory.errors.ForbiddenError;
import com.basistheory.errors.InternalServerError;
import com.basistheory.errors.NotFoundError;
import com.basistheory.errors.UnauthorizedError;
import com.basistheory.errors.UnprocessableEntityError;
import com.basistheory.resources.keys.requests.ClientEncryptionKeyRequest;
import com.basistheory.types.ClientEncryptionKeyMetadataResponse;
import com.basistheory.types.ClientEncryptionKeyResponse;
import com.basistheory.types.ProblemDetails;
import com.basistheory.types.ValidationProblemDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncRawKeysClient {
    protected final ClientOptions clientOptions;

    public AsyncRawKeysClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<List<ClientEncryptionKeyMetadataResponse>>> list() {
        return list(null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<List<ClientEncryptionKeyMetadataResponse>>> list(
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("keys")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<List<ClientEncryptionKeyMetadataResponse>>> future =
                new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(),
                                        new TypeReference<List<ClientEncryptionKeyMetadataResponse>>() {}),
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
                            case 500:
                                future.completeExceptionally(new InternalServerError(
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

    public CompletableFuture<BasisTheoryApiHttpResponse<ClientEncryptionKeyResponse>> create() {
        return create(ClientEncryptionKeyRequest.builder().build());
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<ClientEncryptionKeyResponse>> create(
            ClientEncryptionKeyRequest request) {
        return create(request, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<ClientEncryptionKeyResponse>> create(
            ClientEncryptionKeyRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("keys")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request),
                    MediaType.parse("application/json-patch+json"));
        } catch (JsonProcessingException e) {
            throw new BasisTheoryException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json-patch+json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<ClientEncryptionKeyResponse>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), ClientEncryptionKeyResponse.class),
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
                            case 422:
                                future.completeExceptionally(new UnprocessableEntityError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                        response));
                                return;
                            case 500:
                                future.completeExceptionally(new InternalServerError(
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

    public CompletableFuture<BasisTheoryApiHttpResponse<ClientEncryptionKeyMetadataResponse>> get(String id) {
        return get(id, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<ClientEncryptionKeyMetadataResponse>> get(
            String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("keys")
                .addPathSegment(id)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<ClientEncryptionKeyMetadataResponse>> future =
                new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), ClientEncryptionKeyMetadataResponse.class),
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
                            case 500:
                                future.completeExceptionally(new InternalServerError(
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

    public CompletableFuture<BasisTheoryApiHttpResponse<Void>> delete(String id) {
        return delete(id, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<Void>> delete(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("keys")
                .addPathSegment(id)
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
                            case 500:
                                future.completeExceptionally(new InternalServerError(
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
}

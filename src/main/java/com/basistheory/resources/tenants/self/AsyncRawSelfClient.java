/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.tenants.self;

import com.basistheory.core.BasisTheoryApiApiException;
import com.basistheory.core.BasisTheoryApiHttpResponse;
import com.basistheory.core.BasisTheoryException;
import com.basistheory.core.ClientOptions;
import com.basistheory.core.IdempotentRequestOptions;
import com.basistheory.core.MediaTypes;
import com.basistheory.core.ObjectMappers;
import com.basistheory.core.RequestOptions;
import com.basistheory.errors.BadRequestError;
import com.basistheory.errors.ForbiddenError;
import com.basistheory.errors.NotFoundError;
import com.basistheory.errors.UnauthorizedError;
import com.basistheory.resources.tenants.self.requests.UpdateTenantRequest;
import com.basistheory.types.ProblemDetails;
import com.basistheory.types.Tenant;
import com.basistheory.types.TenantUsageReport;
import com.basistheory.types.ValidationProblemDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
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

public class AsyncRawSelfClient {
    protected final ClientOptions clientOptions;

    public AsyncRawSelfClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantUsageReport>> getUsageReports() {
        return getUsageReports(null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<TenantUsageReport>> getUsageReports(
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self/reports/usage")
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
        CompletableFuture<BasisTheoryApiHttpResponse<TenantUsageReport>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), TenantUsageReport.class),
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

    public CompletableFuture<BasisTheoryApiHttpResponse<Tenant>> get() {
        return get(null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<Tenant>> get(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self")
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
        CompletableFuture<BasisTheoryApiHttpResponse<Tenant>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Tenant.class), response));
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

    public CompletableFuture<BasisTheoryApiHttpResponse<Tenant>> update(UpdateTenantRequest request) {
        return update(request, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<Tenant>> update(
            UpdateTenantRequest request, IdempotentRequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self")
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
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<Tenant>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Tenant.class), response));
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

    public CompletableFuture<BasisTheoryApiHttpResponse<Void>> delete() {
        return delete(null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<Void>> delete(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("tenants/self")
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

/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.logs;

import com.basistheory.core.BasisTheoryApiApiException;
import com.basistheory.core.BasisTheoryApiHttpResponse;
import com.basistheory.core.BasisTheoryException;
import com.basistheory.core.ClientOptions;
import com.basistheory.core.ObjectMappers;
import com.basistheory.core.QueryStringMapper;
import com.basistheory.core.RequestOptions;
import com.basistheory.core.pagination.SyncPagingIterable;
import com.basistheory.errors.BadRequestError;
import com.basistheory.errors.ForbiddenError;
import com.basistheory.errors.UnauthorizedError;
import com.basistheory.resources.logs.requests.LogsListRequest;
import com.basistheory.types.Log;
import com.basistheory.types.LogEntityType;
import com.basistheory.types.LogPaginatedList;
import com.basistheory.types.ProblemDetails;
import com.basistheory.types.ValidationProblemDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
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
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncRawLogsClient {
    protected final ClientOptions clientOptions;

    public AsyncRawLogsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<Log>>> list() {
        return list(LogsListRequest.builder().build());
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<Log>>> list(LogsListRequest request) {
        return list(request, null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<Log>>> list(
            LogsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("logs");
        if (request.getEntityType().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "entity_type", request.getEntityType().get(), false);
        }
        if (request.getEntityId().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "entity_id", request.getEntityId().get(), false);
        }
        if (request.getStartDate().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "start_date", request.getStartDate().get(), false);
        }
        if (request.getEndDate().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "end_date", request.getEndDate().get(), false);
        }
        if (request.getPage().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "page", request.getPage().get(), false);
        }
        if (request.getStart().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "start", request.getStart().get(), false);
        }
        if (request.getSize().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "size", request.getSize().get(), false);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<BasisTheoryApiHttpResponse<SyncPagingIterable<Log>>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        LogPaginatedList parsedResponse =
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), LogPaginatedList.class);
                        int newPageNumber = request.getPage()
                                .map((Integer page) -> page + 1)
                                .orElse(1);
                        LogsListRequest nextRequest = LogsListRequest.builder()
                                .from(request)
                                .page(newPageNumber)
                                .build();
                        List<Log> result = parsedResponse.getData().orElse(Collections.emptyList());
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                new SyncPagingIterable<Log>(true, result, () -> {
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

    public CompletableFuture<BasisTheoryApiHttpResponse<List<LogEntityType>>> getEntityTypes() {
        return getEntityTypes(null);
    }

    public CompletableFuture<BasisTheoryApiHttpResponse<List<LogEntityType>>> getEntityTypes(
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("logs/entity-types")
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
        CompletableFuture<BasisTheoryApiHttpResponse<List<LogEntityType>>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new BasisTheoryApiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), new TypeReference<List<LogEntityType>>() {}),
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
}

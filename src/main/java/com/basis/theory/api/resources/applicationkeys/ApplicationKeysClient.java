/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.resources.applicationkeys;

import com.basis.theory.api.core.BasisTheoryApiApiException;
import com.basis.theory.api.core.BasisTheoryException;
import com.basis.theory.api.core.ClientOptions;
import com.basis.theory.api.core.IdempotentRequestOptions;
import com.basis.theory.api.core.ObjectMappers;
import com.basis.theory.api.core.RequestOptions;
import com.basis.theory.api.errors.ForbiddenError;
import com.basis.theory.api.errors.NotFoundError;
import com.basis.theory.api.errors.UnauthorizedError;
import com.basis.theory.api.errors.UnprocessableEntityError;
import com.basis.theory.api.resources.applicationkeys.requests.ApplicationKeysListRequest;
import com.basis.theory.api.types.ApplicationKey;
import com.basis.theory.api.types.ProblemDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ApplicationKeysClient {
    protected final ClientOptions clientOptions;

    public ApplicationKeysClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public List<ApplicationKey> list(String id) {
        return list(id, ApplicationKeysListRequest.builder().build());
    }

    public List<ApplicationKey> list(String id, ApplicationKeysListRequest request) {
        return list(id, request, null);
    }

    public List<ApplicationKey> list(String id, ApplicationKeysListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("applications")
                .addPathSegment(id)
                .addPathSegments("keys");
        if (request.getId().isPresent()) {
            httpUrl.addQueryParameter("id", request.getId().get());
        }
        if (request.getType().isPresent()) {
            httpUrl.addQueryParameter("type", request.getType().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), new TypeReference<List<ApplicationKey>>() {});
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 404:
                        throw new NotFoundError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }

    public ApplicationKey create(String id) {
        return create(id, null);
    }

    public ApplicationKey create(String id, IdempotentRequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("applications")
                .addPathSegment(id)
                .addPathSegments("keys")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ApplicationKey.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 422:
                        throw new UnprocessableEntityError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }

    public ApplicationKey get(String id, String keyId) {
        return get(id, keyId, null);
    }

    public ApplicationKey get(String id, String keyId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("applications")
                .addPathSegment(id)
                .addPathSegments("keys")
                .addPathSegment(keyId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ApplicationKey.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 404:
                        throw new NotFoundError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }

    public void delete(String id, String keyId) {
        delete(id, keyId, null);
    }

    public void delete(String id, String keyId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("applications")
                .addPathSegment(id)
                .addPathSegments("keys")
                .addPathSegment(keyId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class));
                    case 404:
                        throw new NotFoundError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }
}

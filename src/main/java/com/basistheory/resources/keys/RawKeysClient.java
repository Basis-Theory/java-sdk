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
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RawKeysClient {
    protected final ClientOptions clientOptions;

    public RawKeysClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public BasisTheoryApiHttpResponse<List<ClientEncryptionKeyMetadataResponse>> list() {
        return list(null);
    }

    public BasisTheoryApiHttpResponse<List<ClientEncryptionKeyMetadataResponse>> list(RequestOptions requestOptions) {
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
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new BasisTheoryApiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(),
                                new TypeReference<List<ClientEncryptionKeyMetadataResponse>>() {}),
                        response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 500:
                        throw new InternalServerError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }

    public BasisTheoryApiHttpResponse<ClientEncryptionKeyResponse> create() {
        return create(ClientEncryptionKeyRequest.builder().build());
    }

    public BasisTheoryApiHttpResponse<ClientEncryptionKeyResponse> create(ClientEncryptionKeyRequest request) {
        return create(request, null);
    }

    public BasisTheoryApiHttpResponse<ClientEncryptionKeyResponse> create(
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
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new BasisTheoryApiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ClientEncryptionKeyResponse.class),
                        response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new BadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ValidationProblemDetails.class),
                                response);
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 422:
                        throw new UnprocessableEntityError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 500:
                        throw new InternalServerError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }

    public BasisTheoryApiHttpResponse<ClientEncryptionKeyMetadataResponse> get(String id) {
        return get(id, null);
    }

    public BasisTheoryApiHttpResponse<ClientEncryptionKeyMetadataResponse> get(
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
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new BasisTheoryApiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), ClientEncryptionKeyMetadataResponse.class),
                        response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 404:
                        throw new NotFoundError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
                    case 500:
                        throw new InternalServerError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }

    public BasisTheoryApiHttpResponse<Void> delete(String id) {
        return delete(id, null);
    }

    public BasisTheoryApiHttpResponse<Void> delete(String id, RequestOptions requestOptions) {
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
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new BasisTheoryApiHttpResponse<>(null, response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 403:
                        throw new ForbiddenError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                    case 404:
                        throw new NotFoundError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
                    case 500:
                        throw new InternalServerError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ProblemDetails.class),
                                response);
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new BasisTheoryApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new BasisTheoryException("Network error executing HTTP request", e);
        }
    }
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.reactors.results;

import com.basistheory.core.BasisTheoryApiApiException;
import com.basistheory.core.BasisTheoryApiHttpResponse;
import com.basistheory.core.BasisTheoryException;
import com.basistheory.core.ClientOptions;
import com.basistheory.core.ObjectMappers;
import com.basistheory.core.RequestOptions;
import com.basistheory.errors.ForbiddenError;
import com.basistheory.errors.NotFoundError;
import com.basistheory.errors.UnauthorizedError;
import com.basistheory.errors.UnprocessableEntityError;
import com.basistheory.types.ProblemDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RawResultsClient {
    protected final ClientOptions clientOptions;

    public RawResultsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public BasisTheoryApiHttpResponse<Object> get(String id, String requestId) {
        return get(id, requestId, null);
    }

    public BasisTheoryApiHttpResponse<Object> get(String id, String requestId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("reactors")
                .addPathSegment(id)
                .addPathSegments("results")
                .addPathSegment(requestId)
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
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new BasisTheoryApiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Object.class), response);
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
}

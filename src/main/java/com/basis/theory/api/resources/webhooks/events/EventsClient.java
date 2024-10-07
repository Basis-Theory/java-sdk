/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api.resources.webhooks.events;

import com.basis.theory.api.core.BasisTheoryApiApiException;
import com.basis.theory.api.core.BasisTheoryException;
import com.basis.theory.api.core.ClientOptions;
import com.basis.theory.api.core.ObjectMappers;
import com.basis.theory.api.core.RequestOptions;
import com.basis.theory.api.errors.ForbiddenError;
import com.basis.theory.api.errors.UnauthorizedError;
import com.basis.theory.api.types.ProblemDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class EventsClient {
    protected final ClientOptions clientOptions;

    public EventsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Return a list of available event types
     */
    public List<String> list() {
        return list(null);
    }

    /**
     * Return a list of available event types
     */
    public List<String> list(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("webhooks/event-types")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), new TypeReference<List<String>>() {});
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

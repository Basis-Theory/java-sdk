/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.tokenintents;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.resources.tokenintents.requests.CreateTokenIntentRequest;
import com.basistheory.types.CreateTokenIntentResponse;
import com.basistheory.types.TokenIntent;

public class TokenIntentsClient {
    protected final ClientOptions clientOptions;

    private final RawTokenIntentsClient rawClient;

    public TokenIntentsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawTokenIntentsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawTokenIntentsClient withRawResponse() {
        return this.rawClient;
    }

    public TokenIntent get(String id) {
        return this.rawClient.get(id).body();
    }

    public TokenIntent get(String id, RequestOptions requestOptions) {
        return this.rawClient.get(id, requestOptions).body();
    }

    public void delete(String id) {
        this.rawClient.delete(id).body();
    }

    public void delete(String id, RequestOptions requestOptions) {
        this.rawClient.delete(id, requestOptions).body();
    }

    public CreateTokenIntentResponse create(CreateTokenIntentRequest request) {
        return this.rawClient.create(request).body();
    }

    public CreateTokenIntentResponse create(CreateTokenIntentRequest request, RequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).body();
    }
}

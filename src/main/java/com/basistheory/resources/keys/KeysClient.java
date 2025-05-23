/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.keys;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.resources.keys.requests.ClientEncryptionKeyRequest;
import com.basistheory.types.ClientEncryptionKeyMetadataResponse;
import com.basistheory.types.ClientEncryptionKeyResponse;
import java.util.List;

public class KeysClient {
    protected final ClientOptions clientOptions;

    private final RawKeysClient rawClient;

    public KeysClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawKeysClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawKeysClient withRawResponse() {
        return this.rawClient;
    }

    public List<ClientEncryptionKeyMetadataResponse> list() {
        return this.rawClient.list().body();
    }

    public List<ClientEncryptionKeyMetadataResponse> list(RequestOptions requestOptions) {
        return this.rawClient.list(requestOptions).body();
    }

    public ClientEncryptionKeyResponse create() {
        return this.rawClient.create().body();
    }

    public ClientEncryptionKeyResponse create(ClientEncryptionKeyRequest request) {
        return this.rawClient.create(request).body();
    }

    public ClientEncryptionKeyResponse create(ClientEncryptionKeyRequest request, RequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).body();
    }

    public ClientEncryptionKeyMetadataResponse get(String id) {
        return this.rawClient.get(id).body();
    }

    public ClientEncryptionKeyMetadataResponse get(String id, RequestOptions requestOptions) {
        return this.rawClient.get(id, requestOptions).body();
    }

    public void delete(String id) {
        this.rawClient.delete(id).body();
    }

    public void delete(String id, RequestOptions requestOptions) {
        this.rawClient.delete(id, requestOptions).body();
    }
}

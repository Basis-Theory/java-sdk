/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.documents;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.core.Suppliers;
import com.basistheory.resources.documents.data.DataClient;
import com.basistheory.resources.documents.requests.DocumentsUploadRequest;
import com.basistheory.types.Document;
import java.io.File;
import java.util.Optional;
import java.util.function.Supplier;

public class DocumentsClient {
    protected final ClientOptions clientOptions;

    private final RawDocumentsClient rawClient;

    protected final Supplier<DataClient> dataClient;

    public DocumentsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawDocumentsClient(clientOptions);
        this.dataClient = Suppliers.memoize(() -> new DataClient(clientOptions));
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawDocumentsClient withRawResponse() {
        return this.rawClient;
    }

    public Document upload(Optional<File> document) {
        return this.rawClient.upload(document).body();
    }

    public Document upload(Optional<File> document, DocumentsUploadRequest request) {
        return this.rawClient.upload(document, request).body();
    }

    public Document upload(Optional<File> document, DocumentsUploadRequest request, RequestOptions requestOptions) {
        return this.rawClient.upload(document, request, requestOptions).body();
    }

    public Document get(String id) {
        return this.rawClient.get(id).body();
    }

    public Document get(String id, RequestOptions requestOptions) {
        return this.rawClient.get(id, requestOptions).body();
    }

    public void delete(String id) {
        this.rawClient.delete(id).body();
    }

    public void delete(String id, RequestOptions requestOptions) {
        this.rawClient.delete(id, requestOptions).body();
    }

    public DataClient data() {
        return this.dataClient.get();
    }
}

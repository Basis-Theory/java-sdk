/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.applepay.domain;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import com.basistheory.resources.applepay.domain.requests.ApplePayDomainDeregistrationRequest;
import com.basistheory.resources.applepay.domain.requests.ApplePayDomainRegistrationListRequest;
import com.basistheory.resources.applepay.domain.requests.ApplePayDomainRegistrationRequest;
import com.basistheory.types.ApplePayDomainRegistrationResponse;

public class DomainClient {
    protected final ClientOptions clientOptions;

    private final RawDomainClient rawClient;

    public DomainClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawDomainClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawDomainClient withRawResponse() {
        return this.rawClient;
    }

    public void deregister(ApplePayDomainDeregistrationRequest request) {
        this.rawClient.deregister(request).body();
    }

    public void deregister(ApplePayDomainDeregistrationRequest request, RequestOptions requestOptions) {
        this.rawClient.deregister(request, requestOptions).body();
    }

    public ApplePayDomainRegistrationResponse get() {
        return this.rawClient.get().body();
    }

    public ApplePayDomainRegistrationResponse get(RequestOptions requestOptions) {
        return this.rawClient.get(requestOptions).body();
    }

    public ApplePayDomainRegistrationResponse register(ApplePayDomainRegistrationRequest request) {
        return this.rawClient.register(request).body();
    }

    public ApplePayDomainRegistrationResponse register(
            ApplePayDomainRegistrationRequest request, RequestOptions requestOptions) {
        return this.rawClient.register(request, requestOptions).body();
    }

    public ApplePayDomainRegistrationResponse registerAll() {
        return this.rawClient.registerAll().body();
    }

    public ApplePayDomainRegistrationResponse registerAll(ApplePayDomainRegistrationListRequest request) {
        return this.rawClient.registerAll(request).body();
    }

    public ApplePayDomainRegistrationResponse registerAll(
            ApplePayDomainRegistrationListRequest request, RequestOptions requestOptions) {
        return this.rawClient.registerAll(request, requestOptions).body();
    }
}

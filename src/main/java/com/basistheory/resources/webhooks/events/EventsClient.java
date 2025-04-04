/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.webhooks.events;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.RequestOptions;
import java.util.List;

public class EventsClient {
    protected final ClientOptions clientOptions;

    private final RawEventsClient rawClient;

    public EventsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawEventsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawEventsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * Return a list of available event types
     */
    public List<String> list() {
        return this.rawClient.list().body();
    }

    /**
     * Return a list of available event types
     */
    public List<String> list(RequestOptions requestOptions) {
        return this.rawClient.list(requestOptions).body();
    }
}

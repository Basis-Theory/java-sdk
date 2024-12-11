/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.errors;

import com.basistheory.core.BasisTheoryApiApiException;

public final class NotFoundError extends BasisTheoryApiApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final Object body;

    public NotFoundError(Object body) {
        super("NotFoundError", 404, body);
        this.body = body;
    }

    /**
     * @return the body
     */
    @java.lang.Override
    public Object body() {
        return this.body;
    }
}
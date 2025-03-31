/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.errors;

import com.basistheory.core.BasisTheoryApiApiException;
import com.basistheory.types.ProblemDetails;
import okhttp3.Response;

public final class UnprocessableEntityError extends BasisTheoryApiApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final ProblemDetails body;

    public UnprocessableEntityError(ProblemDetails body) {
        super("UnprocessableEntityError", 422, body);
        this.body = body;
    }

    public UnprocessableEntityError(ProblemDetails body, Response rawResponse) {
        super("UnprocessableEntityError", 422, body, rawResponse);
        this.body = body;
    }

    /**
     * @return the body
     */
    @java.lang.Override
    public ProblemDetails body() {
        return this.body;
    }
}

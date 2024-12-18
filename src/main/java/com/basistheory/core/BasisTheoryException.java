/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.core;

/**
 * This class serves as the base exception for all errors in the SDK.
 */
public class BasisTheoryException extends RuntimeException {
    public BasisTheoryException(String message) {
        super(message);
    }

    public BasisTheoryException(String message, Exception e) {
        super(message, e);
    }
}

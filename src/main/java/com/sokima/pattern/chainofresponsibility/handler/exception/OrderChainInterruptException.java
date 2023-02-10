package com.sokima.pattern.chainofresponsibility.handler.exception;

/**
 * Raise when chain was interrupted.
 *
 * @author Roman Denysov
 */
public class OrderChainInterruptException extends Exception {

    public OrderChainInterruptException(String message) {
        super(message);
    }

    // some impl
}

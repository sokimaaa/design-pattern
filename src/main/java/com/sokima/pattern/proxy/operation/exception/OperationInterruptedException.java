package com.sokima.pattern.proxy.operation.exception;

import com.sokima.pattern.proxy.operation.Operation;

/**
 * Raise when execution of {@link Operation#operate()} was interrupted.
 *
 * @author Roman Denysov
 */
public class OperationInterruptedException extends Exception {
    public OperationInterruptedException() {
    }

    public OperationInterruptedException(String message) {
        super(message);
    }

    public OperationInterruptedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationInterruptedException(Throwable cause) {
        super(cause);
    }

    public OperationInterruptedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

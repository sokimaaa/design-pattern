package com.sokima.pattern.proxy.operation;

import com.sokima.pattern.proxy.operation.exception.OperationInterruptedException;

/**
 * Interface that describes any kind of operations.
 *
 * @author Roman Denysov
 */
public interface Operation {
    void operate() throws OperationInterruptedException;
}

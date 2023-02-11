package com.sokima.pattern.proxy.operation;

import com.sokima.pattern.proxy.operation.exception.OperationInterruptedException;

/**
 * Operation of delivering to a customer.
 *
 * @author Roman Denysov
 */
public class DeliverOperation implements Operation {
    @Override
    public void operate() throws OperationInterruptedException {
        // some impl
    }
}

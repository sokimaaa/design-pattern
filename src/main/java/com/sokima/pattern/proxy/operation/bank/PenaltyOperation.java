package com.sokima.pattern.proxy.operation.bank;

import com.sokima.pattern.proxy.operation.exception.OperationInterruptedException;

/**
 * Operation of withdrawal of a fine.
 *
 * @author Roman Denysov
 */
public class PenaltyOperation extends BankOperation {
    @Override
    public void operate() throws OperationInterruptedException {
        // some impl
    }
}

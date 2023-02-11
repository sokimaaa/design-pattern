package com.sokima.pattern.proxy.operation.bank;

import com.sokima.pattern.proxy.operation.exception.OperationInterruptedException;

/**
 * Operation of cash transfer from one person to another.
 *
 * @author Roman Denysov
 */
public class CashTransferOperation extends BankOperation {
    @Override
    public void operate() throws OperationInterruptedException {
        // some impl
    }
}

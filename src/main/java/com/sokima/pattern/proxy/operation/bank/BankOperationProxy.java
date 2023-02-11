package com.sokima.pattern.proxy.operation.bank;

import com.sokima.pattern.proxy.operation.Operation;
import com.sokima.pattern.proxy.operation.exception.OperationInterruptedException;

/**
 * Proxy pattern.
 * Surround {@link BankOperation} with a transaction.
 *
 * @author Roman Denysov
 */
public class BankOperationProxy implements Operation {

    private final BankOperation bankOperation;

    public BankOperationProxy(BankOperation bankOperation) {
        this.bankOperation = bankOperation;
    }

    @Override
    public void operate() {
        try {
            beginTransaction();
            bankOperation.operate();
            commitTransaction();
        } catch (OperationInterruptedException e) {
            rollbackTransaction();
        }
    }

    private void rollbackTransaction() {
        // some impl
    }

    private void commitTransaction() {
        // some impl
    }

    private void beginTransaction() {
        // some impl
    }
}

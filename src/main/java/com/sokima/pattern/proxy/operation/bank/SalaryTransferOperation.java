package com.sokima.pattern.proxy.operation.bank;

import com.sokima.pattern.proxy.operation.exception.OperationInterruptedException;

/**
 * Operation of salary transfer from an employer to an employee.
 *
 * @author Roman Denysov
 */
public class SalaryTransferOperation extends BankOperation {
    @Override
    public void operate() throws OperationInterruptedException {
        // some impl
    }
}

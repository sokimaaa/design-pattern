package com.sokima.pattern.proxy;

import com.sokima.pattern.proxy.operation.bank.BankOperationProxy;
import com.sokima.pattern.proxy.operation.bank.CashTransferOperation;
import com.sokima.pattern.proxy.operation.bank.PenaltyOperation;
import com.sokima.pattern.proxy.operation.bank.SalaryTransferOperation;

/**
 * Bank Service to manipulate bank operations.
 *
 * @author Roman Denysov
 */
public class BankService {

    private final CashTransferOperation cashTransfer;

    private final PenaltyOperation penalty;

    private final SalaryTransferOperation salaryTransfer;

    public BankService(CashTransferOperation cashTransfer, PenaltyOperation penalty, SalaryTransferOperation salaryTransfer) {
        this.cashTransfer = cashTransfer;
        this.penalty = penalty;
        this.salaryTransfer = salaryTransfer;
    }

    public void withdrawalPenalty() {
        BankOperationProxy proxy = new BankOperationProxy(penalty);
        proxy.operate();
        // some impl
    }

    // some impl
}

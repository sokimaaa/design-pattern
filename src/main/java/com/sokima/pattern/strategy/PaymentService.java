package com.sokima.pattern.strategy;

import com.sokima.pattern.strategy.payment.PaymentStrategy;

/**
 * Service to make a payment.
 *
 * @author Roman Denysov
 */
public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public void makePayment() {
        // some impl
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // some impl
}

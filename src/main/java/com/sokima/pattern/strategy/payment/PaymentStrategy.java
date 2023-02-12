package com.sokima.pattern.strategy.payment;

/**
 * Strategy Pattern.
 * Defines a family of algorithms to make a payment.
 *
 * @author Roman Denysov
 */
public interface PaymentStrategy {
    void pay();
}

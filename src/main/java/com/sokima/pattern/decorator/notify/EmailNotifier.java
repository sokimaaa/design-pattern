package com.sokima.pattern.decorator.notify;

import com.sokima.pattern.decorator.customer.Customer;

/**
 * General implementation of {@link Notifier} to email a customer.
 *
 * @author Roman Denysov
 */
public class EmailNotifier implements Notifier {
    private final Customer customer;

    public EmailNotifier(Customer customer) {
        this.customer = customer;
    }

    public void send(String message) {
        // some impl
    }

    public Customer getCustomer() {
        return customer;
    }

    // some impl
}

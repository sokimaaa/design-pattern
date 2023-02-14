package com.sokima.pattern.decorator.notify;

import com.sokima.pattern.decorator.customer.Customer;

/**
 * Describes a simple notifier to send an updates to customer.
 *
 * @author Roman Denysov
 */
public interface Notifier {
    void send(String message);

    Customer getCustomer();
}

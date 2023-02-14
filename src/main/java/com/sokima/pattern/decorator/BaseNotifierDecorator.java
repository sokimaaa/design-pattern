package com.sokima.pattern.decorator;

import com.sokima.pattern.decorator.customer.Customer;
import com.sokima.pattern.decorator.notify.Notifier;

/**
 * Decorator Pattern.
 * Wrapper for {@link Notifier} to send a notification in many ways.
 *
 * @author Roman Denysov
 */
public abstract class BaseNotifierDecorator implements Notifier {
    private final Notifier wrapped;

    protected BaseNotifierDecorator(Notifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public Customer getCustomer() {
        return wrapped.getCustomer();
    }
}

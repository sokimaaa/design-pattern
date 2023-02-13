package com.sokima.pattern.observer.listener;

import com.sokima.pattern.observer.event.Event;

/**
 * Represent an object of each customer that subscribes on event.
 * Contain information to notify customer.
 *
 * @author Roman Denysov
 */
public class EmailMessageListener {
    private final String email;

    public EmailMessageListener(String email) {
        this.email = email;
    }

    public void update(Event event) {
        // send mail to the subscribed
    }

    // some impl
}

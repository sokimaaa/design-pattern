package com.sokima.pattern.decorator;

import com.sokima.pattern.decorator.notify.Notifier;

/**
 * Wrapper for {@link Notifier} to send a facebook messages.
 *
 * @author Roman Denysov
 */
public class FacebookDecorator extends BaseNotifierDecorator {
    public FacebookDecorator(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFacebookMessage(message);
    }

    private void sendFacebookMessage(String message) {
        // some impl
    }
}

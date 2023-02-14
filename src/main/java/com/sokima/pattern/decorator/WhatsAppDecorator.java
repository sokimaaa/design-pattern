package com.sokima.pattern.decorator;

import com.sokima.pattern.decorator.notify.Notifier;

/**
 * Wrapper for {@link Notifier} to send a whatsapp messages.
 *
 * @author Roman Denysov
 */
public class WhatsAppDecorator extends BaseNotifierDecorator {
    public WhatsAppDecorator(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendWhatsAppMessage(message);
    }

    private void sendWhatsAppMessage(String message) {
        // some impl
    }
}

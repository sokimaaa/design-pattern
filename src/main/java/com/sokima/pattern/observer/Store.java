package com.sokima.pattern.observer;

import com.sokima.pattern.observer.event.Event;
import com.sokima.pattern.observer.service.NotificationService;

/**
 * Observe Pattern.
 * Observed class which calls method after updates.
 *
 * @author Roman Denysov
 */
public class Store {
    private final NotificationService notificationService;


    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void newItemPromotion() {
        notificationService.notify(Event.NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notify(Event.SALE);
    }
}

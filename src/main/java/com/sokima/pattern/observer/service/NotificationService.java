package com.sokima.pattern.observer.service;

import com.sokima.pattern.observer.event.Event;
import com.sokima.pattern.observer.listener.EmailMessageListener;

import java.util.*;

/**
 * Keep track of the listeners that want to receive an email about updates.
 *
 * @author Roman Denysov
 */
public class NotificationService {
    private final Map<Event, List<EmailMessageListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(
                event -> customers.put(event, new ArrayList<>())
        );
    }

    public void subscribe(Event event, EmailMessageListener emailMessageListener) {
        customers.get(event).add(emailMessageListener);
    }

    public void unsubscribe(Event event, EmailMessageListener emailMessageListener) {
        customers.get(event).remove(emailMessageListener);
    }

    public void notify(Event event) {
        customers.get(event).forEach(listener -> listener.update(event));
    }
}

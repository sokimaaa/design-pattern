package com.sokima.pattern.composite.service;

import com.sokima.pattern.composite.Box;
import com.sokima.pattern.composite.CompositeBox;

/**
 * Represent delivery service.
 *
 * @author Roman Denysov
 */
public class DeliveryService {
    private Box box;

    public DeliveryService() {

    }

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}

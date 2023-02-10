package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Verify order is deliverable or not based on {@link OrderDetails}.
 *
 * @author Roman Denysov
 */
public class DeliverHandler extends BaseOrderHandler {
    @Override
    public void doOrder(OrderDetails orderDetails, Order order) {
        if (isDeliverable(orderDetails)) nextStep(orderDetails, order);
    }

    private boolean isDeliverable(OrderDetails orderDetails) {
        // some impl
        return true;
    }
}

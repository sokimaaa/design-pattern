package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Do cooking of {@link Order} based on preferences in {@link OrderDetails}.
 * Sent a notice to the Chief-cooker with description of order.
 *
 * @author Roman Denysov
 */
public class CookHandler extends BaseOrderHandler {
    @Override
    public void doOrder(OrderDetails orderDetails, Order order) {
        // some impl
        nextStep(orderDetails, order);
    }
}

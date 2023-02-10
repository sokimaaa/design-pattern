package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Composes {@link Order} based on {@link OrderDetails}.
 * A main order composes, e.g. list of all ordered dishes.
 * Also, verifies if possible to cook dish, if not than notice a customer about changes.
 *
 * @author Roman Denysov
 */
public class ComposeHandler extends BaseOrderHandler {
    @Override
    public void doOrder(OrderDetails orderDetails, Order order) {
        // some impl
        nextStep(orderDetails, order);
    }
}

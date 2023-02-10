package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Make a bill for created order and sent to a customer or restaurant.
 *
 * @author Roman Denysov
 */
public class BillHandler extends BaseOrderHandler {
    @Override
    public void doOrder(OrderDetails orderDetails, Order order) {
        // some impl
        nextStep(orderDetails, order);
    }
}

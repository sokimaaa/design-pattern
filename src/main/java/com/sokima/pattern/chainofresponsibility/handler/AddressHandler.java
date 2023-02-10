package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Verify an address to deliver is real.
 *
 * @author Roman Denysov
 */
public class AddressHandler extends BaseOrderHandler {
    @Override
    public void doOrder(OrderDetails orderDetails, Order order) {
        // some impl
        if (isReal(orderDetails)) nextStep(orderDetails, order);
    }

    private boolean isReal(OrderDetails orderDetails) {
        // some impl
        return true;
    }

}

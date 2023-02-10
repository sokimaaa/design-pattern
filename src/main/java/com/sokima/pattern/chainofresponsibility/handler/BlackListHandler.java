package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Verify the customer is not in the black list.
 *
 * @author Roman Denysov
 */
public class BlackListHandler extends BaseOrderHandler {
    @Override
    public void doOrder(OrderDetails orderDetails, Order order) {
        // some impl
        if (!isCustomerInBlackList(orderDetails)) nextStep(orderDetails, order);
    }

    private boolean isCustomerInBlackList(OrderDetails orderDetails) {
        // some impl
        return true;
    }
}

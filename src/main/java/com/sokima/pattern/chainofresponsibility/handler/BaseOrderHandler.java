package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

import java.util.Objects;

/**
 * Implement boilerplate code.
 *
 * @author Roman Denysov
 */
public abstract class BaseOrderHandler implements OrderHandler {

    private OrderHandler next;

    public abstract void doOrder(OrderDetails orderDetails, Order order);

    protected void nextStep(OrderDetails orderDetails, Order order) {
        if (Objects.nonNull(next)) doOrder(orderDetails, order);
    }

    @Override
    public OrderHandler next(OrderHandler orderHandler) {
        this.next = orderHandler;
        return orderHandler;
    }

    // some impl
}

package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.handler.exception.OrderChainInterruptException;
import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Chain of Responsibility pattern.
 * Interface that have two methods, for setting up a next element in chain
 * and method that do changes in {@link Order}.
 * {@link Order} will complete step by step, and if something went wrong just reject an order.
 *
 * @author Roman Denysov
 */
public interface OrderHandler {

    void doOrder(OrderDetails orderDetails, Order order) throws OrderChainInterruptException;

    OrderHandler next(OrderHandler orderHandler);
}

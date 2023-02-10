package com.sokima.pattern.chainofresponsibility.handler;

import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Notice a customer about readiness of the order, or about sending a courier to customer's home.
 * There a few reasons to notice
 * - a problem with an order (incorrect input {@link OrderDetails}),
 * - a problem with completing an order (not able to cook),
 * - an order is ready,
 * - a courier was sent,
 * - a courier was arrived.
 *
 * @author Roman Denysov
 */
public class NoticeHandler extends BaseOrderHandler {

    private final NoticeType notice;

    public NoticeHandler(NoticeType notice) {
        this.notice = notice;
    }

    @Override
    public void doOrder(OrderDetails orderDetails, Order order) {
        // some impl
        nextStep(orderDetails, order);
    }


    public enum NoticeType {
        BLACK_LIST, ORDER_COMPOSE, ORDER_DELIVER, ORDER_COOK, ORDER_COURIER, ORDER_ARRIVED
    }
}

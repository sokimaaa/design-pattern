package com.sokima.pattern.chainofresponsibility;

import com.sokima.pattern.chainofresponsibility.handler.*;
import com.sokima.pattern.chainofresponsibility.handler.NoticeHandler.NoticeType;
import com.sokima.pattern.chainofresponsibility.handler.exception.OrderChainInterruptException;
import com.sokima.pattern.chainofresponsibility.model.Order;
import com.sokima.pattern.chainofresponsibility.model.OrderDetails;

/**
 * Service for completing order.
 *
 * @author Roman Denysov
 */
public class OrderService {

    private final OrderHandler chain;

    public OrderService() {
        this.chain = new BlackListHandler()
                .next(new NoticeHandler(NoticeType.BLACK_LIST))
                .next(new ComposeHandler())
                .next(new NoticeHandler(NoticeType.ORDER_COMPOSE))
                .next(new DeliverHandler())
                .next(new AddressHandler())
                .next(new NoticeHandler(NoticeType.ORDER_DELIVER))
                .next(new CookHandler())
                .next(new NoticeHandler(NoticeType.ORDER_COOK))
                .next(new NoticeHandler(NoticeType.ORDER_COURIER))
                .next(new NoticeHandler(NoticeType.ORDER_ARRIVED))
                .next(new BillHandler());
    }


    public void order(OrderDetails orderDetails) {
        Order order = new Order();
        try {
            chain.doOrder(orderDetails, order);
        } catch (OrderChainInterruptException e) {
            rejectOrder(order);
        }
        // some impl
    }

    private void rejectOrder(Order order) {
        // some impl
    }
}

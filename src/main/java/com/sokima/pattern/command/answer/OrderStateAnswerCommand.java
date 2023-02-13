package com.sokima.pattern.command.answer;

import com.sokima.pattern.command.context.OrderContext;

/**
 * Command for waiter to take an order status.
 *
 * @author Roman Denysov
 */
public class OrderStateAnswerCommand extends AbstractAnswerCommand {
    public OrderStateAnswerCommand(OrderContext orderContext) {
        super(orderContext);
    }

    @Override
    public void execute() {
        // some impl
    }
}

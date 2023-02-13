package com.sokima.pattern.command.answer;

import com.sokima.pattern.command.context.OrderContext;

/**
 * Command for waiter to make an order.
 *
 * @author Roman Denysov
 */
public class MakeOrderAnswerCommand extends AbstractAnswerCommand {
    public MakeOrderAnswerCommand(OrderContext orderContext) {
        super(orderContext);
    }

    @Override
    public void execute() {
        // some impl
    }
}

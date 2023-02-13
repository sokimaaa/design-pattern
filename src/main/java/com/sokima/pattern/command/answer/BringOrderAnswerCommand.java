package com.sokima.pattern.command.answer;

import com.sokima.pattern.command.context.OrderContext;

/**
 * Command for waiter to bring a ready order.
 *
 * @author Roman Denysov
 */
public class BringOrderAnswerCommand extends AbstractAnswerCommand {
    public BringOrderAnswerCommand(OrderContext orderContext) {
        super(orderContext);
    }

    @Override
    public void execute() {
        // some impl
    }
}

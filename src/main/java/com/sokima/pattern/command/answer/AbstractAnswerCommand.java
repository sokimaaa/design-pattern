package com.sokima.pattern.command.answer;

import com.sokima.pattern.command.Command;
import com.sokima.pattern.command.context.OrderContext;

/**
 * Implementation of boilerplate code for Answer-Command.
 *
 * @author Roman Denysov
 */
public abstract class AbstractAnswerCommand implements Command {
    protected final OrderContext orderContext;

    protected AbstractAnswerCommand(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    // some impl
}

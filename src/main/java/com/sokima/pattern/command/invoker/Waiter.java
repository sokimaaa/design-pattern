package com.sokima.pattern.command.invoker;

import com.sokima.pattern.command.cook.AbstractCookCommand;

/**
 * Invoker of {@link AbstractCookCommand}.
 *
 * @author Roman Denysov
 */
public class Waiter {
    private AbstractCookCommand cookCommand;

    public void executeCommand() {
        cookCommand.execute();
        // some impl
    }

    public void setCookCommand(AbstractCookCommand cookCommand) {
        this.cookCommand = cookCommand;
    }

    // some impl
}

package com.sokima.pattern.command.cook;

import com.sokima.pattern.command.Command;
import com.sokima.pattern.command.context.CookPreferences;

/**
 * Implementation of boilerplate code for Cook-Command.
 *
 * @author Roman Denysov
 */
public abstract class AbstractCookCommand implements Command {
    protected final CookPreferences cookPreferences;

    protected AbstractCookCommand(CookPreferences cookPreferences) {
        this.cookPreferences = cookPreferences;
    }

    // some impl
}

package com.sokima.pattern.command.cook;

import com.sokima.pattern.command.context.CookPreferences;
import com.sokima.pattern.command.service.CookService;

/**
 * Command for cooking a burger by providing preferences.
 *
 * @author Roman Denysov
 */
public class BurgerCookCommand extends AbstractCookCommand {
    private final CookService cookService;

    public BurgerCookCommand(CookPreferences cookPreferences, CookService cookService) {
        super(cookPreferences);
        this.cookService = cookService;
    }

    @Override
    public void execute() {
        // some impl
    }
}

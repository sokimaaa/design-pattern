package com.sokima.pattern.command.cook;

import com.sokima.pattern.command.context.CookPreferences;
import com.sokima.pattern.command.service.CookService;

/**
 * Command for cooking a steak by providing preferences.
 *
 * @author Roman Denysov
 */
public class SteakCookCommand extends AbstractCookCommand {
    private final CookService cookService;

    public SteakCookCommand(CookPreferences cookPreferences, CookService cookService) {
        super(cookPreferences);
        this.cookService = cookService;
    }

    @Override
    public void execute() {
        // some impl
    }
}

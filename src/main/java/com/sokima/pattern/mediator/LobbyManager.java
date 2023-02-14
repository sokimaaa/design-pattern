package com.sokima.pattern.mediator;

import com.sokima.pattern.mediator.executor.Executor;

/**
 * Mediator Pattern.
 * Manage concrete {@link Executor} in proper way.
 *
 * @author Roman Denysov
 */
public interface LobbyManager {
    void manageExecutor(Executor executor);
}

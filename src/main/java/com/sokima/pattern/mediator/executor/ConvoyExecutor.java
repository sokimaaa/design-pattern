package com.sokima.pattern.mediator.executor;

import com.sokima.pattern.mediator.LobbyManager;
import com.sokima.pattern.mediator.task.ConvoyTask;
import com.sokima.pattern.mediator.task.TaskType;

/**
 * Concrete executor that executes {@link ConvoyTask}.
 *
 * @author Roman Denysov
 */
public class ConvoyExecutor implements Executor {
    private LobbyManager manager;

    @Override
    public TaskType executorResponsibility() {
        // some impl
        return null;
    }

    @Override
    public void beginExecution() {
        manager.manageExecutor(this);
        // some impl
    }

    @Override
    public void execute() {
        // some impl
    }

    @Override
    public void setLobbyManager(LobbyManager manager) {
        this.manager = manager;
    }
}

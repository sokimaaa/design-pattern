package com.sokima.pattern.mediator.executor;

import com.sokima.pattern.mediator.LobbyManager;
import com.sokima.pattern.mediator.task.GatherTask;
import com.sokima.pattern.mediator.task.TaskType;

/**
 * Concrete executor that executes {@link GatherTask}.
 *
 * @author Roman Denysov
 */
public class GatherExecutor implements Executor {
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

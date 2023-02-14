package com.sokima.pattern.mediator.executor;

import com.sokima.pattern.mediator.LobbyManager;
import com.sokima.pattern.mediator.task.TaskType;

/**
 * Describes methods of Executor.
 *
 * @author Roman Denysov
 */
public interface Executor {
    TaskType executorResponsibility();

    void beginExecution();

    void execute();

    void setLobbyManager(LobbyManager manager);
}

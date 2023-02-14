package com.sokima.pattern.mediator;

import com.sokima.pattern.mediator.executor.BuildExecutor;
import com.sokima.pattern.mediator.executor.ConvoyExecutor;
import com.sokima.pattern.mediator.executor.Executor;
import com.sokima.pattern.mediator.executor.GatherExecutor;
import com.sokima.pattern.mediator.task.Task;

/**
 * {@link LobbyManager} for assigning concrete {@link Task} to concrete {@link Executor}.
 *
 * @author Roman Denysov
 */
public class TaskAssignLobbyManager implements LobbyManager {
    private GatherExecutor gatherExecutor;
    private ConvoyExecutor convoyExecutor;
    private BuildExecutor buildExecutor;

    @Override
    public void manageExecutor(Executor executor) {
        // some impl
    }

    private void assignGatherTask() {
        // some impl
    }

    private void assignConvoyTask() {
        // some impl
    }

    private void assignBuildTask() {
        // some impl
    }
}

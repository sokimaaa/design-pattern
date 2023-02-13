package com.sokima.pattern.command.invoker;

import com.sokima.pattern.command.answer.AbstractAnswerCommand;

/**
 * Invoker of {@link AbstractAnswerCommand}.
 *
 * @author Roman Denysov
 */
public class Client {
    private AbstractAnswerCommand answerCommand;

    public void executeCommand() {
        answerCommand.execute();
        // some impl
    }

    public void setAnswerCommand(AbstractAnswerCommand answerCommand) {
        this.answerCommand = answerCommand;
    }

    // some impl
}

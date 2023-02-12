package com.sokima.pattern.state.timer;

/**
 * Interface describes Timer and methods to start and get time.
 *
 * @author Roman Denysov
 */
public interface CoolDownSpellTimer {
    void startTimer();

    boolean isOver();

    boolean isStarted();

    void stopTimer();

    default void restartTimer() {
        stopTimer();
        startTimer();
    }
}

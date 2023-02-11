package com.sokima.pattern.memento;

/**
 * Interface describes methods that editor has.
 *
 * @author Roman Denysov
 */
public interface Editor<T> {
    void write(T input);

    void save();

    void undo();

    // some other editor methods
}

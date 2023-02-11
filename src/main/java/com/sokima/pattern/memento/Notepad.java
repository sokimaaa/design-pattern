package com.sokima.pattern.memento;

import com.sokima.pattern.memento.TextArea.Snapshot;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Represent text editor.
 *
 * @author Roman Denysov
 */
public class Notepad implements Editor<String> {
    private TextArea textArea;

    private Deque<Snapshot> changeHistory;

    public Notepad() {
        this.textArea = new TextArea();
        this.changeHistory = new LinkedList<>();
    }

    @Override
    public void write(String text) {
        textArea.append(text);
        // some impl
    }

    @Override
    public void save() {
        Snapshot snapshot = textArea.takeSnapshot();
        changeHistory.add(snapshot);
        // some impl
    }

    @Override
    public void undo() {
        textArea.restore(changeHistory.pop());
        // some impl
    }
}

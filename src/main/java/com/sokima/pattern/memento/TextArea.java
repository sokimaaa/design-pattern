package com.sokima.pattern.memento;

/**
 * Represent a text area.
 *
 * @author Roman Denysov
 */
public class TextArea {

    private StringBuilder text;

    public TextArea() {
        this.text = new StringBuilder();
    }

    public void append(String input) {
        text.append(input);
    }

    public Snapshot takeSnapshot() {
        return new Snapshot(this);
    }

    public void restore(Snapshot snapshot) {
        this.text = new StringBuilder(snapshot.getSavedText());
    }

    /**
     * Memento Pattern.
     * Snapshot to save a provided state of {@link TextArea} and to expose it when needed.
     */
    public static class Snapshot {
        private final String text;

        private Snapshot(TextArea area) {
            this.text = area.text.toString();
        }

        private String getSavedText() {
            return text;
        }
    }
}

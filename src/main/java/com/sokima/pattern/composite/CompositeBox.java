package com.sokima.pattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represent the Composite Box.
 * It contains another composite boxes or leaves.
 *
 * @author Roman Denysov
 */
public class CompositeBox implements Box {
    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        children.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
        return children.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();
    }
}

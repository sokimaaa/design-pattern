package com.sokima.pattern.bridge.shape;

import com.sokima.pattern.bridge.color.Color;

/**
 * Bridge Pattern.
 * Represent common shape abstraction.
 * Replace inheritance with composition.
 *
 * @author Roman Denysov
 */
public abstract class Shape {
    protected final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    // some impl
}

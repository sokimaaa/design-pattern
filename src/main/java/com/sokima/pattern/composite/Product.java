package com.sokima.pattern.composite;

/**
 * Represent simple box (rather concrete product in the box).
 * It also calls a leaf.
 *
 * @author Roman Denysov
 */
public abstract class Product implements Box {
    protected final double price;

    protected Product(double price) {
        this.price = price;
    }

    protected double getPrice() {
        return price;
    }

    // some impl
}

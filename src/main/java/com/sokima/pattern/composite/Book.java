package com.sokima.pattern.composite;

/**
 * Represent concrete product stored in the box.
 *
 * @author Roman Denysov
 */
public class Book extends Product {
    public Book(double price) {
        super(price);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    // some impl
}

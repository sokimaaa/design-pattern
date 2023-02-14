package com.sokima.pattern.composite;

/**
 * Represent concrete product stored in the box.
 *
 * @author Roman Denysov
 */
public class VideoGame extends Product {
    public VideoGame(double price) {
        super(price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    // some impl
}

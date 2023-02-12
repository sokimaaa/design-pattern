package com.sokima.pattern.builder;

import com.sokima.pattern.builder.car.Car;

/**
 * Class for pre-configured {@link Car}'s.
 *
 * @author Roman Denysov
 */
public class Director {

    public void buildBlueBugatti(CarBuilder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .height(115)
                .numberDoors(2);
    }

    public void buildYellowLamborghini(CarBuilder builder) {
        builder.brand("Lamborghini")
                .color("Yellow")
                .height(115)
                .numberDoors(2);
    }

    // other presets
}

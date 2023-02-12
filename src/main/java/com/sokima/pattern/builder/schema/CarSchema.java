package com.sokima.pattern.builder.schema;

import com.sokima.pattern.builder.car.Car;

/**
 * Represent Schema of the {@link Car}.
 *
 * @author Roman Denysov
 */
public class CarSchema {
    private final long id;
    private final String brand;
    private final String model;
    private final String color;
    private final int numberDoors;
    private final String screenType;
    private final double weight;
    private final double height;

    CarSchema(long id, String brand, String model, String color, int numberDoors, String screenType, double weight, double height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numberDoors = numberDoors;
        this.screenType = screenType;
        this.weight = weight;
        this.height = height;
    }
}

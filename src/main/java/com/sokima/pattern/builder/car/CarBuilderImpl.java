package com.sokima.pattern.builder.car;

import com.sokima.pattern.builder.CarBuilder;

/**
 * Implementation of {@link CarBuilder} for {@link Car}.
 *
 * @author Roman Denysov
 */
public class CarBuilderImpl implements CarBuilder {
    private long id;
    private String brand;
    private String model;
    private String color;
    private int numberDoors;
    private String screenType;
    private double weight;
    private double height;

    public CarBuilderImpl() {

    }

    @Override
    public CarBuilderImpl id(long id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilderImpl brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilderImpl model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilderImpl color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilderImpl numberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
        return this;
    }

    @Override
    public CarBuilderImpl screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }

    @Override
    public CarBuilderImpl weight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public CarBuilderImpl height(double height) {
        this.height = height;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, color, numberDoors, screenType, weight, height);
    }
}

package com.sokima.pattern.builder.schema;

import com.sokima.pattern.builder.CarBuilder;

/**
 * Implementation of {@link CarBuilder} for {@link CarSchema}.
 *
 * @author Roman Denysov
 */
public class CarSchemaBuilderImpl implements CarBuilder {
    private long id;
    private String brand;
    private String model;
    private String color;
    private int numberDoors;
    private String screenType;
    private double weight;
    private double height;

    public CarSchemaBuilderImpl() {

    }

    @Override
    public CarSchemaBuilderImpl id(long id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl numberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl weight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl height(double height) {
        this.height = height;
        return this;
    }

    public CarSchema build() {
        return new CarSchema(id, brand, model, color, numberDoors, screenType, weight, height);
    }
}

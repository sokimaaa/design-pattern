package com.sokima.pattern.builder;

/**
 * Builder Pattern.
 * Setting a bunch of fields by invoking a methods.
 *
 * @author Roman Denysov
 */
public interface CarBuilder {
    CarBuilder id(long id);

    CarBuilder brand(String brand);

    CarBuilder model(String model);

    CarBuilder color(String color);

    CarBuilder numberDoors(int numberDoors);

    CarBuilder screenType(String screenType);

    CarBuilder weight(double weight);

    CarBuilder height(double height);
}

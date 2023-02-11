package com.sokima.pattern.prototype.car;

import com.sokima.pattern.prototype.Vehicle;

/**
 * Represent an abstract car.
 *
 * @author Roman Denysov
 */
public abstract class Car implements Vehicle {

    private String color;
    private String mark;
    private String model;
    private int maxSpeed;

    // some other fields

    protected Car() {
    }

    protected Car(String color, String mark, String model, int maxSpeed) {
        this.color = color;
        this.mark = mark;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    protected Car(Car car) {
        this.color = car.color;
        this.mark = car.mark;
        this.model = car.model;
        this.maxSpeed = car.maxSpeed;
    }

    // some impl
}

package com.sokima.pattern.prototype.car;

/**
 * Represent a Private Limousine Car.
 *
 * @author Roman Denysov
 */
public class PrivateLimousineCar extends LimousineCar {

    private String owner;

    public PrivateLimousineCar() {
    }

    public PrivateLimousineCar(String color, String mark, String model, int maxSpeed, String door, String height, String accessibleRoutes, String owner) {
        super(color, mark, model, maxSpeed, door, height, accessibleRoutes);
        this.owner = owner;
    }

    protected PrivateLimousineCar(PrivateLimousineCar car) {
        super(car);
        this.owner = car.owner;
    }

    @Override
    public PrivateLimousineCar clone() {
        return new PrivateLimousineCar(this);
    }

    // some impl
}

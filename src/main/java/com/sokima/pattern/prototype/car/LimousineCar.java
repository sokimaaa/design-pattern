package com.sokima.pattern.prototype.car;

/**
 * Represent a Limousine Car.
 *
 * @author Roman Denysov
 */
public class LimousineCar extends Car {

    private String door;
    private String height;
    private String accessibleRoutes;

    public LimousineCar() {
    }

    public LimousineCar(String color, String mark, String model, int maxSpeed, String door, String height, String accessibleRoutes) {
        super(color, mark, model, maxSpeed);
        this.door = door;
        this.height = height;
        this.accessibleRoutes = accessibleRoutes;
    }

    protected LimousineCar(LimousineCar car) {
        super(car);
        this.door = car.door;
        this.height = car.height;
        this.accessibleRoutes = car.accessibleRoutes;
    }

    @Override
    public LimousineCar clone() {
        return new LimousineCar(this);
    }

    // some impl
}

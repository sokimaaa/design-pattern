package com.sokima.pattern.prototype.car;

/**
 * Represent a Sport Car.
 *
 * @author Roman Denysov
 */
public class SportCar extends Car {

    private String saloon;
    private String gps;

    public SportCar() {

    }

    public SportCar(String color, String mark, String model, int maxSpeed, String saloon, String gps) {
        super(color, mark, model, maxSpeed);
        this.saloon = saloon;
        this.gps = gps;
    }

    protected SportCar(SportCar car) {
        super(car);
        this.saloon = car.saloon;
        this.gps = car.gps;
    }

    @Override
    public SportCar clone() {
        return new SportCar(this);
    }

    // some impl
}

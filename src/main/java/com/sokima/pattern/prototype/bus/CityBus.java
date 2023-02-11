package com.sokima.pattern.prototype.bus;

import java.time.Instant;

/**
 * Represent a City Bus.
 *
 * @author Roman Denysov
 */
public class CityBus extends Bus {

    private String cityRoute;
    private String city;
    private Instant workTime;

    public CityBus() {
    }

    public CityBus(String busType, String busNumber, int passengerCount, String cityRoute, String city, Instant workTime) {
        super(busType, busNumber, passengerCount);
        this.cityRoute = cityRoute;
        this.city = city;
        this.workTime = workTime;
    }

    protected CityBus(CityBus bus) {
        super(bus);
        this.cityRoute = bus.cityRoute;
        this.city = bus.city;
        this.workTime = bus.workTime;
    }

    @Override
    public CityBus clone() {
        return new CityBus(this);
    }

    // some impl
}

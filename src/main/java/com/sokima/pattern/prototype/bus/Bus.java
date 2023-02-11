package com.sokima.pattern.prototype.bus;

import com.sokima.pattern.prototype.Vehicle;

/**
 * Represent an abstract bus.
 *
 * @author Roman Denysov
 */
public abstract class Bus implements Vehicle {

    private String busType;
    private String busNumber;
    private int passengerCount;

    // some other fields

    protected Bus() {
    }

    protected Bus(String busType, String busNumber, int passengerCount) {
        this.busType = busType;
        this.busNumber = busNumber;
        this.passengerCount = passengerCount;
    }

    protected Bus(Bus bus) {
        this.busType = bus.busType;
        this.busNumber = bus.busNumber;
        this.passengerCount = bus.passengerCount;
    }

    // some impl
}

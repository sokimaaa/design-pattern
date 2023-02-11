package com.sokima.pattern.prototype;

/**
 * Prototype Pattern.
 * Interface provides clone() method to create exact copy of vehicle.
 * Method clone() implements using 'Copy Construct'.
 * Interface describes methods to interact with vehicle.
 *
 * @author Roman Denysov
 */
public interface Vehicle {
    Vehicle clone();

    // some impl
}

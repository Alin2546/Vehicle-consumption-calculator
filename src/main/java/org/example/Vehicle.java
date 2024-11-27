package org.example;

/**
 * Abstract class representing a generic vehicle.
 * Defines the core behaviors that all vehicle types must implement.
 */
abstract class Vehicle {

    /**
     * Starts the vehicle.
     */
    abstract void start();

    /**
     * Stops the vehicle.
     */
    abstract void stop();

    /**
     * Drives the vehicle for a specified distance.
     *
     * @param n the distance to drive, in kilometers
     */
    abstract void drive(double n);
}


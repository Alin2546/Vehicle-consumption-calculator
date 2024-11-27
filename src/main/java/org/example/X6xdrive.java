package org.example;

/**
 *
 Concrete Class representing a BMW model.
 */
public class X6xdrive extends BMW {
    public X6xdrive(String chassisNumber, int availableFuel) {
        super(FuelType.DIESEL, 70, 8, 9.0, chassisNumber, 17, availableFuel);
    }
}

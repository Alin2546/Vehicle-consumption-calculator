package org.example;

/**
 * Concrete Class representing a Dacia model.
 */
public class Sandero extends Dacia {

    public Sandero(String chassisNumber, int availableFuel) {
        super(FuelType.DIESEL, 42, 5, 4.8, chassisNumber, 16, availableFuel);
    }
}

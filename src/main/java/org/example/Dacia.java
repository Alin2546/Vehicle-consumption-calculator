package org.example;

/**
 * Abstract class representing Dacia brand.
 * Inherits common properties and behaviors from the {@code Car} class.
 */
public abstract class Dacia extends Car {


    public Dacia(FuelType fuelType, int fuelTankSize, int gears, double consumptionPer100Km, String chassisNumber, int tireSize, int availableFuel) {
        super(fuelType, fuelTankSize, gears, consumptionPer100Km, chassisNumber, tireSize, availableFuel);
    }
}

package org.example;

/**
 * Concrete Class representing a BMW model.
 * Inherits common properties and behaviors from the {@code BMW} class.
 */
public class M8 extends BMW {
    public M8(String chassisNumber, int availableFuel) {
        super(FuelType.DIESEL, 75, 8, 12, chassisNumber, 17, availableFuel);
    }

    /**
     * <p>
     * Provides specific implementation of the {@code drive} because the car has more hp and torque
     * and thus receives a unique implementation of the drive method.
     * </p>
     *
     * <p>
     * It's the same implementation as in {@code Car} but with variations which rumps up the fuel consumed.
     * </p>
     *
     * @param n the distance to drive in kilometers
     */
    @Override
    void drive(double n) {
        setKmDriven(getKmDriven() - n);
        if (getKmDriven() <= 0) {
            System.out.println("Fuel level :" + getKmDriven());
            throw new IllegalArgumentException("Empty tank, please refuel");

        }
        if (getCurrentGear() == 15) {
            switch (getCurrentGear()) {
                case 0:
                    setAvailableFuel((float) ((0.8 / 100) * n));
                    break;
                case 1:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100)) * 10));
                    break;
                case 2:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100)) * 8));
                    break;
                case 3:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100)) * 7));
                    break;
                case 4:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100)) * 6));
                    break;
                case 5:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100)) * 4));
                    break;
                case 6:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100)) * 3));
                    break;
                case 7:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100)) * 2));
                    break;
                case 8:
                    setAvailableFuel((float) ((n * (getConsumptionPer100Km() / 100))));
                    break;
                default:
                    throw new IllegalArgumentException("You shifted in rocket mode, please chose an available gear");
            }
        }
    }
}

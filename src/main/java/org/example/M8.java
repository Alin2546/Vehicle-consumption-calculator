package org.example;

public class M8 extends BMW {
    public M8(String chassisNumber, int availableFuel) {
        super(FuelType.DIESEL, 75, 8, 12, chassisNumber, 18, availableFuel);
    }

    public M8(FuelType fuelType, int fuelTankSize, int gears, double consumptionPer100Km, String chassisNumber, int tireSize, int availableFuel) {
        super(fuelType, fuelTankSize, gears, consumptionPer100Km, chassisNumber, tireSize, availableFuel);
    }

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

package org.example;

public abstract class Car extends Vehicle {

    enum FuelType {
        DIESEL,
        PETROL,
        ELECTRIC
    }

    private final FuelType fuelType;
    private final int fuelTankSize;
    private final int gears;
    private final double consumptionPer100Km;
    private float availableFuel;
    private int tireSize;
    private String chassisNumber;
    private double kmDriven = 0;
    private float remainedFuel = 0;
    private int currentGear = 0;
    private float averageFuelConsumption;


    public double getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }

    public float getRemainedFuel() {
        return remainedFuel;
    }


    public FuelType getFuelType() {
        return fuelType;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public int getGears() {
        return gears;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setAverageFuelConsumption(float averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public Car(FuelType fuelType, int fuelTankSize, int gears, double consumptionPer100Km, String chassisNumber, int tireSize, int availableFuel) {
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.chassisNumber = chassisNumber;
        this.tireSize = tireSize;
        this.availableFuel = availableFuel;
    }


    @Override
    void start() {
        this.remainedFuel = this.availableFuel;
        this.kmDriven = 0;
        this.currentGear = 0;
    }

    @Override
    void stop() {
        float fuelConsumed = this.remainedFuel - this.availableFuel;
        averageFuelConsumption = (fuelConsumed / (float) this.kmDriven) * 100;
    }

    @Override
    void drive(double n) {
        kmDriven += n;
        if (this.availableFuel <= 0) {
            System.out.println("Fuel level :" + this.availableFuel);
            throw new IllegalArgumentException("Empty tank, please refuel");
        }
        if (this.tireSize == 15) {
            switch (this.currentGear) {
                case 0:
                    this.availableFuel -= (0.8 / 100) * n;
                    break;
                case 1:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 5;
                    break;
                case 2:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 3;
                    break;
                case 3:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 2;
                    break;
                case 4:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100));
                    break;
                case 5:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 2;
                    break;
                case 6:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 3;
                    break;
                case 7:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 4;
                    break;
                case 8:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 5;
                    break;
                default:
                    throw new IllegalArgumentException("You shifted in rocket mode, please chose an available gear");
            }
        } else if (this.tireSize == 16) {
            switch (this.currentGear) {
                case 0:
                    this.availableFuel -= (0.8 / 100) * n;
                    break;
                case 1:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 6;
                    break;
                case 2:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 4;
                    break;
                case 3:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 3;
                    break;
                case 4:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) + 0.20;
                    break;
                case 5:
                    this.availableFuel -= ((n * (this.consumptionPer100Km / 100)) / 2) + 0.20;
                    break;
                case 6:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 3;
                    break;
                case 7:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 4;
                    break;
                case 8:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 5;
                    break;
                default:
                    throw new IllegalArgumentException("You shifted in rocket mode, please chose an available gear");
            }
        } else if (this.tireSize == 17) {
            switch (this.currentGear) {
                case 0:
                    this.availableFuel -= (0.8 / 100) * n;
                    break;
                case 1:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 7;
                    break;
                case 2:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 5;
                    break;
                case 3:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) * 4;
                    break;
                case 4:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) + 0.50;
                    break;
                case 5:
                    this.availableFuel -= ((n * (this.consumptionPer100Km / 100)) / 2) + 0.50;
                    break;
                case 6:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 3;
                    break;
                case 7:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 4;
                    break;
                case 8:
                    this.availableFuel -= (n * (this.consumptionPer100Km / 100)) / 5;
                    break;
                default:
                    throw new IllegalArgumentException("You shifted in rocket mode, please chose an available gear");
            }
        }
    }

    void shiftGear(int n) {
        this.currentGear = n;
    }

    public float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

}

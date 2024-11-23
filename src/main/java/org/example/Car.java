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
    private int currentGear = 0;

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

    public void setAvailableFuel(int availableFuel) {
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
    this.currentGear = 1;
    }

    @Override
    void stop() {
        this.currentGear = 0;
    }

    @Override
    void drive(double n) {
        switch (this.currentGear) {
            case 1:
                availableFuel -= n;
                break;
            case 2:
                availableFuel -= n;
                break;
            case 3:
                availableFuel -= n;
                break;
            case 4:
                availableFuel -= n;
                break;
            case 5:
                availableFuel -= n;
                break;
            default:
                System.out.println("Please switch the gears from rocket mode to an available gear");
        }
    }

    void shiftGear(int n) {
        this.currentGear = n;
    }

    float getAverageFuelConsumption() {
        return 0.000f;
    }
}

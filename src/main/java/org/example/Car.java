package org.example;


/**
 * Abstract class representing a Car, extending the Vehicle class.
 * Contains properties and behaviors common to all cars.
 */
public abstract class Car extends Vehicle {

    /**
     * Enumeration of fuel types supported by the car.
     */
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

    /**
     * Constructor for the Car class.
     *
     * @param fuelType            the type of fuel the car uses
     * @param fuelTankSize        the size of the fuel tank
     * @param gears               the number of gears in the car
     * @param consumptionPer100Km the fuel consumption per 100 km
     * @param chassisNumber       the chassis number of the car
     * @param tireSize            the size of the car's tires
     * @param availableFuel       the amount of fuel available in the tank
     */
    public Car(FuelType fuelType, int fuelTankSize, int gears, double consumptionPer100Km, String chassisNumber, int tireSize, int availableFuel) {
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.chassisNumber = chassisNumber;
        this.tireSize = tireSize;
        this.availableFuel = availableFuel;
    }

    /**
     * Shifts the car to a specified gear.
     *
     * @param n the gear to shift into
     */
    void shiftGear(int n) {
        this.currentGear = n;
    }

    @Override
    void start() {
        this.remainedFuel = this.availableFuel;
        this.kmDriven = 0;
        this.currentGear = 0;
    }

    /**
     * Stops the car and calculates the average fuel consumption based on fuel used and kilometers driven.
     */
    @Override
    void stop() {
        float fuelConsumed = this.remainedFuel - this.availableFuel;
        averageFuelConsumption = (fuelConsumed / (float) this.kmDriven) * 100;
    }

    /**
     * Drives the car for a specified distance and calculates the fuel used.
     *
     * @param n the distance to drive in kilometers
     * @throws IllegalArgumentException if the tank is empty or an invalid gear is used
     */
    @Override
    void drive(double n) {
        kmDriven += n;
        if (this.availableFuel <= 0) {
            System.out.println("Fuel level :" + this.availableFuel);
            throw new IllegalArgumentException("Empty tank, please refuel");
        }
        /**
         *  Logic for calculating fuel consumption based on tire size and current gear
         */
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

            /**
             * Logic for tire size 16 with slightly variations (Increased fuel consumption because the tiers are bigger and heavier)
             */
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
            /**
             * Logic for tyre size 17 , even more fuel consumed per km
             */
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

    /**
     * Gets the average fuel consumption.
     *
     * @return the average fuel consumption in liters per 100 km
     */
    public float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    /**
     * Gets the total kilometers driven by the car.
     *
     * @return the kilometers driven
     */
    public double getKmDriven() {
        return kmDriven;
    }

    /**
     * Sets the total kilometers driven by the car.
     *
     * @param kmDriven the kilometers to set
     */
    public void setKmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }

    /**
     * Gets the remaining fuel in the tank.
     *
     * @return the remaining fuel in liters
     */
    public float getRemainedFuel() {
        return remainedFuel;
    }

    /**
     * Gets the type of fuel the car uses.
     *
     * @return the fuel type
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Gets the size of the fuel tank.
     *
     * @return the fuel tank size in liters
     */
    public int getFuelTankSize() {
        return fuelTankSize;
    }

    /**
     * Gets the number of gears in the car.
     *
     * @return the number of gears
     */
    public int getGears() {
        return gears;
    }

    /**
     * Gets the fuel consumption per 100 km.
     *
     * @return the fuel consumption in liters
     */
    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    /**
     * Gets the available fuel in the tank.
     *
     * @return the available fuel in liters
     */
    public float getAvailableFuel() {
        return availableFuel;
    }

    /**
     * Sets the available fuel in the tank.
     *
     * @param availableFuel the amount of fuel to set
     */
    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    /**
     * Gets the tire size of the car.
     *
     * @return the tire size
     */
    public int getTireSize() {
        return tireSize;
    }

    /**
     * Sets the tire size of the car.
     *
     * @param tireSize the tire size to set
     */
    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    /**
     * Gets the chassis number of the car.
     *
     * @return the chassis number
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the chassis number of the car.
     *
     * @param chassisNumber the chassis number to set
     */
    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    /**
     * Gets the current gear of the car.
     *
     * @return the current gear
     */
    public int getCurrentGear() {
        return currentGear;
    }

    /**
     * Sets the current gear of the car.
     *
     * @param currentGear the gear to set
     */
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }


}

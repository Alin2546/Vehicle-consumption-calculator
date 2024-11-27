package org.example;

/**
 * The main application class to demonstrate the functionality of the Vehicle, Car, and its subclasses.
 */
public class App {

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {

        // Car car = new Car(); // This should not compile because Car is abstract.

        // Car car = new Dacia(27, "oiqe0934hkkadsn");
        // This should not compile!
        // If a Dacia car is to be created, an instance of a specific model like Logan must be used.

        Car car = new Logan(27, "oiqe0934hkkadsn"); // Creating a Logan car instance.

        car.start(); // Start the car.

        car.shiftGear(1); // Shift to gear 1.
        car.drive(0.01); // Drive 0.01 kilometers.

        car.shiftGear(2); // Shift to gear 2.
        car.drive(0.02); // Drive 0.02 kilometers.

        car.shiftGear(3); // Shift to gear 3.
        car.drive(0.5); // Drive 0.5 kilometers.

        car.shiftGear(4); // Shift to gear 4.
        car.drive(0.5); // Drive 0.5 kilometers.

        car.shiftGear(5); // Shift to gear 5.
        car.drive(10); // Drive 10 kilometers.

        car.shiftGear(4); // Shift to gear 4.
        car.drive(0.5); // Drive 0.5 kilometers.

        car.shiftGear(3); // Shift to gear 3.
        car.drive(0.1); // Drive 0.1 kilometers.

        car.stop(); // Stop the car.

        // Print available fuel after the trip.
        float availableFuel = car.getAvailableFuel();
        System.out.println("Available fuel: " + availableFuel);

        // Print average fuel consumption after the trip.
        float fuelConsumedPer100Km = car.getAverageFuelConsumption();
        System.out.println("Average fuel consumption: " + fuelConsumedPer100Km + " L/100km");

        // Create a new Logan instance using the Vehicle reference.
        Vehicle vehicle = new Logan(30, "1987ddkshik289"); // available fuel and chassis number.

        vehicle.start(); // Start the vehicle.

        vehicle.drive(1); // Drive 1 kilometer.

        vehicle.stop(); // Stop the vehicle.

        // Cast the Vehicle back to Car to access Car-specific methods.
        Car car2 = (Car) vehicle;

        // Print available fuel of the second car after the trip.
        float availableFuel2 = car2.getAvailableFuel();
        System.out.println("Available fuel (car2): " + availableFuel2);

        // Print average fuel consumption of the second car after the trip.
        float fuelConsumedPer100Km2 = car2.getAverageFuelConsumption();
        System.out.println("Average fuel consumption (car2): " + fuelConsumedPer100Km2 + " L/100km");
    }
}


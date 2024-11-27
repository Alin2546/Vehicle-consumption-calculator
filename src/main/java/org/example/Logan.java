package org.example;

/**gi
 * Concrete Class representing a Dacia model.
 */
public class Logan extends Dacia {

    public Logan(int availableFuel, String chassisNumber) {
        super(FuelType.PETROL, 44, 5, 4.9, chassisNumber, 15, availableFuel);
    }
}

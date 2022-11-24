package models;

import enums.MotorcycleType;

public class Motorcycle extends Vehicle {

    private MotorcycleType type;

    public Motorcycle(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed, MotorcycleType type) {
        super(brand, model, maximumAllowableWeight, numberOfPassengers, maximumSpeed);
        this.type = type;
    }

    public MotorcycleType getType() {
        return type;
    }

    public void setType(MotorcycleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " motorcycle\n" +
                super.toString();
    }
}

package models;

import enums.BusType;

public class Bus extends Car{
    private BusType type;

    public Bus(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed, BusType type) {
        super(brand, model, maximumAllowableWeight, numberOfPassengers, maximumSpeed);
        this.type = type;
    }

    public BusType getType() {
        return type;
    }

    public void setType(BusType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " bus\n" +
                super.toString();
    }
}

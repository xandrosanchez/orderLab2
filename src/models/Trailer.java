package models;

import enums.TrailerType;

public class Trailer extends Vehicle {

    private TrailerType type;

    public Trailer(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed, TrailerType type) {
        super(brand, model, maximumAllowableWeight, numberOfPassengers, maximumSpeed);
        this.type = type;
    }

    public TrailerType getType() {
        return type;
    }

    public void setType(TrailerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " trailer\n" +
                super.toString();
    }
}

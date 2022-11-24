package models;

import enums.TrackType;

public class Track extends Car {

    private TrackType type;

    public Track(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed, TrackType type, Trailer trailer) {
        super(brand, model, maximumAllowableWeight, numberOfPassengers, maximumSpeed, trailer);
        this.type = type;
    }

    public Track(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed, TrackType type) {
        super(brand, model, maximumAllowableWeight, numberOfPassengers, maximumSpeed);
        this.type = type;
    }

    public TrackType getType() {
        return type;
    }

    public void setType(TrackType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " track\n" +
                super.toString();
    }
}

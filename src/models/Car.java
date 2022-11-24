package models;

public class Car extends Vehicle {

    private Trailer trailer;

    public Car(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed, Trailer trailer) {
        super(brand, model, maximumAllowableWeight, numberOfPassengers, maximumSpeed);
        this.trailer = trailer;
        checkMaxSpeed();
        adjustmentMaximumAllowableWeight();
    }

    public Car(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed) {
        super(brand, model, maximumAllowableWeight, numberOfPassengers, maximumSpeed);
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    private void checkMaxSpeed(){
        if (getMaximumSpeed() > 90){
            super.setMaximumSpeed(90);
        }
    }

    private void adjustmentMaximumAllowableWeight(){
        super.setMaximumAllowableWeight(getMaximumAllowableWeight() + trailer.getMaximumAllowableWeight());
    }

}

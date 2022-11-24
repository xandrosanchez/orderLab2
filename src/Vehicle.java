public class Vehicle {

    private String brand;
    private String model;
    private int maximumAllowableWeight;
    private int numberOfPassengers;
    private int maximumSpeed;

    public Vehicle(String brand, String model, int maximumAllowableWeight, int numberOfPassengers, int maximumSpeed) {
        this.brand = brand;
        this.model = model;
        this.maximumAllowableWeight = maximumAllowableWeight;
        this.numberOfPassengers = numberOfPassengers;
        this.maximumSpeed = maximumSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaximumAllowableWeight() {
        return maximumAllowableWeight;
    }

    public void setMaximumAllowableWeight(int maximumAllowableWeight) {
        this.maximumAllowableWeight = maximumAllowableWeight;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle: " + brand + " " + model + "\n" +
                "Maximum allowable weight: " + maximumAllowableWeight +
                "\nNumber of passengers: " + numberOfPassengers +
                "\nMaximum speed: " + maximumSpeed;
    }
}

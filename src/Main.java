import enums.BusType;
import enums.MotorcycleType;
import enums.TrackType;
import enums.TrailerType;
import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Trailer trailer = new Trailer("North","A54",1500,5,90, TrailerType.Passenger);
        Car car = new Car("Toyota","Hilux",2200,5,170,trailer);
        Bus bus = new Bus("ZIL", "1508",2700,40,80, BusType.Special);
        Track track = new Track("URAL","M1449",5600,3,90, TrackType.Military);
        Motorcycle motorcycle = new Motorcycle("Suzuki","Speedy",170,2,220, MotorcycleType.Sport);

        vehicles.add(trailer);
        vehicles.add(car);
        vehicles.add(bus);
        vehicles.add(track);
        vehicles.add(motorcycle);

        demonstration(vehicles);
    }

    public static void demonstration(ArrayList<Vehicle> list){
        for (Vehicle vehicle : list) {
            System.out.println(vehicle);
            System.out.println();
        }
    }
}
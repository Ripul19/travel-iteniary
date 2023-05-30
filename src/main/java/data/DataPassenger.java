package data;

import travel.Passenger;

import java.util.ArrayList;
import java.util.List;

public class DataPassenger {
    public static List<Passenger> createHardCodedUser(){

        List<Passenger> passenger = new ArrayList<>();

        passenger.add(new Passenger("John Doe", "Premium", 12345, 10000));
        passenger.add(new Passenger("Jane Smith", "Gold", 23456, 20000));
        passenger.add(new Passenger("Jada Williams", "standard", 34567, 30000));

        return passenger;
    }
}

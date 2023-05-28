package data;

import travel.Passenger;

import java.util.ArrayList;
import java.util.List;

public class GetUser {
    public static List<Passenger> createHardCodedUser(){

        List<Passenger> passenger = new ArrayList<>();

        passenger.add(new Passenger("john.doe@gmail.com", "12345678", "John Doe", "Premium", 123456789));
        passenger.add(new Passenger("jane.smith@gmail.com", "234567891", "Jane Smith", "Gold", 234567891));
        passenger.add(new Passenger("jada.williams@gmail.com", "345678912", "Jada Williams", "standard", 345678912));

        return passenger;
    }
}

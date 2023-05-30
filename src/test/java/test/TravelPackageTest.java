package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import travel.Activity;
import travel.Destination;
import travel.Passenger;
import travel.TravelPackage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelPackageTest {

    private TravelPackage travelPackage;

    @Test
    void testGetters() {

        List<Destination> destinationList = new ArrayList<>();
        destinationList.add(new Destination("Kerala"));
        destinationList.add(new Destination("Manali"));
        travelPackage = new TravelPackage("Travel Package 1", 10, destinationList);

        assertEquals("Travel Package 1", travelPackage.getName());
        assertEquals(10, travelPackage.getCapacity());

        List<Destination> list = travelPackage.getDestinationList();
        assertEquals(2, destinationList.size());
        assertEquals("Kerala", destinationList.get(0).getName());
        assertEquals("Manali", destinationList.get(1).getName());
    }

    @Test
    public void testAddPassenger() {

        List<Destination> destinationList = new ArrayList<>();
        destinationList.add(new Destination("Kerala"));
        destinationList.add(new Destination("Manali"));
        travelPackage = new TravelPackage("Travel Package 1", 10, destinationList);

        Passenger passenger = new Passenger("John", "Standard", 123, 0);
        travelPackage.addPassenger(passenger);

        List<Passenger> bookedPassengers = travelPackage.getBookedPassengers();

        assertEquals(1, bookedPassengers.size());
        assertEquals("John", bookedPassengers.get(0).getName());
    }

    @Test
    public void testSetCapacity() {

        List<Destination> destinationList = new ArrayList<>();
        destinationList.add(new Destination("Kerala"));
        destinationList.add(new Destination("Manali"));
        travelPackage = new TravelPackage("Travel Package 1", 10, destinationList);

        travelPackage.setCapacity();
        assertEquals(9, travelPackage.getCapacity());
    }
}
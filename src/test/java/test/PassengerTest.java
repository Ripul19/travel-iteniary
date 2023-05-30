package test;

import org.junit.jupiter.api.Test;
import travel.Activity;
import travel.Passenger;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {


    @Test
    void testGetters() {
        Passenger passenger = new Passenger("John", "Standard", 1234, 100.0);

        assertEquals("John", passenger.getName());
        assertEquals("Standard", passenger.getType());
        assertEquals(1234, passenger.getNumber());
        assertEquals(100.0, passenger.getBalance());
    }


    @Test
    void testSetBalance() {
        Passenger passenger = new Passenger("John", "Standard", 1234, 100.0);
        passenger.setBalance(200.0);
        assertEquals(200.0, passenger.getBalance());
    }

    @Test
    void testCheckPerson() {
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = new Passenger("John", "Standard", 1234, 100.0);
        passengers.add(passenger1);

        assertTrue(Passenger.checkPerson("John", passengers));
        assertFalse(Passenger.checkPerson("Smith", passengers));
    }

    @Test
    void testGetPerson() {
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = new Passenger("John", "Standard", 1234, 100.0);
        passengers.add(passenger1);

        assertEquals(passenger1, Passenger.getPerson("John", passengers));
    }

    @Test
    void testCreatePerson() {
        Passenger passenger = Passenger.createPerson("John");
        assertNotNull(passenger);
        assertEquals("John", passenger.getName());
    }


    @Test
    void testPrintPassenger() {
        Passenger passenger = new Passenger("John", "Standard", 1234, 100.0);
        assertDoesNotThrow(() -> Passenger.printPassenger(passenger));
    }
}
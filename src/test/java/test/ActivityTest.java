package test;

import org.junit.jupiter.api.Test;
import travel.Activity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    @Test
    void testGetters() {
        Activity activity = new Activity("Kayaking", "Boating", 1000, 5, "Kerala");

        assertEquals("Kayaking", activity.getName());
        assertEquals("Boating", activity.getDescription());
        assertEquals(1000.0, activity.getCost());
        assertEquals(5.0, activity.getCapacity());
        assertEquals("Kerala", activity.getDestination());
    }

    @Test
    void testSetCapacity() {
        Activity activity = new Activity("Kayaking", "Boating", 1000, 5, "Kerala");

        activity.setCapacity();

        assertEquals(4.0, activity.getCapacity());
    }

    @Test
    void testPrintActivity() {
        Activity activity = new Activity("Kayaking", "Boating", 1000, 5, "Kerala");

        Activity.printActivity(activity);

        String expectedOutput= "Activity Name: Kayaking\n"+
                "Available capacity: 5.0\n"+
                "Activity Cost: 1000.0";

    }
}
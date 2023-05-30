package test;

import data.DataDestination;
import org.junit.jupiter.api.Test;
import travel.Activity;
import travel.Destination;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

    @Test
    void testGetName() {
        travel.Destination destination = new Destination("Destination 1");
        assertEquals("Destination 1", destination.getName());
    }


    @Test
    void testCreateHardCodedDestinations() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Kayaking", "Boating", 1000, 5, "Kerala"));
        activities.add(new Activity("Paragliding", "Paragliding", 1000, 5, "Manali"));
        activities.add(new Activity("Elephant Riding", "Elephant Riding", 1000, 5, "Kerala"));
        activities.add(new Activity("Trekking", "Trekking", 1000, 5, "Manali"));
        activities.add(new Activity("Trekking", "Trekking", 1000, 5, "Kerala"));

        List<Destination> destinationList = DataDestination.createHardCodedDestinations(activities);

        assertEquals(2, destinationList.size());

        for(Destination destination: destinationList) {
            Destination.printDestination(destination);
        }
        Destination destination1 = destinationList.get(0);
        assertEquals("Kerala", destination1.getName());
        assertEquals(2, destination1.getListofActivity().size());
        Destination destination2 = destinationList.get(1);
        assertEquals("Manali", destination2.getName());
        assertEquals(2, destination2.getListofActivity().size());
    }
}


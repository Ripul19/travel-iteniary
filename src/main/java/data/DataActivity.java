package data;

import travel.Activity;

import java.util.ArrayList;
import java.util.List;

public class DataActivity {

    public static List<Activity> createHardCodedActivities(){
        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity("Kayaking", "Boating", 1000, 5, "Kerala"));
        activities.add(new Activity("Paragliding", "Paragliding", 1000, 5, "Manali"));
        activities.add(new Activity("Elephant Riding", "Elephant Riding", 1000, 5, "Kerala"));
        activities.add(new Activity("Trekking", "Trekking", 1000, 5, "Manali"));
        activities.add(new Activity("Trekking", "Trekking", 1000, 5, "Kerala"));

        return activities;
    }
}

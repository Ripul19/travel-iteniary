package data;

import travel.Activities;

import java.util.ArrayList;
import java.util.List;

public class GetActivities {

    public static List<Activities> createHardCodedActivities(){
        List<Activities> activities = new ArrayList<>();

        activities.add(new Activities("Karkying", "Boating", 1000, 5, "Kerala"));
        activities.add(new Activities("Paraglyding", "Paraglyding", 1000, 5, "Manali"));
        activities.add(new Activities("Elephant Riding", "Elephant Riding", 1000, 5, "Kerala"));
        activities.add(new Activities("Trekking", "Trekking", 1000, 5, "Manali"));

        return activities;
    }
}

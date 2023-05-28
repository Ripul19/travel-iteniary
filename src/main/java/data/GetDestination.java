package data;

import travel.Activities;
import travel.Destination;

import java.util.ArrayList;
import java.util.List;

public class GetDestination {
    public static List<Destination> createHardCodedDestinations(List<Activities> activitiesList){

//        List<Activities> activitiesList = GetActivities.createHardCodedActivities();
        List<Destination> destinations = new ArrayList<>();
        List<Activities> copy = new ArrayList<>();

        for(Activities activities: activitiesList ){
            if(activities.getDestination().equals("Manali")){
                //save activity in copy
                copy.add(activities);
            }
        }
        destinations.add(new Destination("Manali", copy));

        List copy2 = new ArrayList<>();
        for(Activities activities: activitiesList ){
            if(activities.getDestination().equals("Kerala")){
                //save activity in copy
                copy2.add(activities);
            }
        }
        destinations.add(new Destination("Kerala", copy));
        return destinations;
    }
}

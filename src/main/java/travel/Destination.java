package travel;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String destinationName;
    private List<Activity> activities;

    public Destination(String destinationName){
        this.destinationName = destinationName;
        this.activities= new ArrayList<>();
    }

    //Getters
    public String getName(){
        return destinationName;
    }

    public List<Activity> getListofActivity() {
        return activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    //print destination
    public static void printDestination(Destination destination){
        System.out.println("Destination: "+destination.destinationName);

        for(Activity activity: destination.activities){
            if(activity!=null) {
                Activity.printActivity(activity);
            }
        }

    }
}

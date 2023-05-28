package travel;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activities> activities = new ArrayList<>();

    public Destination(String name, List<Activities> activities){
        this.name = name;
        this.activities = activities;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public List<Activities> getActivities(){
        return this.activities;
    }
}

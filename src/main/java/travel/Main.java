package travel;

import data.GetActivities;
import data.GetDestination;
import data.GetTravelPackage;
import data.GetUser;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //data created
        List<Passenger> passengers= GetUser.createHardCodedUser();
        List<Activities> activities = GetActivities.createHardCodedActivities();
        List<Destination> destinations = GetDestination.createHardCodedDestinations(activities);
        List<TravelPackage> packages = GetTravelPackage.createHardCodedTravelPackage(destinations);

        //login
        //Passenger passenger = Login.welcome(passengers);

        for(Passenger pass : passengers){
            System.out.println(pass);
        }

        //Travel packages data
        //travel package menu
        //Destination data
        //Destination menu
        //Activity Data
        //Activity menu
    }
}

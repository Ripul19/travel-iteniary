package data;

import java.util.ArrayList;
import java.util.List;

import travel.Destination;
import travel.TravelPackage;

public class GetTravelPackage {

    public static List<TravelPackage> createHardCodedTravelPackage(List<Destination> destinations){

//        List<Destination> destinations = GetDestination.createHardCodedDestinations();
        List<TravelPackage> packages = new ArrayList<>();
        List<Destination> copy = new ArrayList<>();

        for(Destination destination: destinations){
            if(destination.getName().equals("Manali")){
                copy.add(destination);
                packages.add(new TravelPackage("North India", copy, 5));
            }
            else if(destination.getName().equals("Kerala")){
                copy.add(destination);
                packages.add(new TravelPackage("South India", copy, 5));
            }
        }

        return packages;

    }
}

package data;

import java.util.ArrayList;
import java.util.List;

import travel.Destination;
import travel.TravelPackage;

public class GetTravelPackage {

    public static List<TravelPackage> createHardCodedTravelPackage(List<Destination> destinations){

//        List<Destination> destinations = GetDestination.createHardCodedDestinations();
        List<TravelPackage> packages = new ArrayList<>();

        for(Destination destination: destinations){
            List<Destination> copy = new ArrayList<>();
            if(destination.getName().equals("Manali")){
                copy.add(destination);
                packages.add(new TravelPackage("North India", copy, 5, 5000));
            }
            else if(destination.getName().equals("Kerala")){
                List<Destination> copy2 = new ArrayList<>();
                copy2.add(destination);
                packages.add(new TravelPackage("South India", copy2, 5, 5000));
            }
        }

        return packages;

    }
}

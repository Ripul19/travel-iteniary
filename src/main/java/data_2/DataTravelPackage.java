package data_2;

import java.util.ArrayList;
import java.util.List;

import travel_2.Activity;
import travel_2.Destination;
import travel_2.TravelPackage;


public class DataTravelPackage {

    public static List<TravelPackage> createHardCodedTravelPackage(List<Destination> destinationList){
        List<TravelPackage> packages = new ArrayList<>();
        int i = 1;
        for(Destination destination: destinationList){
            packages.add(new TravelPackage("Travel Package "+i, 50, List.of(destination)));
            i++;
        }
        return packages;
    }
}

package data;

import java.util.ArrayList;
import java.util.List;

import travel.Destination;
import travel.TravelPackage;


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

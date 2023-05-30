package data;

import travel.Activity;
import travel.Destination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataDestination {

    public static List<Destination> createHardCodedDestinations(List<Activity> activities) {
        List<Destination> destinationList = new ArrayList<>();

        Set<String> uniqueDestinationNames = new HashSet<>();

        for(Activity acti: activities){
            boolean exist = false;
            String destinationName = acti.getDestination();

            //activity check code for same activity
            for(Destination destination : destinationList){
                for(Activity actiCheck : destination.getListofActivity()){
                    if(actiCheck.getName().equalsIgnoreCase(acti.getName())){
                        exist= true;
                        break;
                    }
                }
                if(exist){
                    break;
                }
            }
            if(!exist){
                //add data to destination with activity list

                    if(uniqueDestinationNames.contains(destinationName)){
                        for(Destination destination: destinationList){

                            if(destination.getName().equalsIgnoreCase(destinationName)){
                                destination.addActivity(acti);
                                break;
                            }
                        }
                    }else {
                        uniqueDestinationNames.add(destinationName);
                        Destination newDestination = new Destination(destinationName);
                        newDestination.addActivity(acti);
                        destinationList.add(newDestination);
                    }
            }
        }
        return destinationList;
    }
}

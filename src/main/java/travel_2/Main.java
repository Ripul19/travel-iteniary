package travel_2;

import data_2.DataDestination;
import data_2.DataPassenger;
import data_2.DataTravelPackage;
import data_2.DataActivity;

import java.util.List;

public class Main {

    public static void main(String [] args){
        //login
        Login.welcome();

        //get travel Package data-also check only to add one activity in the list
        List<Passenger> passengers = DataPassenger.createHardCodedUser();
        List<Activity> activityList = DataActivity.createHardCodedActivities();
        List<Destination> destinationList = DataDestination.createHardCodedDestinations(activityList);
        List<TravelPackage> allPackages = DataTravelPackage.createHardCodedTravelPackage(destinationList);

        //full booking
        FinalOutput output = Booking.book(allPackages, passengers);

        //print the output
//        System.out.println("Activity: " + output.getActivity());
//        System.out.println("Passenger: " + output.getPassenger());
//        System.out.println("Selected Package: " + output.getSelectedPackage());
    }

}

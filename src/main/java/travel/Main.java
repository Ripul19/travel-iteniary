package travel;

import data.DataDestination;
import data.DataPassenger;
import data.DataTravelPackage;
import data.DataActivity;

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

        System.out.println("----------------------------------------------------------");
        TravelPackage travelPackage = output.getSelectedPackage();
        TravelPackage.printPackage(travelPackage);

        Passenger passenger = output.getPassenger();
        Passenger.printPassenger(passenger);

        Activity activity = output.getActivity();
        if(activity!= null){
            Activity.printActivity(activity);
        }


    }

}

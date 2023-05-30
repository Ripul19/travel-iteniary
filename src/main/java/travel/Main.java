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


        //printing of the details

        System.out.println("----------------------------------------------------------");
        System.out.println("Booking Details");
        System.out.println("----------------------------------------------------------");
        System.out.println("Passenger Details");
        Passenger passenger = output.getPassenger();
        Passenger.printPassenger(passenger);
        System.out.println("");

        TravelPackage travelPackage = output.getSelectedPackage();
        System.out.println("Package Details and activities availability");
        TravelPackage.printPackage(travelPackage);
        System.out.println("");


        Activity activity = output.getActivity();
        System.out.println("Activity Selected");
        if(activity!= null){
            Activity.printActivity(activity);
        }else{
            System.out.println("No Activities selected");
        }


    }

}

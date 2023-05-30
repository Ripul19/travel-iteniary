package travel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {

    public static FinalOutput book(List<TravelPackage> packages, List<Passenger> passengers) {
        System.out.println("Here are all the Packages");

        //print package
        for(TravelPackage pack : packages){
            TravelPackage.printPackage(pack);
        }

        //declare an empty list to add new person
        Passenger newPassenger = null;
        TravelPackage selectedpack;
        List<Activity> copyActivity = new ArrayList<>();
        Activity selectedActivity = null;
        FinalOutput output = null;

        while(true) {

            System.out.println("To continue with booking enter the package name");
            System.out.println("or");
            System.out.println("Press 2 to exit");
            Scanner sc = new Scanner(System.in);
            String packageName = sc.nextLine();

            //booking of package
            if(!packageName.equalsIgnoreCase("2")) {
                selectedpack = TravelPackage.getPackage(packageName, packages);

                System.out.println("Please enter the below details");
                System.out.println("Enter Name");
                String name = sc.nextLine();

                //check if person is in the records to save passenger with the travel package
                boolean bool = Passenger.checkPerson(name, passengers);
                if (!bool) {
                    newPassenger = Passenger.createPerson(name);
                }else {
                    newPassenger = Passenger.getPerson(name, passengers);
                }
                assert selectedpack != null;
                selectedpack.addPassenger(newPassenger);

                System.out.println("Hello " + name);
                System.out.println("Booking Confirmed.");
                selectedpack.setCapacity();

                System.out.println("Press 1 to see the activities on the trip");
                System.out.println("or");
                System.out.println("Press 2 to exit");
                int option= sc.nextInt();
                sc.nextLine();

                if(option == 2){
                    output = new FinalOutput(null, newPassenger, selectedpack);
                    return output;

                }
                else if(option == 1){
                    for(Destination destination: selectedpack.getDestinationList()){
                        //activity
                        copyActivity = destination.getListofActivity();
                        for(Activity activity: destination.getListofActivity()){
                            Activity.printActivity(activity);
                        }
                    }

                    while(true) {
                        //book activity
                        System.out.println("Enter the name of activity");
                        String acti = sc.nextLine();


                        for (Activity activity : copyActivity) {
                            if (acti.equalsIgnoreCase(activity.getName())) {
                                selectedActivity = activity;

                                //check capacity
                                if (activity.getCapacity() == 0) {
                                    System.out.println("Activity Full !!!");
                                    output = new FinalOutput(null, newPassenger, selectedpack);
                                    return output;
                                } else {
                                    //check the customer type and balance
                                    double cost = activity.getCost();

                                    assert newPassenger != null;
                                    if (newPassenger.getBalance() > activity.getCost()) {
                                        //manipulate balance
                                        Passenger.typeBalance(newPassenger, activity);

                                        selectedActivity.setCapacity();
                                        output = new FinalOutput(selectedActivity, newPassenger, selectedpack);
                                        return output;

                                    } else {
                                        System.out.println("Not Enough Balance");
                                        output = new FinalOutput(null, newPassenger, selectedpack);
                                        return output;
                                    }
                                }
                            } else {
                                System.out.println("Please enter a valid activity");
                            }
                        }
                    }

                }
            }
            else if(packageName.equalsIgnoreCase("2")){
                System.exit(0);
            }else {
                System.out.println("Wrong Input");
            }
        }
    }
}

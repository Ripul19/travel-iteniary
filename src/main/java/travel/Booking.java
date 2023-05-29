package travel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Booking {
    public static TravelPackage book(List<TravelPackage> packages, Passenger passenger){


        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Press 1 for Travel packages and all its details");
            System.out.println("Press 2 for Exit");
            int option =sc.nextInt();
            sc.nextLine();

            //Packages, destination and activities print
            if (option == 1) {
                System.out.println("List of packages");
                int number = 1;
                for (TravelPackage travelPackage : packages) {

                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Package Number: " + number);
                    System.out.println("Package Name: " + travelPackage.getName());
                    System.out.println("Capacity: " + travelPackage.getCapacity() + " Persons");
                    number++;

                    for (Destination destination : travelPackage.getListOfDestination()) {
                        System.out.println("Destination name: " + destination.getName());

                        for (Activities activity : destination.getActivities()) {
                            System.out.println("Activity Name: " + activity.getName());
                            System.out.println("Description: " + activity.getDescription());
                            System.out.println("Cost: " + activity.getCost());
                        }
                    }
                }
                TravelPackage travel = null;
                boolean bool = false;
                while(!bool) {
                    //booking of packages
                    System.out.println("Enter the package name you want to book");

                    String packname = sc.nextLine();

                    //extraxcting one package from whole list
                    for (TravelPackage pack : packages) {
                        if (packname.equalsIgnoreCase("North India")) {
                            travel = pack;
                        } else if (packname.equalsIgnoreCase("South India")) {
                            travel = pack;
                        }else {
                            System.out.println("Wrong Package Name");
                        }
                    }
                    if (travel != null) {
                        System.out.println("To book the package please write confirm");
                        String confirm = sc.nextLine();

                        if (confirm.equalsIgnoreCase("confirm")) {
                            if (passenger.getBalance() != 0) {
                                System.out.println("Booking Confirm");
                                double balance = passenger.getBalance();
                                balance = balance - travel.getCost();
                                passenger.setBalance(balance);
                                System.out.println("Your current balance is: "+ passenger.getBalance());
                                bool = true;
                            }
                        }
                    } else {
                        System.out.println("Invalid input Please try again");
                    }
                }
                //return the one booked package
                return travel;
            }else if (option == 2) {
                System.exit(0);
            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public static Activities activities(TravelPackage booked, Passenger passenger) {
        Scanner sc = new Scanner(System.in);
        boolean bool = false;

        List<Destination> des;
        List<Activities> activities = null;
        Activities activitySelected = null;

        while (!bool) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Press 1 to go for activities");
            System.out.println("Press 2 to exit");
            int num = sc.nextInt();


            sc.nextLine();
            if (num == 1) {
                des = booked.getListOfDestination();
                for (Destination dest : des) {
                    activities = dest.getActivities();
                    for (Activities activity : activities) {
                        System.out.println(activity.getName());
                    }
                }

                System.out.println("Enter the name of the activity you want to book");
                String actName = sc.nextLine();
                for (Activities activity : activities) {
                    if (actName.equalsIgnoreCase(activity.getName())) {
                        activitySelected = activity;
                        System.out.println(actName + " is selected");
                        System.out.println("Enter Okay to Confirm");
                        String str = sc.nextLine();

                        if (passenger.getType().equalsIgnoreCase("Premium")) {
                            System.out.println("You are Premium Passenger!!");
                            System.out.println("Your booking for activities is free");
                            System.out.println("Booking Confirmed");
                        } else if (passenger.getType().equalsIgnoreCase("Gold")) {
                            System.out.println("You are a Gold Passenger!!");

                            double amount = passenger.getBalance() - Math.round(activity.getCost() * 0.10);
                            passenger.setBalance(amount);
                            System.out.println("Your total is: " + amount);
                            System.out.println("Your activity is booked from the amount present in balance");
                        } else {
                            System.out.println("You are a standard passenger");

                            double amount = passenger.getBalance() - Math.round(activity.getCost() * 0.90);
                            passenger.setBalance(amount);
                            System.out.println("Your total is: " + amount);
                            System.out.println("Your activity is booked from the amount present in balance");

                        }
                    }
                }
                bool = true;
            } else if (num == 2) {
                System.exit(0);
            } else {
                System.out.println("Wrong Input");
            }
        }
        return activitySelected;
    }

    public static void print(TravelPackage booked, Activities activitySelected, Passenger passenger ){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Hello "+ passenger.getName());
        System.out.println("Your number is: "+ passenger.getNumber());
        System.out.println("Your booking: ");
        System.out.println("Package Name "+ booked.getName());

        List<Destination> dest = booked.getListOfDestination();
        for(Destination destination: dest){
            System.out.println("Your destination is: "+ destination.getName());
        }
        System.out.println("Your activities selected are "+ activitySelected.getName());
        System.out.println("Thank You !!!");
        System.out.println("--------------------------------------------------------------");
    }
}

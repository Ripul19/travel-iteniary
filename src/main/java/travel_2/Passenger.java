package travel_2;

import java.util.List;

public class Passenger {
    private String name, type;
    private double number, balance;
    public Passenger(String name, String type, double number, double balance){
        this.name = name;
        this.type = type;
        this.number = number;
        this.balance = balance;
    }

    //Getters methods

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public double getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    //setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //print passenger


    //checking if person is in the records
    public static boolean checkPerson(String name, List<Passenger> passengers){
        for(Passenger passenger : passengers){
            if(name.equalsIgnoreCase(passenger.name)){
                return true;
            }
        }
        return false;
    }

    public static Passenger getPerson(String name, List<Passenger> passengers){
        for(Passenger passenger : passengers) {
            return passenger;
        }
        return null;
    }

    //create passenger
    public static Passenger createPerson(String name) {
        Passenger newPassenger = new Passenger(name, "Standard", Math.random(), 0.0);
        return newPassenger;
    }
    //setname

    //passenger type and its cost for activity
    public static void typeBalance(Passenger passenger, Activity activity) {

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

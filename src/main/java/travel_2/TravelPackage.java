package travel_2;


import java.util.ArrayList;
import java.util.List;
public class TravelPackage {
    private String name;
    private int capacity;
    private List<Passenger> passengers;
    private List<Destination> destinationList;

    public TravelPackage(String name, int capacity, List<Destination> destinationList){
        this.name = name;
        this.capacity = capacity;
        this.destinationList = destinationList;
        this.passengers = new ArrayList<>();
    }


    //Getters
    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public List<Destination> getDestinationList() { return this.destinationList; }

    //passenger part
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public List<Passenger> getBookedPassengers() {
        return passengers;
    }


    //set capacity
    public void setCapacity(){
        capacity=capacity-1;
    }
    //print the details of package
    public static void printPackage(TravelPackage pack){
        System.out.println("Package Name: "+pack.name);
        System.out.println("Trip Capacity: "+pack.capacity);

        for(Destination destination: pack.destinationList){
            if(destination!= null) {
                Destination.printDestination(destination);
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    public static TravelPackage getPackage(String packageName, List<TravelPackage> packages) {
        for(TravelPackage pack: packages){
            if(packageName.equalsIgnoreCase(pack.name)){
                return pack;
            }
        }
        return null;
    }

}


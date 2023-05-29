package travel;

import java.util.ArrayList;
import java.util.List;
public class TravelPackage {
    private String name;
    private  List<Destination> listOfDestination = new ArrayList<>();
    private double capacity, cost;

    public TravelPackage(String name, List<Destination> listOfDestination, double capacity, double cost){
        this.name = name;
        this.listOfDestination = listOfDestination;
        this.capacity = capacity;
        this.cost = cost;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public List<Destination> getListOfDestination(){
        return this.listOfDestination;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getCost() { return this.cost; }
}

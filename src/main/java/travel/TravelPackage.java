package travel;

import java.util.ArrayList;
import java.util.List;
public class TravelPackage {
    private String name;
    private  List<Destination> listOfDestination = new ArrayList<>();
    private int capacity;

    public TravelPackage(String name, List<Destination> listOfDestination, int capacity){
        this.name = name;
        this.listOfDestination = listOfDestination;
        this.capacity = capacity;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public List<Destination> getListOfDestination(){
        return this.listOfDestination;
    }

    public int getCapacity(){
        return this.capacity;
    }
}

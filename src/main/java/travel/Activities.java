package travel;

public class Activities {
    private String name, description, destination;
    private  double cost, capacity;

    public Activities(String name, String description, double cost, double capacity, String destination){
        this.name= name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getCost(){
        return this.cost;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public String getDestination() { return this.destination; }
}

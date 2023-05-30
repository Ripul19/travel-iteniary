package travel;

public class Activity {
    private String name, description, destination;
    private  double cost, capacity;

    public Activity(String name, String description, double cost, double capacity, String destination){
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

    //print activity
    public static void printActivity(Activity activity){
        if(activity!= null) {
            System.out.println("Activity Name: " + activity.name);
            System.out.println("Available capacity: " + activity.capacity);
            System.out.println("Activity Cost: " + activity.cost);
            System.out.println("");
        }
    }


    //manipulate capacity
    public void setCapacity(){
        capacity = capacity-1;
    }
}

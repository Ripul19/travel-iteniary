package travel;

public class Passenger {
    private String email, password, name, type;
    private long number;
    public Passenger(String email, String password, String name, String type, long number){
        this.email = email;
        this.password = password;
        this.name = name;
        this.type = type;
        this.number = number;
    }


    //Getters methods
    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public long getNumber(){
        return number;
    }
}

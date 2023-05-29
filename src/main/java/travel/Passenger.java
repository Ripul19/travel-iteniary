package travel;

public class Passenger {
    private String email, password, name, type;
    private double number, balance;
    public Passenger(String email, String password, String name, String type, double number, double balance){
        this.email = email;
        this.password = password;
        this.name = name;
        this.type = type;
        this.number = number;
        this.balance = balance;
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

    public double getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    //setter
    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }


}

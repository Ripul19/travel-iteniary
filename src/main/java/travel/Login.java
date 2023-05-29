package travel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
    public static Passenger welcome(List<Passenger> passengers) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome");
        System.out.println("------------------------------------------------------------------");
        Passenger pass = null;
        boolean yes = false;

        while (true) {

            System.out.println("Press 1 for Login");
            System.out.println("Press 2 for Exit");
            System.out.println("------------------------------------------------------------------");
            int option = sc.nextInt();
            sc.nextLine();


            if (option == 1) {

                System.out.println("Enter your Login Id");
                String userId = sc.nextLine();

                System.out.println("Enter your Password");
                String password = sc.nextLine();

                for (Passenger passenger : passengers) {
                    if (passenger.getEmail().equals(userId) && passenger.getPassword().equals(password)) {
                        pass = passenger;
                        yes= true;
                    }
                }if(yes){
                    System.out.println("You are now logged in !!");
                    System.out.println("Welcome " + pass.getName());
                }else{
                    System.out.println("Invalid Credentials");
                }
                return pass;
            } else if (option == 2) {
                System.out.println("Thank you !! Have a nice day");
                System.exit(0);
            } else {
                System.out.println("Wrong Input, Please Try again !!");
            }
        }

    }
}

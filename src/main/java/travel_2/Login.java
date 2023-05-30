package travel_2;

import java.util.Scanner;

public class Login {

    public static void welcome(){
        Scanner sc = new Scanner(System.in);
        boolean bool = false;

        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome To Travel Travels");

        while(!bool) {
            System.out.println("Press 1 for booking");
            System.out.println("Press 2 for exit");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                System.out.println("--------------------------------------------------------");
                bool = true;
            } else if (num == 2) {
                System.exit(0);
            } else {
                System.out.println("Wrong Input! Please try again");
                System.out.println("--------------------------------------------------------");
            }
        }
    }
}

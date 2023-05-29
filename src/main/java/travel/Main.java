package travel;

import data.GetActivities;
import data.GetDestination;
import data.GetTravelPackage;
import data.GetUser;

import javax.swing.*;
import java.awt.print.Book;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //data created
        List<Passenger> passengers = GetUser.createHardCodedUser();
        List<Activities> activities = GetActivities.createHardCodedActivities();
        List<Destination> destinations = GetDestination.createHardCodedDestinations(activities);
        List<TravelPackage> packages = GetTravelPackage.createHardCodedTravelPackage(destinations);

        //int option = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice"));
        //login
        Passenger passenger = Login.welcome(passengers);

        //travel package menu with destination and activities
        TravelPackage booked= Booking.book(packages, passenger);

        //activities
        Activities activitySelected = Booking.activities(booked, passenger);

        //Printing of the booking
        Booking.print(booked, activitySelected, passenger);
    }
}

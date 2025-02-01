package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class DistanceBetweenCities {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();

        System.out.println("Enter from city: ");
        String fromCity = input.next();

        
        System.out.println("Enter via city: ");
        String viaCity = input.next();

        System.out.println("Enter to city: ");
        String toCity = input.next();


        System.out.println("Enter from to via city distance: ");
        int distanceFromToVia = input.nextInt();

        System.out.println("Enter via to final city distance: ");
        int distanceViaToFinalCity = input.nextInt();

        System.out.println("Enter time from first to via city: ");
        int timeFirstToVia = input.nextInt();

        System.out.println("Enter time from via to final city: ");
        int timeViaToFinal = input.nextInt();



        input.close();

        double totalDistance = (double)distanceFromToVia + (double)distanceViaToFinalCity;
        int totalTime = timeFirstToVia + timeViaToFinal;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");

    }
}

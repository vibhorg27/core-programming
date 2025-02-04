package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class UnitConverter {
    public static double kmToMiles(double distance){
        distance = distance * 0.621371;
        return distance;
    }
    
    public static double milesToKm(double distance){
        distance = distance * 1.60934;
        return distance;
    }

    public static double metersToFeet(double distance){
        distance = distance * 3.28084;
        return distance;
    }

    public static double feetToMeter(double distance){
        distance = distance * 0.3048;
        return distance;
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter distance in km: ");
       double km = input.nextDouble();

       System.out.print("Enter distance in miles: ");
       double miles= input.nextDouble();

       System.out.print("Enter distance in meter: ");
       double meter = input.nextDouble();

       System.out.print("Enter distance in feet: ");
       double feet = input.nextDouble();

       input.close();

       System.out.println(km + " km = " + kmToMiles(km) + " miles");
       System.out.println(miles + " miles = " + milesToKm(miles) + " km");
       System.out.println(meter + " meters = " + metersToFeet(meter) + " feet");
       System.out.println(feet + " feet = " + feetToMeter(feet) + " meter");


       
    }
}

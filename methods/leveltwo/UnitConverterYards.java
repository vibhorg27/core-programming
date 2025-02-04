package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class UnitConverterYards {

    public static double yardsToFeet(double distance){
        distance = distance * 3;
        return distance;
    }

    public static double feetToYards(double distance){
        distance = distance * 0.333333;
        return distance;
    }

    public static double metersToInches(double distance){
        distance = distance * 39.3701;
        return distance;
    }

    public static double inchesToMeters(double distance){
        distance = distance * 0.0254;
        return distance;
    }

    public static double inchesToCm(double distance){
        distance = distance * 2.54;
        return distance;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet= input.nextDouble();

        System.out.print("Enter distance in meter: ");
        double meter = input.nextDouble();

        System.out.print("Enter distance in inches: ");
        double inches = input.nextDouble();
        input.close();

        System.out.println(yards + " yards = " + yardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + feetToYards(feet) + " yards");
        System.out.println(meter + " meters = " + metersToInches(meter) + " inches");
        System.out.println(inches + " inches = " + inchesToMeters(inches) + " meter");
        System.out.println(inches + " inches = " + inchesToCm(inches) + " cm");
        
    }
}

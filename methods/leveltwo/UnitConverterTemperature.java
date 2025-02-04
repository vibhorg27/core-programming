package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class UnitConverterTemperature {
    public static double farhenheitToCelsius(double temp){
        double result = (temp - 32) * 5 / 9;
        return result; 
    }

    public static double celsiusToFarhenheit(double temp){
        double result = (temp * 9 / 5) + 32;
        return result;
    }

    public static double poundsToKg(double weight){
        weight = weight * 0.453592;
        return weight;

    }
    
    public static double kgsToPounds(double weight){
        weight = weight * 2.20462;
        return weight;
    }

    public static double gallonsToLitres(double qty){
        qty = qty * 3.78541;
        return qty;
    }

    public static double litresToGallons(double qty){
        qty = qty * 0.264172;
        return qty;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in farhenheit: ");
        double farhenheit = input.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius= input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter quantity in kgs: ");
        double kgs = input.nextDouble();

        System.out.print("Enter quantity in gallons: ");
        double gallons = input.nextDouble();

        System.out.print("Enter quantity in litres: ");
        double litres = input.nextDouble();

        
        input.close();

        System.out.println(farhenheit + " farhenheit = " + farhenheitToCelsius(farhenheit) + " celsius");
        System.out.println(celsius + " celsius = " + celsiusToFarhenheit(celsius) + " farhenheit");
        System.out.println(pounds + " pounds = " + poundsToKg(pounds) + " kgs");
        System.out.println(kgs + " kgs = " + kgsToPounds(kgs) + " pounds");
        System.out.println(gallons + " gallons = " + gallonsToLitres(gallons) + " litres");
        System.out.println(litres + " litres = " + litresToGallons(litres) + " gallons");
    }

}

package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class SimpleInterest{
    public static double calculateSI(double p, double r, double t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter principle amount: ");
        double p = input.nextDouble();
        System.out.print("Enter rate: ");
        double r = input.nextDouble();
        System.out.print("Enter time period: ");
        double t = input.nextDouble();
        input.close();

        double SI = calculateSI(p, r, t);

        System.out.println("The Simple Interest is " + SI + " for Principal " + p + " Rate of Interest "+  r + " and Time " + t);

    }
}
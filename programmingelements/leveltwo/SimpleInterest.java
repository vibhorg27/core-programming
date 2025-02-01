package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle amount: ");
        float p = input.nextFloat();
        System.out.print("Enter the rate: ");
        float r = input.nextFloat();
        System.out.print("Enter the time period: ");
        float t = input.nextFloat();

        input.close();

        float SI = (p*r*t)/100;
        System.out.print("The Simple Interest is " + SI + " for Principal " + p + " Rate of Interest " + r + " and Time " + t);

        
    }
}

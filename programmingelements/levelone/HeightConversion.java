package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heightInCm = input.nextInt();
        input.close();
        
        double heightInFeet = (double)heightInCm / (12 * 2.54);
        double heightInInches = (1.0/2.54) * (double)heightInCm;

        System.out.println("Your height in cm is "+ heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
    }
}

package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class NumberOfRounds {
    public static float calculateRounds(float a, float b, float c){
        float numberOfRounds = (a + b + c)/5;
        return numberOfRounds;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        float a = input.nextFloat();
        System.out.print("Enter second side: ");
        float b = input.nextFloat();
        System.out.print("Enter third side: ");
        float c = input.nextFloat();
        float numberOfRounds = calculateRounds(a,b,c);
        
        input.close();
        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km" ); 
    }
}

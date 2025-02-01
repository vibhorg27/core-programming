package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class NumberOfRounds {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        input.close();
        float numberOfRounds = (a + b + c)/5;
        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km" ); 
    }    
}

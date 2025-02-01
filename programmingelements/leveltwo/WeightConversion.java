package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float weightInPounds = input.nextInt();
        input.close();
        
        float weightInkgs = weightInPounds * (float)0.453;
        
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInkgs);
        
    }
}

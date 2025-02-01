package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class FeetsToYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float distanceInFeets = input.nextFloat();

        input.close();

        float distanceInYards = ((float)1 / (float)3) * distanceInFeets;
        float distanceInMiles = ((float)1 / (float)1760) * distanceInYards;
        
        System.out.println("Distance in Feet is " + distanceInFeets + " while in yards is " + distanceInYards + " and miles is " + distanceInMiles);
    }
}

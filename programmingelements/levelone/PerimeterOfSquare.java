package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float side = input.nextFloat();

        input.close();

        float perimeterOfSquare = (float)4 * side;
        
        System.out.println("The length of side is " + side + " whose perimeter is " + perimeterOfSquare);
    }
}

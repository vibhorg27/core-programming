package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class Trigonometry {
    public static double[] getTrigonometricFunctions(double angle){

        angle = Math.toRadians(angle);
        double sine = Math.sin(angle);
        double cosine = Math.cos(angle);
        double tan = Math.tan(angle);

        return new double[]{sine, cosine, tan};

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");

        double angle = input.nextDouble();
        input.close();

        double result[] = getTrigonometricFunctions(angle);

        System.out.println("sin(" + angle + ") = " + result[0]);
        System.out.println("cos(" + angle + ") = " + result[1]);
        System.out.println("tan(" + angle + ") = " + result[2]);


        
    }
}

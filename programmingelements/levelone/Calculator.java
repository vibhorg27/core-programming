package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();

        input.close();

        float addition = a + b;
        float subtraction = a - b;
        float multiplication = a * b;
        float division = a/b;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + a + " and " + b + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
    }
}

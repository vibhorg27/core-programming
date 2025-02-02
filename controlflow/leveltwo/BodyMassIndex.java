package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter Height in cm: ");
        double height = input.nextDouble();
        input.close();
        height = height / 100;

        double bmi = weight / (height * height);
        if(bmi <= 18.4){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normal");
        }
        else if(bmi >= 25 && bmi <= 39.9){
            System.out.println("Overweight");
        }
        else if(bmi >= 40){
            System.out.println("Obese");
        }

    }
}

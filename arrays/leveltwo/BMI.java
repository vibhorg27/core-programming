package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Persons: ");
        int n = input.nextInt();
        double height[] = new double[n];
        int weight[] = new int[n];

        for(int i = 0 ; i<n ; i++){
            System.out.print("Enter height for person " + (i+1) + ": ");
            height[i] = input.nextDouble();
            System.out.print("Enter weight for person " + (i+1) + ": ");
            weight[i] = input.nextInt();
        }

        double bmi[] = new double[n];
        for(int i =0; i<n ; i++){
            bmi[i] = weight[i]/ (height[i] * height[i]);
        }

        String status[] = new String[n];
        for(int i =0; i<n ; i++){
            if(bmi[i] <= 18.4){
                status[i] = "Underweight";
            }
            else if(bmi[i] <= 24.9 && bmi[i] >= 18.5){
                status[i] = "normal";
            }
            else if(bmi[i] <= 39.9 && bmi[i] >= 25.0){
                status[i] = "Overweight";
            }
            else if(bmi[i] >= 40.0){
                status[i] = "Obese";
            }
        }

        input.close();
        for(int i = 0 ; i<n ; i++){
            
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
            
            
        }


    }
}

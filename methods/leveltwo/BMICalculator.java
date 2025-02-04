package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();
            
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            statuses[i] = determineBMIStatus(data[i][2]);
        }
        
        scanner.close();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + statuses[i]);
        }
    }
    
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
    
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
}


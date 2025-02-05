package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class Bmi {
    public static double[][] getUserInput(int numPersons) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[numPersons][2];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        scanner.close();
        return data;
    }

    public static String[][] calculateBMI(double[][] data, int numPersons) {
        String[][] result = new String[numPersons][4];

        for (int i = 0; i < numPersons; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = getStatus(bmi);

            result[i][0] = String.format("%.2f", data[i][0]);
            result[i][1] = String.format("%.2f", data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Report:");
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPersons = input.nextInt();
        double[][] inputData = getUserInput(numPersons);
        String[][] bmiResults = calculateBMI(inputData, numPersons);
        displayResults(bmiResults);
    }
}


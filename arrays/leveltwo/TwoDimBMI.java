package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class TwoDimBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Persons: ");
        int n = input.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter height for person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter weight for person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();
            } while (personData[i][1] <= 0);
        }

        for (int i = 0; i < n; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] <= 18.4) status[i] = "Underweight";
            else if (personData[i][2] <= 24.9) status[i] = "normal";
            else if (personData[i][2] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        input.close();

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + personData[i][2] + " " + status[i]);
        }
    }
}

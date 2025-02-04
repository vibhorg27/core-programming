package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                marks[i][0] = input.nextInt();
            } while (marks[i][0] < 0);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                marks[i][1] = input.nextInt();
            } while (marks[i][1] < 0);

            do {
                System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
                marks[i][2] = input.nextInt();
            } while (marks[i][2] < 0);
        }

        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) grade[i] = "Grade: A - above agency-normalized standards " + percentage[i] + "%";
            else if (percentage[i] >= 70) grade[i] = "Grade: B - at agency-normalized standards " + percentage[i] + "%";
            else if (percentage[i] >= 60) grade[i] = "Grade: C - below, but approaching agency-normalized standards " + percentage[i] + "%";
            else if (percentage[i] >= 50) grade[i] = "Grade: D - well below agency-normalized standards " + percentage[i] + "%";
            else if (percentage[i] >= 40) grade[i] = "Grade: E - too below agency-normalized standards " + percentage[i] + "%";
            else grade[i] = "Grade: R - remedial standards " + percentage[i] + "%";
        }

        input.close();

        for (int i = 0; i < n; i++) {
            System.out.println(grade[i]);
        }
    }
}

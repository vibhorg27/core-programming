package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class TwoDimGradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + subjects[j] + " marks for student " + (i + 1) + ": ");
                marks[i][j] = input.nextInt();

                if (marks[i][j] < 0) {
                    System.out.println("Invalid input. Enter positive marks.");
                    j--; 
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                totalMarks += marks[i][j];
            }
            percentage[i] = totalMarks / 3.0;

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

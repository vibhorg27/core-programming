package com.bridgelabz.strings.leveltwo;

import java.util.Random;

public class StudentGrades {

    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10;
            scores[i][1] = random.nextInt(90) + 10;
            scores[i][2] = random.nextInt(90) + 10;
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4];
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[][] calculateGrades(double[][] results, int numStudents) {
        String[][] grades = new String[numStudents][1];
        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][3];
            if (percentage >= 90) {
                grades[i][0] = "A";
            } else if (percentage >= 75) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int numStudents, int[][] scores, double[][] results, String[][] grades) {
        System.out.println("\nScorecard:");
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t"
                    + results[i][0] + "\t" + Math.round(results[i][1] * 100.0) / 100.0 + "\t" + results[i][3] + "%\t\t" + grades[i][0]);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.close();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateTotalAveragePercentage(scores, numStudents);
        String[][] grades = calculateGrades(results, numStudents);
        displayScorecard(numStudents, scores, results, grades);
    }
}


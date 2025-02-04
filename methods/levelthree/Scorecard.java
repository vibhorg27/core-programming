package com.bridgelabz.methods.levelthree;

import java.util.Random;
import java.util.Scanner;

public class Scorecard {

    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(50) + 50;
            scores[i][1] = random.nextInt(50) + 50;
            scores[i][2] = random.nextInt(50) + 50;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round(total / 3.0 * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.close();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}


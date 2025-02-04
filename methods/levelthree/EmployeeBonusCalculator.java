package com.bridgelabz.methods.levelthree;

import java.util.Random;

public class EmployeeBonusCalculator {

    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = random.nextInt(80000) + 20000;
            employeeData[i][1] = random.nextInt(10) + 1;
        }
        return employeeData;
    }

    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] newSalaryData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            newSalaryData[i][0] = newSalary;
            newSalaryData[i][1] = bonusAmount;
        }
        return newSalaryData;
    }

    public static void displayResults(int[][] employeeData, double[][] newSalaryData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("ID OldSalary Years Bonus NewSalary");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = newSalaryData[i][1];
            double newSalary = newSalaryData[i][0];

            System.out.println((i + 1) + " " + oldSalary + " " + yearsOfService + " " + bonus + " " + newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("Total " + totalOldSalary + " " + totalBonus + " " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] newSalaryData = calculateBonus(employeeData);
        displayResults(employeeData, newSalaryData);
    }
}

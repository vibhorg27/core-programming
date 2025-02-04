package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class NumberType {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print("Number " + num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + num + " is negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.print("\nComparison of first and last number: ");
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First number and last number are equal.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        input.close();
    }
}

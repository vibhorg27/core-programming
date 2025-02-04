package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class NumberCheckerFive {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2];
    }

    public static int sumOfFactors(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int number) {
        int product = 1;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int number) {
        long product = 1;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            product *= (long) Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) - number == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) - number > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) - number < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}


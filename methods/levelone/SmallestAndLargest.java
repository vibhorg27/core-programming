package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c){
        int smallest = Math.min(a , Math.min(b, c));
        int largest = Math.max(a , Math.max(b, c));
        
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        scanner.close();
    }
}

package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = input.nextInt();
        System.out.print("Enter divisor: ");
        int b = input.nextInt();

        input.close();
        int result[] = findRemainderAndQuotient(a, b);


        System.out.println("The Quotient is " + result[0] + " and Reminder is " + result[1] + " of two numbers " + a + " and " + b);
    }
}

package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        input.close();

        int quotient = a / b;
        int remainder = a % b;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + a + " and " + b);
    }
}
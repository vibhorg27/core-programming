package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        int[] frequency = new int[10];

        
        int temp = number;
        int length = 0;
        while (temp > 0) {
            temp /= 10;
            length++;
        }

        String numberStr = Integer.toString(number);

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            frequency[digit]++;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        input.close();
    }
}

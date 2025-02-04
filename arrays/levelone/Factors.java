package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }

        
        int maxFactor = 10;  
        int[] factors = new int[maxFactor]; 
        int index = 0; 

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                
                if (index == maxFactor) {
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];

                    
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; 
                }

                
                factors[index++] = i;
            }
        }

        scanner.close();

        
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class CanVote {

    // Method 
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        } else if (age >= 18) {
            return true;  
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        com.bridgelabz.arrays.levelone.CanVote checker = new com.bridgelabz.arrays.levelone.CanVote();

        int[] ages = new int[10];

        // Taking input 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " has invalid age. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }

        input.close();
    }
}

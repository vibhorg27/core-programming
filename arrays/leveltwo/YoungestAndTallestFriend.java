package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[n];
        int[] height = new int[n];
        
        for(int i = 0 ; i<n ; i++){
            System.out.println("Enter age of friend " + names[i] + ": ");
            age[i] = input.nextInt();

        }
        for(int i = 0 ; i<n ; i++){
            System.out.println("Enter height of friend " + names[i] + ": ");
            height[i] = input.nextInt();

        }
        input.close();
        int minAge = age[0], youngestIndex = 0;
        double maxHeight = height[0];
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                youngestIndex = i;
            }
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                tallestIndex = i;
            }
        }

        System.out.println("\nThe youngest friend is: " + names[youngestIndex] );
        System.out.println("The tallest friend is: " + names[tallestIndex] );

    }
}

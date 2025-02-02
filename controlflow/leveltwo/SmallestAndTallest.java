package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;
import java.lang.Math;

public class SmallestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amar's age : ");
        int amarAge = input.nextInt();
        System.out.println("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.println("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        System.out.println("Enter Amar's height: ");
        int amarHeight = input.nextInt();
        System.out.println("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();
        System.out.println("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();

        input.close();
        int minAge = Math.min(amarAge,Math.min(akbarAge ,anthonyAge));
        String youngestFriend = (minAge == amarAge) ? "Amar" : (minAge == akbarAge) ? "Akbar" : "Anthony";
        int maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (maxHeight == amarHeight) ? "Amar" : (maxHeight == akbarHeight) ? "Akbar" : "Anthony";

        System.out.println("\nThe youngest friend is: " + youngestFriend + " (Age: " + minAge + " years)");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + maxHeight + " cm)");
        
                
    }
}

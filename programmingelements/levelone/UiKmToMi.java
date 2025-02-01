package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class UiKmToMi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();
        input.close();

        double miles = km * 0.621371;

        System.out.println(miles);
    }
}

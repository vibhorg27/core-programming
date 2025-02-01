package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        System.out.print("Enter Temperature in Celsius: ");

        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        input.close();
        double farenheit = (celsius * (double)9/(double)5) + (double)32;

        System.out.println(celsius + " degree celsius is " + farenheit + " farenheit");

    }
}

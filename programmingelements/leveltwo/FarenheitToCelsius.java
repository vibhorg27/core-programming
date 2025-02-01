package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        System.out.print("Enter Temperature in Farenheit: ");

        Scanner input = new Scanner(System.in);
        double farenheit = input.nextDouble();
        input.close();
        double celsius = ((farenheit - 32) * (double)5 / (double)9);

        System.out.println(farenheit + " farenheit is " + celsius + " degree celsius");
    }
}

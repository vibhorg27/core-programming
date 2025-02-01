package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        input.close();

        double x = a + b * c;
        double y = a * b + c;
        double z = c + a / b;
        double w = a % b + c;

        System.out.println("The result of Int Operations are " + x + ", " + y + ", " + z + " and " + w );
    }
    
}

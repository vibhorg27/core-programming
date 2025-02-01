package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        input.close();

        int x = a + b * c;
        int y = a * b + c;
        int z = c + a / b;
        int w = a % b + c;

        System.out.println("The result of Int Operations are " + x + ", " + y + ", " + z + " and " + w );
    }
}

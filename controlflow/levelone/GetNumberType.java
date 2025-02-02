package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class GetNumberType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();

        if(a > 0) System.out.println("Number is positive");
        else if(a < 0) System.out.println("Number is negative");
        else System.out.println("Number is Zero");

    }
}

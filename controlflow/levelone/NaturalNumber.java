package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int sum = (n * (n-1))/2;
        if(n < 0 ) System.out.println(n + " is not a natural number");

        else{
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        }

    }
}

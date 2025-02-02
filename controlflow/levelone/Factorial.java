package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int factorial = 1;

        while(n > 0){
            factorial*=n;
            n--;
        }
        System.out.println(factorial);
    }
}
package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int factorial = 1;
        for(int i = n ; i > 0 ; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

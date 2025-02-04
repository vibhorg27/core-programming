package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int table[] = new int[11];
        for(int i = 1; i<= 10 ; i++){
            table[i] = n * i;
        }
        for(int i = 1; i<= 10 ; i++){
            System.out.println(n + " X " + i + " = " + table[i]);
        }
    }
}

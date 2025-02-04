package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] multiplicationResult = new int[4];
        input.close();

        for(int i = 0; i< 4 ; i++){
            multiplicationResult[i] = n * (i+6); 
        }
        for(int i = 0; i< 4 ; i++){
            System.out.println(n + " X " + (i+6) + " = " + multiplicationResult[i]); 
        }
        
    }
}

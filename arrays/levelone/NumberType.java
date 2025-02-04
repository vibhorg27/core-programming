package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        for(int i = 0; i<5 ; i++){
            n[i] = input.nextInt();
        }
        input.close();

        for(int i = 0; i<5 ; i++){
            if(n[i] < 0){
                System.out.println("Negative");
            }
            else if(n[i] > 0){
                System.out.println("Positive");
            }
            else System.out.println("Zero");
        }
        
        for(int i = 0; i<5 ; i++){
            if(n[i] % 2 == 0 ){
                System.out.println("Even");
            }
            
            else System.out.println("Odd");
        }
        if(n[0] > n[4]) System.out.println("1st is greater than last");
        else if(n[0] < n[4]) System.out.println("1st is smaller than last");
        else System.out.println("1st is equal to last");
    }
}

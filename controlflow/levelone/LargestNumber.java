package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        if(a > b && a > c){
            System.out.println(a + " is the largest number");
        }
        else if(b > a && b > c){
            System.out.println(b + " is the largest number");
        }
        else System.out.println(c + " is the largest number");
        
    }
}

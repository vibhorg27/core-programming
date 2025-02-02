package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        double sum = 0;
        int number = n; 

        // boolean isArmstrong = false;

        while(n != 0){
            sum = sum + Math.pow(n%10, 3);
            n = n/10;
        }
        System.out.println(sum == number);
    }
}
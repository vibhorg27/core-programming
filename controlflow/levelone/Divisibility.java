package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class Divisibility{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        if(n % 5 == 0){
            System.out.println(n + " is divisible by 5");
        }
    }
}
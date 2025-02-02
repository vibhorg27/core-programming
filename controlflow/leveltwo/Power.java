package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int power = input.nextInt();
        int ans = 1;

        input.close();
        for(int i =0; i<power ; i++){
            ans*=base;
        }
        System.out.println(base + " raised to power of " + power + " = " + ans);
    }
}

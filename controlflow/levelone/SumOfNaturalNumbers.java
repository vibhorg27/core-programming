package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int total = 0;

        while(n > 0){
            total+=n;
            n--;
        }
        System.out.println(total);
    }
}

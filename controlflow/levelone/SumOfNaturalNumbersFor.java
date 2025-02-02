package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int total = 0;
        for(int i =0; i<n ; i++){
            total+=i;
        }
        System.out.println(total);
    }
}

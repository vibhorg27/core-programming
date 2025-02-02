package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int sum = 0;

        for(int i = 1 ; i <= n/2 ; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum> n);
    }
}

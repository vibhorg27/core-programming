package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int number = n;
        int sum =0;
        while(n!=0){
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println(number % sum == 0);
    }
}

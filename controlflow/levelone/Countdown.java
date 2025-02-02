package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        while(n > 0){
            System.out.println(n);
            n--;
        }
    }
}

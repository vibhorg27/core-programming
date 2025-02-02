package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int count = 0;
        while(n != 0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}

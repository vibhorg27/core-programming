package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for(int i = 100; i > 0 ; i--){
            if(n % i ==0){
                System.out.println(i);
            }
        }

    }
}
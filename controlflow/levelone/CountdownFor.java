package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for(int i = n ; i > 0 ; i--){
            System.out.println(i);
        }
    }
}

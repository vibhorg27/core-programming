package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int greatestFactor = 1;


        for(int i = n-1 ; i >1 ; i--){
            if(n% i == 0){
                greatestFactor = Math.max(greatestFactor, i);

            }
        }
        System.out.println(greatestFactor);
    }
}

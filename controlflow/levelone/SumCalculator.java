package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double n = input.nextDouble();;
        
        while(n > 0){
            total += n;
            n = input.nextDouble();
            if(n == 0){
                break;
            }
            
        }
        System.out.println(total);
        input.close();
    }
}

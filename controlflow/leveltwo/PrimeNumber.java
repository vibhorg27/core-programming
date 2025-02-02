package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        boolean isPrime = false;
        

        if( number > 1){
            for(int i = 2 ; i < number ; i++){
                if(number % i == 0){
                    System.out.println(isPrime);
                    break;
                }
                
                else {
                    isPrime = true;
                    System.out.println(isPrime);
                    break;
                }
            }
        }
    }
}

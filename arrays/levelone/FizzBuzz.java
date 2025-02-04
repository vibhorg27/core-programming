package com.bridgelabz.arrays.levelone;

import java.util.Scanner;



public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        int n = input.nextInt();
        
        String[] fizzBuzz = new String[n];

        if(n <= 0){
            System.out.println("Enter a valid natural number!");
        }
        for(int i = 0; i<n ; i++){
            if(i % 3 == 0 && i % 5==0){
                fizzBuzz[i] = "FizzBuzz";
            }
            else if(i % 3==0){
                fizzBuzz[i] = "Fizz";
            }
            else if(i % 5==0 ){
                fizzBuzz[i] = "Buzz";
            }
            else fizzBuzz[i] = String.valueOf(i);
        }

        for(int i = 0; i< n; i++){
            System.out.println(fizzBuzz[i]);
        }
        input.close();

    }
}

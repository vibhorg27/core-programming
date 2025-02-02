package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        
        if(n > 0){
            for(int i =0; i<n ; i++){
                if(i % 3 == 0){
                    System.out.println("Fizz");
                }
                else if(i % 5 == 0){
                    System.out.println("Buzz");
                }
                else if(i % 3 == 0 && i % 5 == 0 ){
                    System.out.println("FizzBuzz");
                }
                else System.out.println(i);
            }
        }
    }
}

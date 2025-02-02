package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        
    
        while(n > 0){
            if(n % 3 == 0){
                System.out.println("Fizz");
            }
            else if(n % 5 == 0){
                System.out.println("Buzz");
            }
            else if(n % 3 == 0 && n % 5 == 0 ){
                System.out.println("FizzBuzz");
            }
            else System.out.println(n);

            n--;
        }
    }
    
}

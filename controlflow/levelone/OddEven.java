package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        if(n < 0){
            System.out.println("Enter valid natural number");
        }
        else{
            
            for(int i = 0 ; i < n+1; i++){
                if(i % 2 == 0){
                    System.out.println(i + " is Even");
                }
                else System.out.println(i + " is Odd");
            }
        }
    }
}

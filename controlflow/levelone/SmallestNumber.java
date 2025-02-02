package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        
        if(a < b && a < c){
            System.out.println(a + " is the smallest number");
        }
        else System.out.println(a + " is not the smallest number");
        
    }

}

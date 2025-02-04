package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class NumberType {
    public static String getNumberType(int a){
        if(a > 0) return "Number is positive";
        else if(a < 0) return "Number is negative";
        else return "Number is Zero";

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        input.close();

        String ans = getNumberType(a);
        System.out.println(ans);
    }
}

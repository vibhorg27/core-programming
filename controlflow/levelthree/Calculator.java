package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Operator: ");
        String operator = input.nextLine();
        System.out.print("Enter 1st number: ");
        double n1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        double n2 = input.nextInt();
        input.close();
        double result;

        switch (operator){
            case "+":
                result = n1+n2;
                System.out.println(result);
                break;

            case "-":
            result = n1-n2;
            System.out.println(result);
            break;
        
            case "*":
            result = n1*n2;
            System.out.println(result);
            break;

            case "/":
            result = n1/n2;
            System.out.println(result);
            break;

            case "%":
            result = n1 % n2;
            System.out.println(result);
            break;

        }
        
    }
}

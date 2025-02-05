package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class NumberFormatException {

    public static void generateException(String s){
        System.out.println(Integer.parseInt(s));
    }

    public static void handleException(String s){
        try{
            generateException(s);
        }
        catch(java.lang.NumberFormatException exception){
            System.out.println("Caught with error: ");
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();
        input.close();

        try{
            generateException(s);
        }
        catch (java.lang.NumberFormatException exception){
            System.out.println("Caught in main");
        }
        handleException(s);
    }
}

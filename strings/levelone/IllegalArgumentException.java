package com.bridgelabz.strings.levelone;

import java.util.Scanner;


public class IllegalArgumentException {
    public static void generateException(String s, int start, int end){
        System.out.println(s.substring(start, end));
    }

    public static void handleException(String s, int start, int end){
        try{
        if(start > end){
            throw new java.lang.IllegalArgumentException("Invalid index input");
        }

        }
        catch(java.lang.IllegalArgumentException exception){
            System.out.println("Exception Caught");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();
        System.out.print("Enter starting Index: ");
        int start = input.nextInt();
        System.out.print("Enter ending Index: ");
        int end = input.nextInt();

        try{
            generateException(s, start, end);
        }catch (Exception exception){
            System.out.println("Caught in main");
        }

        handleException(s, start, end);
    }
}

package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class StringIndexOutOfBoundsException {
    public static void generateException(String s){
        char Chars = s.charAt(s.length()+1);
        System.out.println(Chars);
    }

    public static void handlingException(String s){
        try {
            generateException(s);
        }catch (Exception exception){
            System.out.print("Caught");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        try{
            generateException(s);
        }catch (Exception exception){

            handlingException(s);
        }

//        handlingException(s);
    }
}

package com.bridgelabz.strings.levelone;

import java.util.Arrays;
import java.util.Scanner;

public class StringToArray {
    public static boolean getCharArray(String s){

        char[] sArray = new char[s.length()];
        for (int i = 0 ; i < s.length() ; i++){
            sArray[i] = s.charAt(i);

        }

        char[] sArrayTwo = new char[s.length()];
        sArrayTwo = s.toCharArray();

        return (Arrays.equals(sArray, sArrayTwo));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();

        System.out.println("Is Equal Array: " + getCharArray(s));
    }
}

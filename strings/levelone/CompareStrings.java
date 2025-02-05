package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class CompareStrings {
    public static boolean getIsEqualUsingCharAt(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static boolean getIsEqualUsingEquals(String s1, String s2){

        return s1.equals(s2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter strings to compare: ");
        String s1 = input.next();
        String s2 = input.next();
        input.close();

        System.out.println("Is equal using char at: " + getIsEqualUsingCharAt(s1, s2));
        System.out.println("Is equal using equals: " + getIsEqualUsingEquals(s1, s2));
    }


}

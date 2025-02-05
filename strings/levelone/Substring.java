package com.bridgelabz.strings.levelone;


import java.util.Scanner;

public class Substring {
    public static String getSubstringUsingCharAt(String s, int start, int end){
        if(s.length() == 0 && s.length() == 1){
            return "Enter a longer Strings ";
        }
        String result = "";
        for(int i = start ; i < end ; i++ ){
            result += s.charAt(i);

        }
        return result;
    }

    public static String getSubstringUsingSubstring(String s, int start, int end){
        return s.substring(start, end);
    }

    public static boolean getIsEqualUsingCharAt(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();
        System.out.print("Enter start index of Substring: ");
        int start = input.nextInt();
        System.out.print("Enter end index of Substring: ");
        int end = input.nextInt();
        input.close();

        System.out.println("Substring using CharAt(): " + getSubstringUsingCharAt(s, start, end));
        System.out.println("Substring using Substring(): " + getSubstringUsingSubstring(s, start, end));

    }

}

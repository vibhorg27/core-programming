package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class UpperToLowerCase {
    public static boolean getLowerCase(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i< s.length() ; i++){
            result.append((char) (s.charAt(i) + 32));
        }

        String ans = s.toLowerCase();
        return result.toString().equals(ans);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings in upper case: ");

        String s = input.nextLine();
        input.close();

        System.out.println(getLowerCase(s));

    }

}

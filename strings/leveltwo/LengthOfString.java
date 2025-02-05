package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class LengthOfString {

    public static int getStringLength(String s){
        int count = 0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch (IndexOutOfBoundsException e){

        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();

        System.out.println("Length of the string is: " + getStringLength(s));
        System.out.println("Length of the string is using length() function: " + s.length());
    }
}

package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char getFirstUniqueCharacter(String s){
        int length = 0;
        int[] freq = new int[256];
        try{
            while(true){
//                s.charAt(length);
                freq[s.charAt(length)]++;
                length++;
            }
        } catch (IndexOutOfBoundsException e) {

        }

        for(int i = 0 ; i < length ; i++){
            if(freq[s.charAt(i)] == 1){
                return s.charAt(i);
            }
        }
        return '\0';

    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();

        char result = getFirstUniqueCharacter(s);
        if(result != '\0'){
            System.out.println("First non repeating character: " + result);
        }

        else{
            System.out.println("No non repeating characters");
        }

    }
}

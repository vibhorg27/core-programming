package com.bridgelabz.strings.levelthree;

import com.sun.net.httpserver.SimpleFileServer;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String s){
        int count = 0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        return count;
    }

    public static char[] getUniqueCharacters(String s){
        char[] uniqueChars = new char[getLength(s)];
        int uniqueCount = 0;

        for(int i = 0 ; i < getLength(s) ; i++){
            char currChar = s.charAt(i);
            boolean isUnique = true;
            for(int j = 0 ; j < uniqueCount ; j++){
                if (uniqueChars[j] == currChar){
                    isUnique = false;
                    break;

                }
            }
            if(isUnique){
                uniqueChars[uniqueCount] = currChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++){
            result[i] = uniqueChars[i];
        }

        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();

        char[] uniqueChar = getUniqueCharacters(s);
        System.out.println("Unique Characters: ");
        for(char c : uniqueChar){
            System.out.print(c + " ");
        }
    }
}

package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static String checkVowelAndConsonant(char ch){
        ch = Character.toLowerCase(ch);
        if(ch > 'a' || ch < 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                return "Vowel";
            }
            else return "Consonant";

        }
        else return "Not an alphabet";
    }

    public static int[] countOfVowelsAndConsonants(String s){
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(checkVowelAndConsonant(s.charAt(i)).equals("Vowel")){
                vowelCount++;
            }
            else if(checkVowelAndConsonant(s.charAt(i)).equals("Consonant")){
                consonantCount++;
            }
        }
        return new int[] {vowelCount,consonantCount};
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        int[] counts = countOfVowelsAndConsonants(text);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
    }
}

package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class VowelAndConsonantChecker {

    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] identifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacterType(text.charAt(i));
        }
        return result;
    }

    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("Character | Type");

        for (String[] charType : charTypes) {
            System.out.println(charType[0] + "\t" + charType[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        String[][] result = identifyCharacters(text);
        displayCharacterTypes(result);
    }
}


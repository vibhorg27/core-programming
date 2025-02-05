package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class FrequencyOfUniqueCharacters {

    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = ch;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] frequencyArray = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            frequencyArray[i][0] = String.valueOf(uniqueChars[i]);
            frequencyArray[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return frequencyArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        String[][] frequencyArray = findCharacterFrequency(text);
        for (String[] entry : frequencyArray) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }

    }
}

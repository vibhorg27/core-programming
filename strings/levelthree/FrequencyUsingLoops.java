package com.bridgelabz.strings.levelthree;

import java.util.Scanner;


public class FrequencyUsingLoops {

    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') continue;
            frequency[i] = 1;
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) {
                result[index++] = characters[i] + " - " + frequency[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        String[] frequencyArray = findCharacterFrequency(text);
        System.out.println("Character\tFrequency");

        for (String entry : frequencyArray) {
            System.out.println(entry);
        }
    }
}


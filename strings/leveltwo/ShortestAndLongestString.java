package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class ShortestAndLongestString {
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int wordCount = 1;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    public static String[][] getMaxAndMinWordLength(String[] words) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        String longestWord = "", shortestWord = "";

        for (String word : words) {
            int length = getStringLength(word);
            if (length > maxValue) {
                maxValue = length;
                longestWord = word;
            }
            if (length < minValue) {
                minValue = length;
                shortestWord = word;
            }
        }

        return new String[][]{
                {longestWord, String.valueOf(maxValue)},
                {shortestWord, String.valueOf(minValue)}
        };
    }

    public static void displayMaxAndMinLength(String[][] maxAndMinLength) {
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] strings : maxAndMinLength) {
            System.out.println(strings[0] + "\t" + Integer.parseInt(strings[1]));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();
        input.close();

        String[] words = customSplit(text);
        String[][] wordsWithLength = getMaxAndMinWordLength(words);
        displayMaxAndMinLength(wordsWithLength);
    }
}

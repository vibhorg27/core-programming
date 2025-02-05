package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class SplitStringAndGetLength {
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
        int wordCount = 1; // At least one word exists
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount];
        int index = 0;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);
            start = end + 1;
        }

        words[wordCount - 1] = text.substring(start);
        return words;
    }

    public static String[][] getWordLength(String[] words) {
        int n = words.length;
        String[][] wordAndLength = new String[n][2];
        for(int i = 0 ; i < words.length ; i++){
            wordAndLength[i][0] = words[i];
            wordAndLength[i][1] = String.valueOf(words[i].length());
        }
        return wordAndLength;

    }

    public static void displayResult(String[][] wordsAndLength) {

        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] strings : wordsAndLength) {
            System.out.println(strings[0] + "\t" + Integer.parseInt(strings[1]));

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();
        input.close();

        String[] words = customSplit(text);
        String[][] wordsWithLength = getWordLength(words);
        displayResult(wordsWithLength);


    }
}

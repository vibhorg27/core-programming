package com.bridgelabz.strings.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {

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

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();
        input.close();

        String[] customSplitResult = customSplit(text);
        String[] builtInSplitResult = text.split(" ");

        System.out.println("Custom Split Result:");
        for (String word : customSplitResult) {
            System.out.println(word);
        }

        System.out.println("Built-in Split Result:");
        for (String word : builtInSplitResult) {
            System.out.println(word);
        }

        System.out.println("Are the results identical? " + compareArrays(customSplitResult, builtInSplitResult));
    }
}

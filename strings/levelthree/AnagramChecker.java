package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] frequency = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
            frequency[str2.charAt(i)]--;
        }

        for (int count : frequency) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = input.nextLine().toLowerCase();
        input.close();

        System.out.println(areAnagrams(str1, str2) ? "Anagrams" : "Not Anagrams");
    }
}


package com.bridgelabz.methods.levelthree;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerThree {
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }

        return count;
    }

    public static int[] getDigitsArray(int n){
        int noOfDigits = countDigits(n);
        int[] digitsArray = new int[noOfDigits];
        int num = n;
        for(int i = noOfDigits - 1 ; i >= 0; i--){
            digitsArray[i] = num % 10;
            num= num/10;
        }

        return digitsArray;
    }

    public static int[] getReverseOfArray(int n){
        int noOfDigits = countDigits(n);
        int[] digitsArray = getDigitsArray(n);
        int[] reverseArray = new int[noOfDigits];

        for(int i = noOfDigits - 1 ; i >= 0; i--){
            reverseArray[noOfDigits-i-1] = digitsArray[i];
        }
        return reverseArray;
    }

    public static boolean compareArray(int[] arrayOne, int[] arrayTwo){
        int a = arrayOne.length;
        int b = arrayTwo.length;
        if(a != b){
            return false;
        }
        for(int i= 0; i< a ; i++){
            if(arrayOne[i] != arrayTwo[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(int n){
        int[] digits = getDigitsArray(n);
        int[] reverseDigitsArray = getReverseOfArray(n);
        return compareArray(digits, reverseDigitsArray);

    }

    public static boolean duckNumber(int n){
        int noOfDigits = countDigits(n);
        int[] digitsArray = getDigitsArray(n);

        for(int i = 0; i< noOfDigits ; i++){
            if(digitsArray[i] == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        System.out.println("Array: " + Arrays.toString(getDigitsArray(n)));
        System.out.println("Reverse Array: " + Arrays.toString(getReverseOfArray(n)));

        System.out.println("Palindrome: " + checkPalindrome(n));
        System.out.println("Duck Number: " + duckNumber(n));
    }
}

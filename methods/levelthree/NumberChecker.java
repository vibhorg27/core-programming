package com.bridgelabz.methods.levelthree;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
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

    public static boolean armstrongNumber(int n){
        double sum = 0;
        int num = n;
        while(n != 0){
            sum = sum + Math.pow(n%10, 3);
            n = n/10;
        }
        return sum == num;
    }

    public static int largest(int n){
        int digits[] = getDigitsArray(n);
        int noOfDigits =  countDigits(n);
//        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0 ; i < noOfDigits ; i++){
            if(digits[i] > maxi ){
                maxi = digits[i];
            }
        }
        return maxi;
    }

    public static int smallest(int n){
        int digits[] = getDigitsArray(n);
        int noOfDigits =  countDigits(n);
        int mini = Integer.MAX_VALUE;
//        int maxi = Integer.MIN_VALUE;

        for(int i = 0 ; i < noOfDigits ; i++){
            if(digits[i] < mini ){
                mini = digits[i];
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        input.close();

        System.out.println("Number of digits: " + countDigits(n));
        System.out.println("Digits Array: " + Arrays.toString(getDigitsArray(n)));
        System.out.println("Duck Number: " + duckNumber(n));
        System.out.println("Armstrong Number: " + armstrongNumber(n));
        System.out.println("Largest Number: " + largest(n));
        System.out.println("Smallest Number: " + smallest(n));

    }
}

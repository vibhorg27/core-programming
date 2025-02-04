package com.bridgelabz.methods.levelthree;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerTwo {
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


    public static int digitsSum(int n){
        int noOfDigits = countDigits(n);
        int[] digits = getDigitsArray(n);
        int sum =0;
        for(int i=0; i < noOfDigits ; i++){
            sum += digits[i];
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int n){
        int noOfDigits = countDigits(n);
        int[] digits = getDigitsArray(n);
        int sum =0;
        for(int i=0; i < noOfDigits ; i++){
            sum += (int) Math.pow(digits[i] , 2);
        }
        return sum;

    }

    public static boolean harshadNumber(int n){
        int sum = digitsSum(n);
        int num = n;

        while(num !=0){
            sum = sum + n%10;
            num = num/10;
        }
        return n % sum == 0;
    }

    public static int[][] digitsFrequency(int n){
        int noOfDigits = countDigits(n);
        int[] digits = getDigitsArray(n);
//        int[] frequency = new int[10];
//
//        for(int it : digits){
//            frequency[it]++;
//        }

        int[][] result = new int[10][2];

        for(int i = 0; i < 10 ; i++){
           result[i][0] = i;
        }

        for(int j =0 ; j<noOfDigits ; j++){
           result[digits[j]][1]++;

        }

        return result;

    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();


        System.out.println("Digits count = " + countDigits(n));
        System.out.println("Digits array = " + Arrays.toString(getDigitsArray(n)));
        System.out.println("Digits sum = " + digitsSum(n));
        System.out.println("Sum of squares of digits = " + sumOfSquaresOfDigits(n));
        System.out.println("Harshad Number = " + harshadNumber(n));

        //Print the frequency array
        int[][] result = digitsFrequency(n);

        for (int i = 0; i < 10; i++) {

            System.out.println("Digit: " + result[i][0] + ", Frequency: " + result[i][1]);

        }

    }
}

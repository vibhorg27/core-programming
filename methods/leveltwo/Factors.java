package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class Factors{
    
    public static int[] getFactors(int n){
        int count = 0;
        for(int i =1 ; i<= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        int digits[] = new int[count];
        int index = 0;

        for(int i =1 ; i<= n; i++){
            if(n % i == 0){
                digits[index] = i;
                index++;
            }
        }

        return digits;
    }
    public static int getSumOfFactors(int n){
        int[] digits =  getFactors(n);
        int sum = 0;
        for(int i= 0; i<digits.length ; i++){
            sum = sum + digits[i];
        }

        return sum;
    }

    public static int getProductOfFactors(int n){
        int[] digits =  getFactors(n);
        int product = 1;
        for(int i= 0; i<digits.length ; i++){
            product = product * digits[i];
        }

        return product;
    }

    public static int getSumOfSquareOfFactors(int n){
        int[] digits =  getFactors(n);
        int sum = 0;
        for(int i= 0; i<digits.length ; i++){
            digits[i] = (int) Math.pow(digits[i], 2);
            sum = sum + digits[i];

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        input.close();

        int sum = getSumOfFactors(number);
        int product = getProductOfFactors(number);
        int powerSum = getSumOfSquareOfFactors(number);

        
        System.out.println("Sum of Factors is: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + powerSum);
    }
}
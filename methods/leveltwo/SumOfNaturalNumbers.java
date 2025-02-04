package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int getSum(int n ){
        if(n <= 0){
            return 0;
        }

        int sum =0;
        while(n >= 1){
            sum = sum +n;
            n--;
        }

        return sum;
    }

    public static int getSumAgain(int n){
        int sum = (n * (n+1))/2;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        input.close();
        boolean result = (getSum(n) == getSumAgain(n));
        System.out.println(result);


        
    }
}

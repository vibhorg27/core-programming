package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int getSum(int n){
        int sum = (n * (n-1))/2;
        
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int n = input.nextInt();
        input.close();
        if(n <0){
            System.out.println("Invalid Natural Number");
        }
        else{
            int ans = getSum(n);
            System.out.println(ans);
        }
    }
}

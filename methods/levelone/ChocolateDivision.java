package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class ChocolateDivision {
    public static int[] getRemainingChocolates(int chocolates, int children){
        int eachChildChocolates = chocolates  / children;
        int remChocolates = chocolates  % children;

        return new int[]{eachChildChocolates, remChocolates};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfchocolates  = input.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        input.close();

        int result[] = getRemainingChocolates(numberOfchocolates, numberOfChildren);

    

        System.out.println("The number of chocolates each child gets is " + result[0] + " and the remaining chocolates are " + result[1]);
    }
}

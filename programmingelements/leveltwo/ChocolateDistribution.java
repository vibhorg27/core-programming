package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfchocolates  = input.nextInt();
        int numberOfChildren = input.nextInt();

        input.close();

        int eachChildChocolates = numberOfchocolates  / numberOfChildren;
        int remChocolates = numberOfchocolates  % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + eachChildChocolates + " and the remaining chocolates are " + remChocolates);
    }
}

package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int bonus = input.nextInt();

        input.close();

        int totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

        
    }
}

package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        input.close();

        if(age > 18){
            System.out.println("The person's age is " + age + " and can vote.");
        }
        else System.out.println("The person's age is " + age + " and cannot vote.");
    }
}

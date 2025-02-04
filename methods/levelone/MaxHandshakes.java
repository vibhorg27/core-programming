package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class MaxHandshakes {
    public static int calculateMaxHandshakes(int n){
        return (n * ( n -1 ))/2;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        input.close();
        System.out.println("With number of students as " + numberOfStudents + " maximum possible handshakes are "+ calculateMaxHandshakes(numberOfStudents));
    }
}

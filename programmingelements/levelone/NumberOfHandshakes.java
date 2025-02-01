package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        input.close();

        int maxHandshakes = (numberOfStudents * ( numberOfStudents -1 ))/2;

        System.out.println("With number of students as " + numberOfStudents + " maximum possible handshakes are "+ maxHandshakes);
    }
}

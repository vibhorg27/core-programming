package com.bridgelabz.programmingelements.levelone;

public class PenDistribution {
    public static void main(String[] args) {
        int numberOfPens = 14;
        int numberOfStudents = 3;

        int penPerStudent = numberOfPens/numberOfStudents;
        int remainingPens = numberOfPens%numberOfStudents;

        System.out.println("The pen per student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
        
    }
}

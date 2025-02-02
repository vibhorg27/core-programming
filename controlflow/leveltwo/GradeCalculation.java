package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        input.close();

        double percentage = (physics + chemistry + maths)/3;
        if(percentage >= 80){
            System.out.println("Grade: A - " + "above agency-normalized standards " + percentage + "%");
        }
        if(percentage >= 70 && percentage <= 79){
            System.out.println("Grade: B - " + "at agency-normalized standards " + percentage + "%");
        }
        if(percentage >= 60 && percentage <= 69){
            System.out.println("Grade: C - " + "below, but approaching agency-normalized standards "+ percentage + "%");
        }
        if(percentage >= 50 && percentage <= 59){
            System.out.println("Grade: D - " + "well below agency-normalized standards "+ percentage + "%");
        }
        if(percentage >= 40 && percentage <= 49){
            System.out.println("Grade: E - " + "too below agency-normalized standards "+ percentage + "%");
        }
        if(percentage <= 39){
            System.out.println("Grade: R - " + "remedial standards "+ percentage + "%");
        }

    }
}

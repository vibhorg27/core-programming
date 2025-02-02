package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class LeapYearWithSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();

        if(year >= 1582){
            if((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)){
                System.out.println("It is a leap Year");
            }
            else System.out.println("It is not a leap year");
        }
    }
}

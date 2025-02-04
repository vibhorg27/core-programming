package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeap(int year){
        if(year >= 1582){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                else return false;
            }
            else if(year % 4==0){
                return true;
            }
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();

        boolean result = isLeap(year);
        System.out.println(result);
    }
}

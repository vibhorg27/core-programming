package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int day, int month){
        if(day > 31 || month > 12){
            return false;
        }
        else{
            if(day < 20 && month < 3 ){
                return false;
            }

            else if (day > 20 && month > 6){
                return false;
            }
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        input.close();

        boolean ans = isSpringSeason(day,month);
        System.out.println(ans);
    }
}

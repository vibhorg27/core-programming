package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        input.close();

        if(day > 31 || month > 12){
            System.out.println("enter valid date");
        }
        else{
            if(day < 20 && month < 3 ){
                System.out.println("Not a Spring Season");
            }

            else if (day > 20 && month > 6){
                System.out.println("Not a Spring Season");
            }
            else System.out.println("Its a Spring Season");
        }

    }
}

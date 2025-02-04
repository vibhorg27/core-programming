package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class Calender {
    public static String getMonthNames(int month){
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month -1];

    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getNumberOfDays(int month, int year){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(month == 2 && isLeapYear(year)){
            return 29;
        }
        return days[month -1];
    }

    public static int getFirstDayOfTheMonth(int month, int year){
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;

    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthNames(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfTheMonth(month, year);


        System.out.println("        " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");


        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }


        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();


        for (int i = 2; day <= daysInMonth; i++) {
            for (int j = 0; j < 7; j++) {
                if (day <= daysInMonth) {
                    System.out.printf("%3d ", day++);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking month and year as input from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);
    }
}




package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temp, double speed){
        double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(speed, 0.16);
        return windChill;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Wind Temperature: ");
        double windTemp = input.nextDouble();
        System.out.print("Enter Wind speed: ");
        double windSpeed = input.nextDouble();

        input.close();

        double ans = calculateWindChill(windTemp, windSpeed);
        System.out.println("Wind chill = " + ans);
    }
}

package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;
// import java.util.concurrent.Flow.Publisher;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearOfService = input.nextInt();
        input.close();

        if(yearOfService > 5){
            double bonus = .05 * salary;
            System.out.println(bonus);
        }
        else System.out.println("No bonus");

        
    }
}

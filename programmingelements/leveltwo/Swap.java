package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        input.close();
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("The swapped numbers are " + a+ ", " + b );
        
    }

}

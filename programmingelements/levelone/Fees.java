package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class Fees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Fee input
        int fee = input.nextInt();
        // Discount Input
        int discountPercent = input.nextInt();
        input.close();
        // Discount an dnew fees computation
        double discount = (double)fee * ((double)discountPercent/(double)100);
        double newFees = (double)fee - discount;
        
        System.out.println("The discount anount is INR " + discount + " and final discounted fee is INR " + newFees );
    }
    
    
}

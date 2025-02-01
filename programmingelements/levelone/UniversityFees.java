package com.bridgelabz.programmingelements.levelone;

public class UniversityFees {
    public static void main(String[] args) {
        
        int fee = 125000;
        int discountPercent = 10;
        double discount = (double)fee * ((double)discountPercent/(double)100);
        double newFees = (double)fee - discount;
        
        System.out.println("The discount anount is INR " + discount + " and final discounted fee is INR " + newFees );
    }
}

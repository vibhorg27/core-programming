package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class Bonus{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num =2;
        double[] currSalary = new double[num];
        double[] yearsOfService = new double[num];
        double[] newSalary = new double[num];
        double[] bonus = new double[num];
        

        double totalBonus = 0, totalNewSalary = 0, totalOldSalary =  0;

        for(int i = 0 ; i<num ; i++){    
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double salary = input.nextDouble();
            
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double years = input.nextDouble();


            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; 
                continue;
            }
            
            currSalary[i] = salary;
            yearsOfService[i] = years ;
            
        }
        
        for(int i = 0 ; i<num ; i++){    
            
            double bonusPercentage = (yearsOfService[i] >= 5) ? 0.05 : 0.02;
            bonus[i] = currSalary[i] * bonusPercentage;
            newSalary[i] = currSalary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += currSalary[i];
            totalNewSalary += newSalary[i];
            
        }
        input.close();

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total new Salary: " + totalNewSalary);
        System.out.println("Total old Salary: " + totalOldSalary);

    }
}
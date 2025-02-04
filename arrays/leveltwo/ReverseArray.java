package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        int num = n;
        input.close();
        
        while(num > 0){
            num = num/10;
            count++;
        }
        System.out.println(count);

        int digits[] = new int[count];
        num = n;
        for(int i = 0; i< count; i++){
            digits[i] = num % 10;
            num = num/10;
        }
        for(int i = 0; i< count; i++){
            
            System.out.print(digits[i] + " ");
        }

    }
}


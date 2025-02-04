package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] arr = new double[10];
        
        double sum = 0;
        int i =0;
        while(true){
            
            double num = input.nextDouble();
            if(num <= 0){
                break;
            }
            
            arr[i] = num;
            i++;

            if(i == 10){
                break;
            }    
            
        }
        input.close();
        for(int j = 0; j < 10; j++ ){
            sum = sum +arr[j];
        }
        System.out.println(sum);
    }
}

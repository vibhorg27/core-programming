package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class MeanHeights {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] height = new double[11];

        double sum = 0;

        for(int i = 0; i< 11; i++){
            height[i] = input.nextDouble();
            sum = sum + height[i];
        }
        double meanHeight = sum / 11;
        System.out.println(meanHeight);

        input.close();
        
    }
}

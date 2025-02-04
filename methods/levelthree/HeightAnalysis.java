package com.bridgelabz.methods.levelthree;
import java.util.Scanner;

public class HeightAnalysis {
    public static int heightsSum(int heights[]){
        int sum =0;
        for(int i=0; i<heights.length ; i++){
            sum += heights[i];
        }
        return sum;
    }

    public static double meanHeight(int heights[]){
        double meanHeights = heightsSum(heights) / heights.length ;

        return meanHeights;
    }

    public static int shortestHeight(int heights[]){
        int maxHeight = heights[0];

        for(int i = 0; i<heights.length ; i++){
            if(heights[i] > maxHeight){
                maxHeight = heights[i];
            }
        }
        return maxHeight;
    }

    public static int tallestHeight(int heights[]){
        int minHeight = heights[0];

        for(int i = 0; i<heights.length ; i++){
            if(heights[i] < minHeight){
                minHeight = heights[i];
            }
        }
        return minHeight;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 11;
        int heights[] = new int[n];

        for(int i = 0; i< n; i++){
            heights[i] = input.nextInt();

        }
        input.close();

        System.out.println("Sum of heights = " + heightsSum(heights));
        System.out.println("Mean of heights = " + meanHeight(heights));
        System.out.println("Shortest height = " + shortestHeight(heights));
        System.out.println("Tallest heights = " + tallestHeight(heights));
    }
}

package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class MatrixToOneD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the 2D matrix: ");

        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        input.close();
        int[] arr = new int[rows*cols];
        int index = 0;

        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                arr[index++] = matrix[i][j];
            }
        }

        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
        } 

        System.out.println();

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        
    }
}

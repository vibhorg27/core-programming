package com.bridgelabz.strings.levelone;

import java.lang.NumberFormatException;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void getException(int[] arr, int target){
        System.out.println(arr[target]);
    }

    public static void handleException(int[] arr, int target){
        try{
            getException(arr, target);
        }catch (java.lang.ArrayIndexOutOfBoundsException exception){
            System.out.println("Caught exception: " + exception.getMessage());
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = input.nextInt();
        System.out.print("Enter target: ");
        int target = input.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];

        for (int i = 0; i< n ; i++){
            arr[i] = input.nextInt();
        }
        try{
            getException(arr, target);
        }catch (java.lang.ArrayIndexOutOfBoundsException exception){
            System.out.println("Caught in main");
        }
        handleException(arr, target);
    }
}

package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class CanVote{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i<10 ; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i<10 ; i++){
            if(arr[i] > 18){
                System.out.println("The student with age " + arr[i] + " can vote");
            }
            else System.out.println("The student with age " + arr[i] + " cannot vote");
        }
        input.close();
        
    }
}
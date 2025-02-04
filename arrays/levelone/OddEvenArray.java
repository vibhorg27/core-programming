package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] odd = new int[n/2 +1];
        int[] even = new int[n/2 +1];

        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 0 ; i< n ; i++){
            if(i % 2 == 0){
                even[evenIndex++] = input.nextInt();
                
            }
            else{
                odd[oddIndex++] = input.nextInt();
                
            }
        }
        for(int i=0 ; i<evenIndex+1 ; i++){
            System.out.print(even[i] + " ");
        }

        System.out.println();

        for(int i=0 ; i<oddIndex+1 ; i++){
            System.out.print(odd[i] + " ");
        }
        input.close();
        
    }
}

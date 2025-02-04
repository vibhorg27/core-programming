package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxDigit = 10;
        int arr[] = new int[maxDigit];
        int index = 0;

        while(n > 0){
            
            if(index == maxDigit){
                maxDigit +=10;
                int temp[] = new int[maxDigit];
                System.arraycopy(arr, 0, temp, 0, arr.length);
                arr = temp;
            }
            arr[index] = n%10;
            n/= 10;
            index++;


        }

        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // for(int i =0 ; i<maxDigit ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        input.close();

        System.out.println();

        System.out.println("Largest Number is: " + largest);
        System.out.println("Second Largest Number is: " + secondLargest);


    }
}

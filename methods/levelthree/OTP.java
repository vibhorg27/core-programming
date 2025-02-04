package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class OTP {
    public static int generateRandomOTP(){
        int max = 999999;
        int min =100000;

        return (int) ((Math.random() * (max - min)) + min);
    }

    public static boolean isOtpUnique(int[] otpArray){
        for(int i = 0; i < otpArray.length ; i++){
            for(int j = i+1; j < otpArray.length ; j++){
                if(otpArray[i] == otpArray[j]) return false;
            }
        }
        return true;
    }

    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of otps to be generated: ");
        int n = input.nextInt();

        int[] otps = new int[n];

        for(int i=0; i < n ; i++){
            otps[i] = generateRandomOTP();
        }

        for(int i=0; i < n ; i++){
            System.out.println(otps[i]);
        }

        System.out.println("Is unique OTP: " + isOtpUnique(otps));

    }
}

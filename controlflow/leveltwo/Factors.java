package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for(int i = 1; i <=n ; i++){
            if(n % i ==0){
                System.out.println(i);
            }
        }

    }
}

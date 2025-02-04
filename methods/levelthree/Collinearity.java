package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class Collinearity {
    public static boolean getCollinearityBySlope(float x1, float x2, float x3, float y1, float y2, float y3){
        float slopeA = (y2 - y1)/(x2 - x1);
        float slopeB = (y3 - y2)/(x3 - x2);
        float slopeC =  (y3 - y1)/(x3 - x1);

        return slopeA == slopeB && slopeB == slopeC;

    }

    public static boolean getCollinearityByAreaOfTriangle(float x1, float x2, float x3, float y1, float y2, float y3){
        float area = (float) 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
         if(area == 0){
             return true;
         }
         return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float x1 = input.nextFloat();
        float x2 = input.nextFloat();
        float x3 = input.nextFloat();
        float y1 = input.nextFloat();
        float y2 = input.nextFloat();
        float y3 = input.nextFloat();

        System.out.println("Collinearity By Slope = " + getCollinearityBySlope(x1, x2, x3, y1, y2, y3));
        System.out.println("Collinearity By Area Of Triangle = " + getCollinearityByAreaOfTriangle(x1, x2, x3, y1, y2, y3));

    }
}

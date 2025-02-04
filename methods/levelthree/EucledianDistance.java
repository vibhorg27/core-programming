package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class EucledianDistance {
    public static float getEucledianDistance(float x1, float x2, float y2, float y1){
        return (float) (Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));


    }

    public static float[] getEquation(float x1, float x2, float y2, float y1){
        float slope = (float)((y2 - y1) / (x2 - x1));
        float yIntercept = y1 - slope * x1;

        return new float[] {slope, yIntercept};
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Coordinates: ");
        float x1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y1 = input.nextFloat();
        float y2 = input.nextFloat();

        input.close();
        float[] equationAttribute = getEquation(x1, x2, y1, y2);

        System.out.println("Eucledian distance = " + getEucledianDistance(x1, x2, y1, y2));
        System.out.println("Equation is: y = " + equationAttribute[0] + "x" + " + " + equationAttribute[1] );
    }

}

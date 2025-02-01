package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();

        input.close();

        float areaOfTriangleInInches = (base * height) / (float)2;
        float areaOfTriangleInCm = areaOfTriangleInInches * (float)2.54 * (float)2.54;

        System.out.println("Area of the triangle in Inches is " + areaOfTriangleInInches + " and in cm is " + areaOfTriangleInCm);


    }
}

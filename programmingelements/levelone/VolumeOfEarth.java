package com.bridgelabz.programmingelements.levelone;

public class VolumeOfEarth {
    public static void main(String[] args) {
        int radiusOfEarth = 6378;
        double volumeCubicKm = (4/3) * 3.14 * (double)radiusOfEarth * (double)radiusOfEarth * (double)radiusOfEarth;
        double volumeCubicMi = volumeCubicKm * 1.6;

        System.out.println("The volume of Earth in cubic kms is " + volumeCubicKm + " and cubic miles is " + volumeCubicMi );
    }
    
}

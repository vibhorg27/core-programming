package com.bridgelabz.strings.levelone;

public class NullPointerException {

    public static void generateException(){
        String s = null;
        System.out.println(s.length());
    }

    public static void handleException(){
        try{
            generateException();
        }catch (Exception exception){
            System.out.println("Caught");
        }
    }
    public static void main(String[] args){
        try{
            generateException();
        }catch (Exception exception){
            System.out.println("Caught in main");
        }

        handleException();
    }
}

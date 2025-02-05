package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static int[][] getFrequency(String s){
        int[] freq = new int[256];
        int length = 0;
        try{
            while(true){
                char ch = s.charAt(length);
                freq[ch]++;
                length++;
            }
        }catch (Exception e){

        }

        int count = 0;
        for(int i : freq){
            if(i > 0){
                count++;
            }
        }


        int[][] freqOfCharacters= new int[count][2];
        int index =0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 0){
                freqOfCharacters[index][0] = i;
                freqOfCharacters[index][1] = freq[i];
                index++;
            }
        }

        return freqOfCharacters;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Strings: ");
        String s = input.nextLine();
        input.close();

        int[][] freqArray = getFrequency(s);
        for(int[] i : freqArray) {
            System.out.println((char) i[0] + "\t" + i[1]);
        }
    }
}

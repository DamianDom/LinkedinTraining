package com.example.java;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int original = 10;
        System.out.println("Original before: " + original); //10
        incrementValue(original);                                   //11
        System.out.println("Original after: " + original);  //10

        int[] arOriginal = {10, 20, 30};
        System.out.println("Original 1 place in array before: " + arOriginal[0]); //10
        incrementValueArray(arOriginal);                                                    //11
        System.out.println("Original 1 place in array after: " + arOriginal[0]);  //11
    }

    static private void incrementValue(int inMethod){
        inMethod++;
        System.out.println("In method: " + inMethod);
    }

    static private void incrementValueArray(int[] inMethod){
        inMethod[0]++;
        System.out.println("In method: " + Integer.toString(inMethod[0]));
    }
    }

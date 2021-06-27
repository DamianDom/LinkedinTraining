package com.example.java;

public class Main4 {

    public static void main(String[] args) {
        int original = 10;
        System.out.println("Original before: " + original); //10
        incrementValue();                                   //11
        System.out.println("Original after: " + original);  //10



    }

    static private void incrementValue(int inMethod){
        inMethod++;
        System.out.println("In method: " + inMethod);
    }

    }

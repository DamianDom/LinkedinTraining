package com.example.java;

import java.math.BigDecimal;

// CTRL+Q - java documentation
// CTRL+K - commit
// CTRL+SHIFT+K - push
public class Main {

    void primitivesCast(){
        System.out.println("Hello There !");
        String aString = "Damian";
        System.out.println("Hello there " + aString);

        double doubleValue = 156.5d;
        Double doubleObj = new Double(doubleValue);
        byte byteValue = doubleObj.byteValue();
        int intValue = doubleObj.intValue();
        float floatValue = doubleObj.floatValue();
        String stringValue = doubleObj.toString();
            System.out.println("DOUBLE: " + doubleObj);
            System.out.println("BYTE: " + byteValue);
            System.out.println("INT: " + intValue);
            System.out.println("FLOAT: " + floatValue);
            System.out.println("STRING: " + stringValue);
    }

    static void maxValues(){
        byte b = 127;
        System.out.println("Byte:" + b);

        if( b < Byte.MAX_VALUE){
            b++;
        }
        System.out.println("Byte" + b);
    }

    static void doublePrecise(){
        double value = .012;
        double pSum = value + value + value;

        System.out.println("Sum of primitives: " + pSum);

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());
    }

   public static void main(String[] args) {
        maxValues(); // invoked static method
        System.out.println("********************************************************************************************");
        Main mn = new Main();
        mn.primitivesCast(); // invoked non static method
        System.out.println("********************************************************************************************");
        doublePrecise();


   }



}

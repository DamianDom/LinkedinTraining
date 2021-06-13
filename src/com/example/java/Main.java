package com.example.java;

import java.math.BigDecimal;

// CTRL+Q - java documentation
// CTRL+K - commit
// CTRL+SHIFT+K - push
public class Main {

    // static variable for booleans method
    static boolean bDef; // boolean without value always start as FALSE


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

    static void convertingNumbers(){
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("The long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int: " + intValue4);
    }

    static void mathLibrary(){
        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        double result5 = (double) intValue1 % intValue2;
        System.out.println("Remainder: " + result5);

        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute: " + absValue);
    }

    static void booleans(){

            boolean b1 = true;
            boolean b2 = false;

            System.out.println("The value of b1 is: " + b1);
            System.out.println("The value of b2 is: " + b2);
            System.out.println("The value of bDef is: " + bDef);

            boolean b3 = !b1;
            System.out.println("The value of b3 is: " + b3);

            int i1 = 0;
            boolean b4 = (i1 != 0);
            System.out.println("The value of b4 is: " + b4);

            String sBoolean = "true";
            boolean parsed = Boolean.parseBoolean(sBoolean);
            System.out.println("Parsed: " + parsed);
    }

    static void chars(){

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        char dollarSign = '\u0024';
        System.out.println("Currency: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));
    }

   public static void main(String[] args) {
        maxValues(); // invoked static method
        System.out.println("********************************************************************************************");
        Main mn = new Main();
        mn.primitivesCast(); // invoked non static method
        System.out.println("********************************************************************************************");
        doublePrecise();
        System.out.println("********************************************************************************************");
        convertingNumbers();
        System.out.println("********************************************************************************************");
        mathLibrary();
        System.out.println("********************************************************************************************");
        booleans();
        System.out.println("********************************************************************************************");
        chars();

   }



}

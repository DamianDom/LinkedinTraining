package com.example.java;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

// CTRL+Q - java documentation
// CTRL+K - commit
// CTRL+SHIFT+K - push
public class Main {

    // static variable for booleans method
    static boolean bDef; // boolean without value always start as FALSE


    void primitivesCast() {
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

    static void maxValues() {
        byte b = 127;
        System.out.println("Byte:" + b);

        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte" + b);
    }

    static void doublePrecise() {
        double value = .012;
        double pSum = value + value + value;

        System.out.println("Sum of primitives: " + pSum);

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());
    }

    static void convertingNumbers() {
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

    static void mathLibrary() {
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

    static void booleans() {

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

    static void chars() {

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

    static void charToString() {
        char[] chars = {'H', 'e', 'l', 'l', 'o', '!'};
        String s = new String(chars);
        System.out.println(s);
    }

    static void string() {
        // those 2 below are the same
        String s1 = "This is a String";
        String s2 = new String("This also a string");
        String s3 = "Shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 + "Qty: " + 4;
        System.out.println(s5);

        char[] chars = {'H', 'e', 'l', 'l', 'o', '!'};
        String s6 = new String(chars);
        System.out.println(s6);

        char[] chars2 = s6.toCharArray();
        for (char c : chars2) {
            System.out.println(c);
        }
    }

    private static void primitiveToString() {
        int intValue = 42;
        String fromInt = Integer.toString(intValue);

        boolean boolValue = true;

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);
    }

    private static void stringBuilding() {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "1";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }

    private static void compareStrings() {

        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String str3 = "hello";
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String part1 = "Hello ";
        String part2 = "WORLD";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
    }

    private static void numericToString(){

        Locale locale = new Locale("pl", "PL");

        double doubleValue = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));
    }

    private static void parseString(){
        String s1 = "Welcome to California!";
        System.out.println("Length of string: " + s1.length());

        int position = s1.indexOf("California");
        System.out.println("Position of substring: " + position);

        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!         ";
        int len1 = s2.length();
        System.out.println(len1);
        String s3 = s2.trim();
        System.out.println(s3.length());
    }

    private static void datesAndTimes(){
        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ld));
    }

    private static void simpleCalc(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.print("Enter a numeric value: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;

        System.out.println("The answer is " + result);

    }

    public static void main(String[] args) {
        /* maxValues(); // invoked static method
        System.out.println("********************************************************************************************");
        Main mn = new Main();
        mn.primitivesCast(); // invoked non static method
        System.out.println("********************************************************************************************");
        doublePrecise();
        convertingNumbers();
        mathLibrary();
        booleans();
        chars();
        charToString();
        string();
        primitiveToString();
        stringBuilding();
        compareStrings();
        numericToString();
        parseString();
        datesAndTimes();*/
        simpleCalc();
    }


}

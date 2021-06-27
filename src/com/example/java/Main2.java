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
public class Main2 {

    static String[] months = {"January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"};

    public static void main(String[] args) {
        loopIt("Months of the year");
        loopIt("Second run");
        loopIt("Third run");
    }

    static void loopIt(String label) {

        System.out.println(label);
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }


}

package com.intro;

import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(int principal, float rate, int years){
        double mortgage = Main.calculateMortgage(principal, rate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format((mortgage));
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Mortgage is: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float rate, int years){
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------");

    for ( short month = 1; month <= years * 12; month++) {
        double payments = Main.paymentSchedule(principal, rate, years, month);
        System.out.println(NumberFormat.getCurrencyInstance().format((payments)));

    }
}
}

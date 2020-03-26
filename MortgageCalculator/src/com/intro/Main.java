package com.intro;

import java.text.NumberFormat;

public class Main {
    //Principal values between 1K - 1M
    //Interest rate greater than 0 or less than or equal to 30
    //Years  value between 1 and 30
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float rate = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        int years = (int) Console.readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, rate, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format((mortgage));
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Mortgage is: " + mortgageFormatted);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------");

        for ( short month = 1; month <= years * 12; month++) {
            double payments = paymentSchedule(principal, rate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format((payments)));

        }
    }


    public static double calculateMortgage(int principal,
                                           float rate,
                                           int years) {
        float monthlyRate = rate / 100 / 12;
        short paymentNumber = (short)(12 * years);

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, paymentNumber) / (Math.pow(1 + monthlyRate, paymentNumber) - 1));

        return mortgage;
    }

    public static double paymentSchedule(int principal, float rate, int years, short numberOfPaymentsMade) {
        float monthlyRate = rate / 100 / 12;
        short paymentNumber = (short)(12 * years);



        double payments = principal * (Math.pow(1 + monthlyRate, paymentNumber) - Math.pow(1 + monthlyRate, numberOfPaymentsMade))/ (Math.pow(1 + monthlyRate, numberOfPaymentsMade) - 1);

        return payments;

    }
}
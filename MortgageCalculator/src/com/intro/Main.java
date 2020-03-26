package com.intro;


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

        var calculator = new MortgageCalculator(principal, rate, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }


}
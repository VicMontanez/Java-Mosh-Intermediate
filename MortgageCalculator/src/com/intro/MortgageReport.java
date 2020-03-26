package com.intro;

import java.text.NumberFormat;

public class MortgageReport {

    private  MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule(){
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------");

    for ( short month = 1; month <= calculator.getYears() * 12; month++) {
        double payments = calculator.paymentSchedule(month);
        System.out.println(NumberFormat.getCurrencyInstance().format((payments)));

    }
}

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format((mortgage));
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Mortgage is: " + mortgageFormatted);
    }
}

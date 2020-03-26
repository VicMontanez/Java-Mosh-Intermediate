package com.intro;

public class MortgageCalculator {
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

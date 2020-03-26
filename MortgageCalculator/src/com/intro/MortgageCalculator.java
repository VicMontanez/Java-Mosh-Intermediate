package com.intro;

public class MortgageCalculator {
    private int principal;
    private  float rate;
    private int years;

    public MortgageCalculator(int principal, float rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyRate = rate / 100 / 12;
        short paymentNumber = (short)(12 * years);

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, paymentNumber) / (Math.pow(1 + monthlyRate, paymentNumber) - 1));

        return mortgage;
    }

        float monthlyRate = rate / 100 / 12;
        short paymentNumber = (short)(12 * years);

        public double paymentSchedule(short numberOfPaymentsMade) {



        double payments = principal * (Math.pow(1 + monthlyRate, paymentNumber) - Math.pow(1 + monthlyRate, numberOfPaymentsMade))/ (Math.pow(1 + monthlyRate, numberOfPaymentsMade) - 1);

        return payments;

    }

    public int getYears() {
        return years;
    }
}

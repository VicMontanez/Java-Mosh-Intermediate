package com.intro;

public class MortgageCalculator {
    //Principal values between 1K - 1M
    //Interest rate greater than 0 or less than or equal to 30
    //Years  value between 1 and 30
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;

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



        public double paymentSchedule(short numberOfPaymentsMade) {
            float monthlyRate = rate / 100 / 12;
            short paymentNumber = (short)(12 * years);


        double payments = principal * (Math.pow(1 + monthlyRate, paymentNumber) - Math.pow(1 + monthlyRate, numberOfPaymentsMade))/ (Math.pow(1 + monthlyRate, numberOfPaymentsMade) - 1);

        return payments;

    }

    public int getYears() {
        return years;
    }
}

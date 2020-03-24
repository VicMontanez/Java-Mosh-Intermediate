package com.intro;

public class Main {

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
}

package com.intro;

public class Main {

    public static void main(String[] args) {
        //Abstraction example
//        var browser = new Browser();
//        browser.navigate("127.0.0");
        new Employee(10_000);
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);

    }
}

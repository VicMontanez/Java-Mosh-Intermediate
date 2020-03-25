package com.intro;

public class Main {

    public static void main(String[] args) {
        //Abstraction example
//        var browser = new Browser();
//        browser.navigate("127.0.0");
        var employee = new Employee(50_000, 20);
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);

    }
}

package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(
            "Sum =30 " + calculator.add(10, 20)
        );
    }
}
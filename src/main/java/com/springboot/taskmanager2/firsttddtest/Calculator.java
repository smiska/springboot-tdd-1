package com.springboot.taskmanager2.firsttddtest;

public class Calculator {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        } else return a / b;
    }
}

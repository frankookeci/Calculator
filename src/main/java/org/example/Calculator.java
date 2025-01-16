package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int dividieren(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public double squareRoot(double a) {
        if (a < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        return Math.sqrt(a);
    }
}

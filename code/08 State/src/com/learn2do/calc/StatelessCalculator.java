package com.learn2do.calc;

public class StatelessCalculator {
    public double add(double x, double y) {
        return x + y;
    }
    public double subtract(double x, double y) {
        return x - y;
    }
    public double multiply(double x, double y) {
        return x * y;
    }
    public double divide(double x, double y) {
        if (y == 0)
            throw new IllegalArgumentException("divisor cannot be 0");
        return x / y;
    }
}

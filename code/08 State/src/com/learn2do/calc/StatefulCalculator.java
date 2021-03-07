package com.learn2do.calc;

public class StatefulCalculator {
    private double accumulator;
    private boolean isSet = false;

    public double getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(double accumulator) {
        this.accumulator = accumulator;
        this.isSet = true;
    }

    public void clear() {
        this.accumulator = 0;
        this.isSet = false;
    }

    private void calculate(char operator, double operand) {
        if (!this.isSet)
            throw new IllegalStateException("Calculator is not set");
        switch (operator) {
            case '+': this.accumulator += operand; break;
            case '-': this.accumulator -= operand; break;
            case '*': this.accumulator *= operand; break;
            case '/':
                if (operand == 0)
                    throw new IllegalArgumentException("divisor cannot be 0");
                this.accumulator /= operand; break;
        }
    }

    public void add(double y) {
        this.calculate('+', y);
    }

    public void subtract(double y) {
        this.calculate('-', y);
    }

    public void multiply(double y) {
        this.calculate('*', y);
    }

    public void divide(double y) {
        this.calculate('/', y);
    }

}

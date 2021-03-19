package com.payroll.custom;

import com.payroll.core.Payee;

public class Contractor extends Payee {
    private int hours;
    private double rate;

    public Contractor(int id, String name, String account,
                      int hours, double rate) {
        super(id, name, account, 0);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        return this.calculateAdditional();
    }

    @Override
    public double calculateAdditional() {
        return this.rate * this.hours;
    }
}

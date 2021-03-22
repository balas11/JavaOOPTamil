package com.payroll.custom;

import com.payroll.core.Payee;

public class Staff extends Payee {
    private double allowance;

    public Staff(int id, String name, String account, double baseSalary,
                 double allowance) {
        super(id, name, account, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculatePay() {
        return this.getBaseSalary() + this.allowance;
    }

    @Override
    public double calculateAdditional() {
        return this.allowance;
    }
}

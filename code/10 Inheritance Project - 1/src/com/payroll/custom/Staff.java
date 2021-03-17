package com.payroll.custom;

import com.payroll.core.Payee;

public class Staff extends Payee {
    private double allowance;

    public Staff(int id, String name, String account, double baseSalary,
                 double allowance) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }

    @Override
    public double calculatePay() {
        return this.baseSalary + this.allowance;
    }

}

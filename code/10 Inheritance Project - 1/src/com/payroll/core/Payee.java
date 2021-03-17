package com.payroll.core;

public class Payee {
    protected int id;
    protected String name;
    protected String account;
    protected double baseSalary;

    public Payee() {}

    public Payee(int id, String name, String account, double baseSalary) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return this.baseSalary;
    }

}

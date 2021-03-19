package com.payroll.core;

public abstract class Payee {
    private int id;
    private String name;
    private String account;
    private double baseSalary;

    public Payee(int id, String name, String account, double baseSalary) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return this.baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    protected abstract double calculateAdditional();

    public final void printSlip() {
        System.out.println("ID         :" + this.getId());
        System.out.println("Name       :" + this.getName());
        System.out.println("Base       :" + this.getBaseSalary());
        double additional = this.calculateAdditional();
        System.out.println("Additional :" + additional);
        System.out.println("Total      :" + this.calculatePay());
    }
}

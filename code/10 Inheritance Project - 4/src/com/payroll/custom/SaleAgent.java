package com.payroll.custom;

import com.payroll.core.Payee;

public class SaleAgent extends Payee {
    private double saleAmount;
    private double commissionPercentage;

    public SaleAgent(int id, String name, String account, double baseSalary,
                     double saleAmount, double commissionPercentage) {
        super(id, name, account, baseSalary);
        this.saleAmount = saleAmount;
        this.commissionPercentage = commissionPercentage;
    }

    @Override
    public double calculatePay() {
        return this.getBaseSalary()+this.calculateAdditional();
    }

    @Override
    public double calculateAdditional() {
        return this.saleAmount * this.commissionPercentage/100;
    }
}

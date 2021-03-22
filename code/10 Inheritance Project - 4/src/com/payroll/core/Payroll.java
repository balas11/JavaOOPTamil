package com.payroll.core;

import java.util.ArrayList;

public class Payroll {
    private ArrayList payees;

    public Payroll(ArrayList payees) {
        this.payees = payees;
    }

    public double calculateTotalPayout() {
        double total = 0;
        for(Object o: payees) {
            Payee p = (Payee) o;
            total += p.calculatePay();
        }
        return total;
    }

    public void printSlips() {
        for(Object o: payees) {
            Payee p = (Payee) o;
            p.printSlip();
            System.out.println("--------------------------");
        }
    }
}

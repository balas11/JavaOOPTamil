package com.learn2do;

import com.payroll.core.Payroll;
import com.payroll.custom.Database;

public class Main {

    public static void main(String[] args) {
        Payroll payroll = new Payroll(Database.getPayees());
        double total = payroll.calculateTotalPayout();
        System.out.println(total);
    }
}

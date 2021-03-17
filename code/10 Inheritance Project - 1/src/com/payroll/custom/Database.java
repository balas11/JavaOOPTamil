package com.payroll.custom;

import com.payroll.core.Payee;

import java.util.ArrayList;

public final class Database {
    private static ArrayList payees;
    static {
        payees = new ArrayList();
        payees.add(new Payee(100, "John Smith",
                "AC000245", 1000.0));
        payees.add(new Payee(101, "Craig Willis",
                "AC000255", 1200.0));
        payees.add(new Staff(102, "Derek White",
                "AC000257", 900.0, 100));
        payees.add(new Staff(103, "Pam Richards", "AC000258",
                1000.0, 200.0));
        payees.add(new Staff(104, "Edward Smith", "AC000259",
                1100.0, 100.0));

    }

    public static ArrayList getPayees() {
        return payees;
    }
}

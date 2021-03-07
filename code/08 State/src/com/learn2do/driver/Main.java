package com.learn2do.driver;

import com.learn2do.calc.StatefulCalculator;
import com.learn2do.calc.StatelessCalculator;

public class Main {

    public static void main(String[] args) {
        StatefulCalculator calc = new StatefulCalculator();
        calc.setAccumulator(0);
        calc.add(5);
        System.out.println(calc.getAccumulator());
        calc.setAccumulator(1);
        calc.divide(3);
        System.out.println(calc.getAccumulator());


//        StatelessCalculator calc = new StatelessCalculator();
//        double result = calc.add(2,3);
//        System.out.println("Adding 3 to 2 results in " + result);
//        result = calc.subtract(2,3);
//        System.out.println("Subtracting 3 from 2 results in " + result);
//        result = calc.multiply(2,3);
//        System.out.println("multiplying 1 with 3 results in " + result);
//        result = calc.divide(2,0);
//        System.out.println("dividing 2 by 0 results in " + result);
    }
}

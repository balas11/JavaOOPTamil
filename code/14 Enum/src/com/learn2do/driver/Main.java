package com.learn2do.driver;


import com.learn2do.enums.BetterCurrency;
import com.learn2do.enums.Currency;
import com.learn2do.enums.GameSymbol;

public class Main {

    public static void main(String[] args) {
        GameSymbol s1 = GameSymbol.ROCK;
        System.out.println(s1.canWin(GameSymbol.PAPER));

//        for (BetterCurrency c : BetterCurrency.values()) {
//            System.out.println(c);
//            System.out.println(c.name() + " at " + c.ordinal());
//            System.out.println("--------------------------------");
//        }
//
//        BetterCurrency c1 = BetterCurrency.valueOf("EURO");
//        System.out.println(c1.getAbbr());


//        for (Currency c : Currency.values()) {
//            System.out.println(c);
//            System.out.println(c.name() + " at " + c.ordinal());
//            System.out.println("--------------------------------");
//        }
//
//        Currency c1 = Currency.valueOf("EURO");
//        System.out.println(c1.ordinal());
//        c1.ordinal();
    }
}

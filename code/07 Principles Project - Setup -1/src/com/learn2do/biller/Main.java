package com.learn2do.biller;

import com.learn2do.core.Catalog;
import com.learn2do.core.Product;
import com.learn2do.core.ShoppingBasket;

public class Main {

    public static void main(String[] args) {
	    Catalog catalog = Catalog.getInstance();
		//add Items
		ShoppingBasket basket = new ShoppingBasket();
	    double amount = basket.addItem(100, 5);
	    System.out.println(amount);
		amount = basket.addItem(101, 2);
		System.out.println(amount);
		amount = basket.addItem(102, 3);
		System.out.println(amount);

    }
}

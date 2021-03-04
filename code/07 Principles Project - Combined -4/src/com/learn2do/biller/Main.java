package com.learn2do.biller;

import com.learn2do.core.Catalog;
import com.learn2do.core.Product;
import com.learn2do.core.ShoppingBasket;

public class Main {

    public static void main(String[] args) {
	    Catalog catalog = Catalog.getInstance();
		//add Items
		ShoppingBasket basket = new ShoppingBasket();
		basket.addItem(100, 5);
	    double amount = basket.getTotalAmount();
	    System.out.println(amount);
		basket.addItem(101, 2);
		amount = basket.getTotalAmount();
		System.out.println(amount);
		basket.addItem(102, 3);
		amount = basket.getTotalAmount();
		System.out.println(amount);

		basket.checkOut();

		System.out.println("Total    : " + basket.getTotalAmount());
		System.out.println("discount : " + basket.getDiscountAmount());
		System.out.println("Net : " + basket.getAmountPayable());

    }
}

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

		//Discount making
		int quantity = basket.getTotalQuantity();
		if (quantity < 5) basket.setDiscountPercent(0);
		else if (quantity < 10) basket.setDiscountPercent(5.0);
		else basket.setDiscountPercent(10.0);

		//calculate discount

		double discount = amount * basket.getDiscountPercent()/100.0;
		double payable = amount - discount;
		basket.setDiscountAmount(discount);
		basket.setAmountPayable(payable);

		System.out.println("Total    : " + basket.getTotalAmount());
		System.out.println("discount : " + basket.getDiscountAmount());
		System.out.println("Net : " + basket.getAmountPayable());

    }
}

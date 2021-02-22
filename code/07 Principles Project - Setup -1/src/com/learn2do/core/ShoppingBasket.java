package com.learn2do.core;

import java.util.ArrayList;

public class ShoppingBasket {
    private ArrayList lineItems;
    private double totalAmount;

    public ShoppingBasket() {
        this.lineItems = new ArrayList();
    }

    public double addItem(int code, int quantity) {
        Product product = Catalog.getInstance().findProduct(code);
        LineItem lineItem = new LineItem(product, quantity);
        lineItems.add(lineItem);
        this.totalAmount += lineItem.getLinePrice();
        return this.totalAmount;
    }

}

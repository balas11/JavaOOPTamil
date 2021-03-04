package com.learn2do.core;

import java.util.ArrayList;

public class ShoppingBasket {
    private ArrayList lineItems;
    private double totalAmount;
    private int totalQuantity;
    private double discountPercent;
    private double discountAmount;
    private double amountPayable;

    public ShoppingBasket() {
        this.lineItems = new ArrayList();
    }

    public void addItem(int code, int quantity) {
        Product product = Catalog.getInstance().findProduct(code);
        LineItem lineItem = new LineItem(product, quantity);
        lineItems.add(lineItem);
        this.totalAmount += lineItem.getLinePrice();
        this.totalQuantity += quantity;
//        return this.totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    private void calculateDiscountPercent() {
        int quantity = this.totalQuantity;
        if (quantity < 5) this.discountPercent = 0;
        else if (quantity < 10) this.discountPercent = 5.0;
        else this.discountPercent = 10.0;
    }

    private void calculateDiscountAmount() {
        this.discountAmount = this.totalAmount * this.discountPercent/100.0;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    private void calculateAmountPayable() {
        this.amountPayable = this.totalAmount - this.discountAmount;
    }

    public double getAmountPayable() {
        return amountPayable;
    }

    public void checkOut() {
        this.calculateDiscountPercent();
        this.calculateDiscountAmount();
        this.calculateAmountPayable();
    }
}

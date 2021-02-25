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

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setAmountPayable(double amountPayable) {
        this.amountPayable = amountPayable;
    }

    public double getAmountPayable() {
        return amountPayable;
    }
}

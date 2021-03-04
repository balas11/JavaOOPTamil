package com.learn2do.core;

import java.util.HashMap;

public class Catalog {

    private static Catalog instance = null;
    private HashMap products;

    private Catalog() {
        this.products = new HashMap();
        this.products.put(100,
                new Product(100, "Tooth Brush", 35.0));
        this.products.put(101,
                new Product(101, "Tooth Paste", 78.0));
        this.products.put(102,
                new Product(102, "Soap", 47.0));
    }

    public static Catalog getInstance() {
        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    public Product findProduct(int code) {
        return (Product)this.products.get(code);
    }
}

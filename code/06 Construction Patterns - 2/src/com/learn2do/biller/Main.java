package com.learn2do.biller;

import com.learn2do.core.Catalog;
import com.learn2do.core.Product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		Catalog catalog = Catalog.getInstance();
		Product p = catalog.findProduct(100);
		System.out.println(p.getName());

	}
}

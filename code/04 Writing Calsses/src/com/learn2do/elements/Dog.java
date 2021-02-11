package com.learn2do.elements;

public class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void play() {
        System.out.println(this.name + " is running...");
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return color;
    }
}

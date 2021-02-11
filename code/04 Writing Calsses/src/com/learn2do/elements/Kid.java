package com.learn2do.elements;

public class Kid {
    private String name;
    private int age;
    private Dog pet;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String whoAreYou() {
        return "I am " + this.name + " and I am " + this.age + " years old!";
    }

    public void setPet(Dog value) {
        this.pet = value;
    }

    public void play() {
        System.out.println(this.name + " is playing with " + this.pet.getName());
        this.pet.play();
    }

    public void playWith(Dog dog) {
        System.out.println(this.name + " is playing with " + dog.getName());
        dog.play();
    }

}

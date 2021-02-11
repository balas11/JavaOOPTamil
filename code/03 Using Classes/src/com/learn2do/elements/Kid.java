package com.learn2do.elements;

public class Kid {
    public String name;
    public int age;
    public Dog pet;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Kid() {

    }

    public Kid(String name, int age, Dog pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String whoAreYou() {
        return "I am " + this.name
                + " and I am " + this.age + " years old!";
    }

    public void play() {
        System.out.println(this.name + " playing with " + this.pet.getName());
        this.pet.play();
    }

    public void playWith(Dog dog) {
        System.out.println(this.name + " playing with " + dog.getName());
        dog.play();
    }

    public void setPet(Dog pet) {
        this.pet = pet;
    }
}

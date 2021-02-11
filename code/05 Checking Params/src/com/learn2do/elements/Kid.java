package com.learn2do.elements;

public class Kid {
    private String name;
    private int age;
    private Dog pet;

//    public Kid(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    public Kid(String name, int age) {
//        if (name != null) {
//            if (age >= 3 && age <= 12) {
//                this.name = name;
//                this.age = age;
//            } else {
//                throw new IllegalArgumentException("age must be between 3 and 12");
//            }
//        } else {
//            throw new IllegalArgumentException("name must not be null");
//        }
//    }

    public Kid(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        if (age < 3 || age > 12) {
            throw new IllegalArgumentException("age must be between 3 and 12");
        }
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

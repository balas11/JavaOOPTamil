package com.learn2do.driver;

import com.learn2do.elements.Dog;
import com.learn2do.elements.Kid;

public class Main {
    public static void main(String[] args) {

        Kid kid1 = new Kid();
        kid1.name = "Mike";
        kid1.age = 10;
        String info1 = kid1.whoAreYou();
        System.out.println(info1);

        Kid kid2 = new Kid("Dave", 8);
        String info2 = kid2.whoAreYou();
        System.out.println(info2);

        Dog dog1 = new Dog("Ming", "Brown");
        Dog dog2 = new Dog("Dancer", "White");

        kid1.pet = dog1;
        kid2.setPet(dog2);

        kid1.play();
        kid2.play();

        kid2.playWith(dog1);

        Dog dog3 = new Dog("Tiger", "Gold");
        Kid kid3 = new Kid("Tanya", 9, dog3);
        kid3.play();

    }
}

package com.learn2do.driver;

import com.learn2do.elements.Dog;
import com.learn2do.elements.Kid;

public class Main {

    public static void main(String[] args) {
        Kid kid1 = new Kid("Mike", 4);
        String info1 = kid1.whoAreYou();
        System.out.println(info1);

        Kid kid2 = new Kid("Dave", 8);
        String info2 = kid2.whoAreYou();
        System.out.println(info2);

        Dog dog1 = new Dog("Ming", "Brown");
        Dog dog2 = new Dog("Dancer", "White");

        kid1.setPet(dog1);
        kid2.setPet(dog2);

        kid1.play();
        kid2.play();

        kid2.playWith(dog1);
    }

}

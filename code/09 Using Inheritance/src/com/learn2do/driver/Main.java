package com.learn2do.driver;

import com.learn2do.elements.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("David", 27);
        System.out.println(p);

        ArrayList persons = new ArrayList();
        persons.add(new Person("Mike", 29));
        persons.add(new Person("David", 27));
        persons.add(new Person("Tanya", 26));

        System.out.println(persons.contains(p));

    }
}



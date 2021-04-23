package com.learn2do.club;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private final String name;
    private final int age;

    public static final Comparator<Person> NAME_COMPARER =
            new Comparator<Person>(){
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static final Comparator<Person> AGE_COMPARER =
            new Comparator<Person> () {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + name + ", " + age + '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}





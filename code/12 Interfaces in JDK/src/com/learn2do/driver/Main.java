package com.learn2do.driver;

import com.learn2do.club.Club;
import com.learn2do.club.Person;

import java.util.Arrays;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        Club club = new Club(4);
        club.enroll(new Person("Mike", 10));
        club.enroll(new Person("Dave", 8));
        club.enroll(new Person("Tanya", 9));
        club.enroll(new Person("Phil", 11));
        System.out.println(club.getSize());
        Enumeration<Person> enumerator = club.getElements();
        while (enumerator.hasMoreElements()) {
            System.out.println(enumerator.nextElement());
        }

//        while (club.hasMoreElements()) {
//            System.out.println(club.nextElement());
//        }
//        Person[] persons = {
//                new Person("Mike", 10),
//                new Person("Dave", 8),
//                new Person("Tanya", 9),
//                new Person("Phil", 11),
//                new Person("Kate", 7)
//        };
//        Arrays.sort(persons, Person.AGE_COMPARER);
////        Arrays.sort(persons);
//
//        for(int i =0; i < persons.length; i++) {
//            System.out.println(persons[i]);
//        }

    }
}

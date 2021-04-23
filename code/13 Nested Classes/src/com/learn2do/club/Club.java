package com.learn2do.club;

import java.util.Enumeration;

public class Club
//        implements Enumeration<Person>
{
    private int maxMember;
    private int count;
    private Person[] members;

    public Club(int maxMember) {
        this.maxMember = maxMember;
        this.count = 0;
        this.members = new Person[maxMember];
    }

    public void enroll(Person person) {
        if (count == maxMember) {
            throw new IllegalStateException("Club is full already");
        }
        members[count] = person;
        count++;
    }
    public int getSize() {
        return this.count;
    }

    public int getMaxMember() {
        return this.maxMember;
    }

    public Person[] getMembers() {
        return this.members;
    }

    public Enumeration<Person> getElements() {

        return new Enumeration<Person>(){
            private int enumIndex;

            @Override
            public boolean hasMoreElements() {
                return this.enumIndex < count;
            }

            @Override
            public Person nextElement() {
                this.enumIndex++;
                return members[this.enumIndex-1];
            }
        };
    }

}




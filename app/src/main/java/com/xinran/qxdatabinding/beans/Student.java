package com.xinran.qxdatabinding.beans;

/**
 * Created by houqixin on 17/2/14.
 */
public class Student {
    private  final String name;
    private  final String firstName;
    private  final int age;

    public Student(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}

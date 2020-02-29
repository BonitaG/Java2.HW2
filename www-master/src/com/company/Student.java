package com.company;

public class Student extends Person implements Printable {

    private int course;

    public Student(int age, String name, int course) {
        super(age, name);
        this.course = course;

    }

    public Student(int age, String name) {
        super(age, name);
    }

    @Override
    public void print() {
        System.out.println(" Age " + getAge() + " Name" + getName() +
                "  Class " + class);
    }
}



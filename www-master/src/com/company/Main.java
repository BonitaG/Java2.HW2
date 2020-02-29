package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Student").print();
        createObject("Teacher").print();
        createObject("Doctor").print();


    }
    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Person":
                printable = (Printable) new Person(24, "Ian");
                break;
            case "Student":
                printable = new Student(27, "John", 3);
                break;
            case "Teacher":
                printable = new Teacher(28, "Anna", 5, "English");

                break;
            case "Doctor":
                printable = new Doctor(31, "Adam", "Dentist");
                break;
        }
        return printable;
    }
}
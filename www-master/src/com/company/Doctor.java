package com.company;

public class Doctor extends Person implements Printable {
    private String profession;

    public Doctor(int age,String name) {
        super(age, name);

    }

    public Doctor(int age, String name, String profession) {
        super(age, name);
        this.profession = profession;



    }



    @Override
    public void print() {
    System.out.println(" age " + getAge() +
            " Name" +getName()+
            "  Profession " +profession);
    }
}

package com.company.day2;

public class Person6 {
   private String name;
    private int age;

    public Person6(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person6{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

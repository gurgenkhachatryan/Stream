package com.company.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonTest6 {
    public static void main(String[] args) {

        Person6 sara=new Person6("Sara",4);
        Person6 viktor=new Person6("Viktor",40);
        Person6 eva=new Person6("Eva",42);
        Person6 anna=new Person6("Anna",5);
        List<Person6> list=new ArrayList<>();
        list.add(sara);
        list.add(viktor);
        list.add(eva);
        list.add(anna);
List<String> per=list.stream()
        .filter((person)->person.getAge()<18)
        .map((name)->name.getName())
        .collect(Collectors.toList());
        System.out.println(per);
    }
}

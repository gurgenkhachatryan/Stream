package com.company.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NationalityTest8 {
    public static void main(String[] args) {
        Nationality8 person1=new Nationality8("Sara",4,"Norwegian");
        Nationality8 person2=new Nationality8("Viktor",40,"Serbia");
        Nationality8 person3=new Nationality8("Eva",42,"Norwegian");
        Nationality8 person4=new Nationality8("Armen",5,"Serbia");

        List<Nationality8> list=new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        Map<String,List<Nationality8>> hashmap=
        list.stream().collect(Collectors.groupingBy(person-> person.getNationality()));
        System.out.println(hashmap);

    }
}

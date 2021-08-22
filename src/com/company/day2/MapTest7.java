package com.company.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest7 {
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
        Map<Boolean,List<Person6>> hashMap=
        list.stream().collect(Collectors.partitioningBy(person->person.getAge()>18));
        System.out.println(hashMap.toString());
    }
}

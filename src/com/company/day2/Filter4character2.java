package com.company.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter4character2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("My");
        arrayList.add("Name");
        arrayList.add("is");
        arrayList.add("Jhon");
        arrayList.add("Doe");
        System.out.println(arrayList);


        List<String> list= arrayList.stream()
        .filter(name->(name.length()!=4))
                .collect(Collectors.toList());
        System.out.println(list);

    }
}

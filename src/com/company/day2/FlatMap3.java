package com.company.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap3 {
    public static void main(String[] args) {
       List<String> list1=new ArrayList<>(Arrays.asList("aaaa","xxxx","zzzz"));
        List<String> list2=new ArrayList<>(Arrays.asList("bbbb","yyyy","kkkk"));
        List<List<String>> newlist=new ArrayList<>();
        newlist.add(list1);
        newlist.add(list2);
       List<String> al= newlist.stream()
                .flatMap(str->str.stream())
                .collect(Collectors.toList());
        System.out.println(al);
    }
}

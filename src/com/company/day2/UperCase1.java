package com.company.day2;

import java.util.*;
import java.util.stream.Collectors;

public class UperCase1 {
    public static void main(String[] args) {

        List<String> colection=new ArrayList<>();
        colection.add("Valod");
        colection.add("Armen");
        colection.add("Karen");

        Set<String> expected=colection.stream()
                .map(name->name.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(expected);
    }
}

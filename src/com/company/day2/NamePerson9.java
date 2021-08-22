package com.company.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NamePerson9 {
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
       // list.stream().collect(Collections.)
        int size= list.size();
        System.out.print('"');
        System.out.print("Name:");
        list.stream()
                .map(name->name.getName())
                .limit(size-1)
                .forEach(o-> System.out.print(o+","));


        System.out.println('"');
    }
}

package com.company.day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestPersonTest4 {
    public static void main(String[] args) {
        OldestPerson4 person1 = new OldestPerson4("Armen", "Armenyan", 18);
        OldestPerson4 person2 = new OldestPerson4("Karen", "Karenyan", 88);
        OldestPerson4 person3 = new OldestPerson4("Vazgen", "Vazgenyan", 55);
        List<OldestPerson4> list=new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
                OldestPerson4 max= list.stream()
                .max((o1, o2) ->
                    o1.getAge()-o2.getAge()).get();

        System.out.println(max.getAge());


    }
}
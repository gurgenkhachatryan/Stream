package com.company.day2;

import java.util.ArrayList;
import java.util.List;

public class SumAllPersonTest5 {
    public static void main(String[] args) {
        OldestPerson4 person1 = new OldestPerson4("Armen", "Armenyan", 18);
        OldestPerson4 person2 = new OldestPerson4("Karen", "Karenyan", 88);
        OldestPerson4 person3 = new OldestPerson4("Vazgen", "Vazgenyan", 55);
        List<OldestPerson4> list=new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
      Integer i= list.stream()
               .map(OldestPerson4->OldestPerson4.getAge())
                .reduce((sum,age)-> sum+ age).get();
        System.out.println(i);
    }
}

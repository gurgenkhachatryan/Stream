package com.company.day1.Tnayin;

import java.util.ArrayList;
import java.util.Random;

public class OddOrEven {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            arrayList.add(random.nextInt(20));
        }
        System.out.println(arrayList);

        arrayList.forEach(number->
        {
            if(number%2==0)
                System.out.println(number + " is a Even");
            else
                System.out.println(number + " is a odd");
        });
    }


}

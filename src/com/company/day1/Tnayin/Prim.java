package com.company.day1.Tnayin;

import java.util.ArrayList;
import java.util.Random;

public class Prim {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber=2+ random.nextInt(20);
            arrayList.add(randomNumber);
        }
        System.out.println(arrayList);
    //      boolean flag=false;
       arrayList.forEach(number->
        {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                {System.out.println(number + " is not prim");
                    break;
                }
                System.out.println(number +"is a prim");
            }

        });


    }
}

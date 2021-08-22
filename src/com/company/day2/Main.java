package com.company.day2;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
   // static  int sum=0;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();

        int randomNumber;
        for (int i = 0; i < 5; i++) {

            arrayList.add(randomNumber=random.nextInt(20));
        }
        System.out.println(arrayList);
        Stream<Integer> stream=arrayList.stream();
        Optional<Integer> gumar=stream.reduce((sum,number)->sum+=number);
        System.out.println("sum=" + gumar.get());

   /*     Integer intgumar=stream.reduce((sum,number)->sum+=number).get();
        System.out.println(intgumar);  //// kamel senc nuynna//*/

        Optional<Integer> evenGumar=arrayList.stream()
                .filter(number->number%2==0)
                .reduce((sum,number)->sum+=number);
        System.out.println("evenGumar="+evenGumar.get());


        Optional<Integer> oddGumar=arrayList.stream()
                .filter(number->number%2==1)
                .reduce((sum,number)->sum+=number);
        System.out.println("oddGumar=" + oddGumar.get());

    }
}

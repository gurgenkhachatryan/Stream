package com.company.day1.Gorc;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Gorc {
    static int sum = 0;
    static  int min=100;
    static int max=0;
    static int count=0;
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            arrayList.add(i);
        }
        arrayList.forEach((number) -> System.out.print(number + " "));
        System.out.println();
        arrayList.forEach(number -> {
            sum += number;
        });
        System.out.println("sum="+sum);
        Random random = new Random();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            arrayList1.add(randomNumber);
        }
        System.out.println(arrayList1);

        arrayList1.forEach(number->
        {
            if(number<min)
             min=number;
            if(number>max)
                max=number;
        });

        System.out.println("min="+min);
        System.out.println("max=" + max);
arrayList1.forEach(number->{
    sum+=number;
    count++;
});
        System.out.println("sum=" + sum);
        System.out.println("count=" + count);
double avg=sum/count;
        System.out.println("avg=" + avg);
    }
}


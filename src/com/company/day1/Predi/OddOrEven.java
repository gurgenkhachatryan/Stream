package com.company.day1.Predi;

import java.util.function.Predicate;

public class OddOrEven {
    static int number = 15;

    public static void main(String[] args) {

        Predicate<Integer> pred = (number -> (number % 2 == 0));
        {

           // System.out.println("is a even");

            System.out.println(pred.test(488));
        }
       // number->(number%2==0);
    }
}
package com.company.day1.Gorc;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            arrayList.add(i);
        }
        var par = new Object() {
            int sum = 0;
            int count = 0;
            int middle = 0;
        };
          arrayList.forEach((n)-> System.out.print(n+" "));
        arrayList.forEach((n) -> {
            par.count++;
            par.sum += n;

        });
        System.out.println();
        System.out.println(par.count);
        System.out.println(par.sum);
        System.out.println(par.sum/ par.count);
    }
}


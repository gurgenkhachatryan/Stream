package com.company.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductTest10 {
    public static void main(String[] args) {

        Product10 product1 = new Product10(1, "girq1", "books", 500.5);
        Product10 product2 = new Product10(2, "grich", "pen", 500.5);
        Product10 product3 = new Product10(3, "xaxaliq2", "toys", 1000.0);
        Product10 product4 = new Product10(4, "girq2", "books", 550.5);
        Product10 product5 = new Product10(4, "girq2", "books", 50.5);
        Product10 product6 = new Product10(5, "xaxaliq1", "toys", 500.0);

        ArrayList<Product10> al = new ArrayList<>();
        al.add(product1);
        al.add(product2);
        al.add(product3);
        al.add(product4);
        al.add(product5);
        al.add(product6);
        List<Product10> list = al.stream()
                .filter(o -> (o.getCategory().equals("books") && o.getPrice() > 100))
                .collect(Collectors.toList());
        System.out.println(list);

///////////////////   12      ///////////


        List<Product10> pro = al.stream()
                .filter(o -> (o.getCategory().equals("toys")))
          //         .map(x-> { return x.setPrice(12.0);
            //       })
                .collect(Collectors.toList());
        System.out.println(pro);


    }
}


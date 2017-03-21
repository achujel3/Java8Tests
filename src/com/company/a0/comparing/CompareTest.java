package com.company.a0.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {

    public static void main(String[] args) {

        Integer[] numbers = {6, 7, 2, 1, 5};
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(5);
        integers.add(6);
        integers.add(2);
        integers.add(1);
        integers.add(10);

        System.out.println(integers);

        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
                return t1.compareTo(t);
            }
        });

        System.out.println(integers);


    }

}

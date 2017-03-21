package com.company.a3.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("List of all the integers: ");
        eval(integers, n -> true);

        System.out.println("List of all the integers that are more than 3: ");
        eval(integers, n -> n > 3);

        System.out.println("Print only even integers: ");
        eval(integers, n -> n%2 == 0);

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {

        for (Integer n : list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }

    }

}

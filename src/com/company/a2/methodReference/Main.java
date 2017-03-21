package com.company.a2.methodReference;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Integer sumOfTheNumbers = 0;

    public static void main(String[] args) {

        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);
        numbers.add(12);
        numbers.add(0);
        numbers.add(8);

        numbers.forEach(Main::addingNumbers);

    }

    public static void addingNumbers(Integer number) {
        System.out.print(number + " + " + sumOfTheNumbers + " = ");
        sumOfTheNumbers += number;
        System.out.println(sumOfTheNumbers);
    }
}

package com.company.a8.newDate.time.api.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {

    public static void main(String[] args) {

        ChronoUnitTest chronoUnitTest = new ChronoUnitTest();
        chronoUnitTest.testChronoUnit();

    }

    public void testChronoUnit(){

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);

    }

}

package com.company.a8.newDate.time.api.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {

    public static void main(String[] args) {

        TemporalAdjustersTest temporalAdjustersTest = new TemporalAdjustersTest();
        temporalAdjustersTest.testAdjusters();

    }

    public void testAdjusters() {

        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on: " + nextTuesday);

        LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on: " + secondSaturday);

    }

}

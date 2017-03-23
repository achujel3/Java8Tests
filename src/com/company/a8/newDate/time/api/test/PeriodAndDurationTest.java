package com.company.a8.newDate.time.api.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationTest {

    public static void main(String[] args) {

        PeriodAndDurationTest periodAndDurationTest = new PeriodAndDurationTest();
        periodAndDurationTest.testPeriod();
        periodAndDurationTest.testDuration();

    }

    public void testPeriod() {

        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + date2);

        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);

    }

    public void testDuration() {

        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofHours(3);

        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time1, time2);

        System.out.println("Duration: " + duration);

    }

}

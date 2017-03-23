package com.company.a8.newDate.time.api.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BackwardCompatibilityTest {

    public static void main(String[] args) {

        BackwardCompatibilityTest backwardCompatibilityTest = new BackwardCompatibilityTest();
        backwardCompatibilityTest.testBackwardCompatibility();

    }

    public void testBackwardCompatibility() {

        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("Zoned date: " + zonedDateTime);

    }

}

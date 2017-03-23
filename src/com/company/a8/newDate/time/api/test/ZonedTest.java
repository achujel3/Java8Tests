package com.company.a8.newDate.time.api.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTest {

    public static void main(String[] args) {

        ZonedTest zonedTest = new ZonedTest();
        zonedTest.testZonedDateTime();

    }

    public void testZonedDateTime() {

        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:30+05:30[Asia/Karachi]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);


    }

}

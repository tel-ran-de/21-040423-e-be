package de.telran.khakov.rustam.classworks.cw25;

import java.time.*;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); // == LocalDate + LocalTime
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        System.out.println(localDateTime);
        System.out.println(time);
        System.out.println(localDateTime.atZone(ZoneId.of("UTC")));
        System.out.println(localDateTime.atOffset(ZoneOffset.of("+0300")));
    }
}

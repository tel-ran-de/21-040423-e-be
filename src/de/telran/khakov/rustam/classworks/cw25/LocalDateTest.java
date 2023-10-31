package de.telran.khakov.rustam.classworks.cw25;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDate.getMonth().getValue());
        LocalDate createdDate = LocalDate.of(2023, Month.OCTOBER, 24);
        System.out.println(createdDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(createdDate.format(formatter));
        localDate = localDate.plus(3, ChronoUnit.DECADES);
        localDate.minus(Period.ofDays(3));
        System.out.println(Period.ofDays(3));
    }
}

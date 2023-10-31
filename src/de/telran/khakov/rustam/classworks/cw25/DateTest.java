package de.telran.khakov.rustam.classworks.cw25;

import java.time.ZoneId;
import java.util.*;

public class DateTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CHINESE);
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        Date date = new Date(1698170390051L); // 19:59:00

        System.out.println(date);
        System.out.println(new Date(Long.MAX_VALUE));
        Date exactDate = new Date(123,9, 24); // 00:00:00
        System.out.println(exactDate.before(date));
        System.out.println(exactDate.after(date));
        System.out.println(TimeZone.getDefault().getDisplayName());

        //TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("UTC")));
        //System.out.println(TimeZone.getDefault().getDisplayName());
        System.out.println(exactDate);
        exactDate.setTime(1698170390051L);
        System.out.println(exactDate);
        System.out.println(exactDate.equals(date));
        Calendar cestCalendar = new GregorianCalendar();
        Calendar utcCal = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("UTC")), Locale.ENGLISH);
        //System.out.println(utcCal);
        System.out.println(utcCal.get(Calendar.DAY_OF_YEAR));
        System.out.println(utcCal.get(Calendar.WEEK_OF_MONTH));
        System.out.println(utcCal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cestCalendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(cestCalendar.get(Calendar.AUGUST));
        System.out.println(utcCal.get(Calendar.DAY_OF_MONTH));
        cestCalendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(cestCalendar.get(Calendar.DAY_OF_MONTH));
        //System.out.println(cestCalendar);
        System.out.println(cestCalendar.getFirstDayOfWeek());

    }
}

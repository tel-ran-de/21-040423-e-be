package de.telran.khakov.rustam.classworks.cw16;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Doctor {

    public static final int MINUTES_IN_HOUR = 60;

    public static void main(String[] args) {
        //Используя одну из коллекций, напишите программу «Очередь к врачу». Пациенты могут бронировать любой временной
        // слот (например, 1 - 9:00, 2 - 9:30, 3 - 10:00 и т.д.) для приёма у доктора, при этом указывая в записи своё имя.
        // В день приёма программа должна выводить врачу имя следующего пациента строго в порядке номера временного слота.
        Map<Integer, String> map = new TreeMap<>();
        map.put(570, "Client 2");
        map.put(540, "Client 1");
        map.put(575, "Client 3");
        map.put(510, "Client 0");

        String time = "9:45";
        String[] split = time.split(":");
        int hours = Integer.valueOf(split[0]);
        int minutes = Integer.valueOf(split[1]);
        System.out.println(hours * MINUTES_IN_HOUR + minutes);

        for (String value : map.values()) {
            System.out.println(value);
        }

        Set<Order> patients = new TreeSet<>();
    }
}

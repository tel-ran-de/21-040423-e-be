package de.telran.khakov.rustam.homeworks.homework3;

import java.util.Random;

public class DayOfWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        System.out.println(detector.detectDayName(new Random().nextInt(1, 8)));
    }
}

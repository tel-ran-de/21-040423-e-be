package de.telran.khakov.rustam.homeworks.homework6;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(average(list));

    }

    private static double average(List<Integer> list) {
        double sum = 0; // int -> double
        for (Integer val : list) {// {3,4,4}  11 /3 -> 3   (3)
            sum += val;
        }
        return sum / list.size(); // double 11 /3 -> 3.75
    }
}

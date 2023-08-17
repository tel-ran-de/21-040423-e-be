package de.telran.khakov.rustam.classworks.cw7;

import java.util.*;

public class CollectionForEach {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(14);
        numbers.add(19);
        numbers.add(24);
        for (int i = 0; i < numbers.size(); i++) {

        }
        for (Integer number : numbers) {

        }

        Vector<Integer> vector = new Vector<>();
        vector.add(14);
        vector.add(9);
        vector.add(5);
        Enumeration<Integer> elements = vector.elements();
        elements.nextElement();
        elements.hasMoreElements();
        for (Integer integer : vector) {
            System.out.println(integer);
        }
    }
}

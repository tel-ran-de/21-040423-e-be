package de.telran.khakov.rustam.classworks.cw10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> strings = new LinkedHashSet<>(); // связное множество которое использует хэш
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("last");
        strings.add("change");
        strings.add("first");
        System.out.println(strings);
        HashSet<Integer> set = new HashSet<>();

    }
}

package de.telran.khakov.rustam.classworks.cw16;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] arr = new String[]{"",",",""};
        List<String> strs = new ArrayList<>();
        Collections.addAll(strs, arr);
                //List.of(arr);
        test();
        test(".","test");
        test(arr);
        Queue<String> queue = new PriorityQueue<>(List.of("B", "A", "C", "B", "A", "C"));
        System.out.println(queue);
        //System.out.println(new SortedSet<Integer>(3));

    }


    private static void test(String... args) {

    }
}


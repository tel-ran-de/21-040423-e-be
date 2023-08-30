package de.telran.khakov.rustam.classworks.cw10;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        Integer[] array = {3, 4, 12, 6, 3, 2};
        List<Integer> list = List.of(3, 4, 12, 6, 3, 2);// Unmodifable collection
        //generateList();// LinkedList/ ArrayList/ another List impl
        list.get(2);
        //list.remove(3);
        List<Integer> var = new ArrayList<>();
        var.addAll(list);
        var.addAll(list);
        System.out.println(list);
        System.out.println(var);
        //[3, 4, 12, 6, 3, 2, 3, 4, 12, 6, 3, 2]
        Arrays.asList(array); // new ArrayList<Integer>();

    }


    public static List<Integer> generateList() {
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0) {
            return List.of(3, 4, 12, 6, 3, 2);
        } else if (i == 1) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(4);
            list.add(5);
            return list;
        } else {
            List<Integer> list = new LinkedList<>();
            list.add(3);
            list.add(4);
            list.add(5);
            return list;
        }
    }
}

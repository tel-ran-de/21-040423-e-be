package de.telran.khakov.rustam.classworks.cw6;

import java.util.*;

public class ArrayListScenario {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // Integer[] array = new Integer[10];
        List<Integer> list2 = new LinkedList<>(); // Integer[] array = new Integer[10];
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(9);
        list.set(4, 6);
        //fill(list, 5);
        //Collections.fill(list, 5);
        System.out.println(list);
        removeAllMoreThanWithIterator(list, 5);
        System.out.println(list);
        // array[2];
    }

    public static void fill(List<Integer> list, int valToSet) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, valToSet);// array[i] = valToSet
        }
        //for (int i = 0; i < array.length; i++) {
        //     array[i] = valToSet
        //}
    }

    public static void removeAllMoreThan(List<Integer> list, int val) {
        List<Integer> copy = new ArrayList<>(list);// int[] copy = Arrays.copy(original);
        list.clear();
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) <= val) {
                list.add(copy.get(i));
                //list.remove((int)i);
            }
            // list.set(i, valToSet);// array[i] = valToSet
        }
    }

    public static void removeAllMoreThanWithIterator(List<Integer> list, int val) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int  current = iterator.next();
            if (current > val) {
                iterator.remove();
            }
        }
    }


    public static void removeAllMoreThanIncorrect(List<Integer> list, int val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > val) {
                list.remove((int) i);
            }
            // list.set(i, valToSet);// array[i] = valToSet
        }
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

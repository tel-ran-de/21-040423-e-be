package de.telran.khakov.rustam.classworks.cw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListScenario {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(9);
        //fill(list, 5);
        //Collections.fill(list, 5);
        System.out.println(list);
        removeAllMoreThan(list, 5);
        System.out.println(list);

    }

    public static void fill(List<Integer> list, int valToSet) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, valToSet);// array[i] = valToSet
        }
    }

    public static void removeAllMoreThan(List<Integer> list, int val) {
        List<Integer> copy = new ArrayList<>(list);
        list.clear();
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) <= val) {
               list.add(copy.get(i));
                //list.remove((int)i);
            }

           // list.set(i, valToSet);// array[i] = valToSet
        }
    }
}

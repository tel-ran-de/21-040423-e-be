package de.telran.khakov.rustam.classworks.cw6;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        //Integer[] array = new Integer[10];
        collection.add(4);
        System.out.println(collection.size());
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(59);
        collection.add(57);
        collection.add(98);
        collection.add(55);
        collection.add(65);
        System.out.println("sout start");

        for (Integer val : collection) {
            System.out.println(val);
        }
        System.out.println("sout end");


        Stack<Integer> stack = new Stack<>();
        stack.add(12);
        stack.add(13);
        stack.add(14);
        stack.add(15);
        stack.add(16);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(collection.size());
        //collection.remove(5);
        System.out.println(collection.size());
        //System.out.println(collection.get(4));
        System.out.println(collection);
    }
}

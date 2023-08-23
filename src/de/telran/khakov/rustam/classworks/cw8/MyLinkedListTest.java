package de.telran.khakov.rustam.classworks.cw8;

import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new MyLinkedList();
        System.out.println(linkedList.size());
        linkedList.add(8);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        linkedList.add(1, 6);
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains(null));
        System.out.println(linkedList.contains(5));
        System.out.println("set test--------");
        System.out.println(linkedList.set(2, 10));
        System.out.println("remove test--------");
        System.out.println(linkedList.remove(3));
        System.out.println("--------");
        for (Integer val : linkedList) {
            System.out.println(val);
        }
        System.out.println("-------- get test ---");
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(2));
        linkedList.remove(3);
        System.out.println("-------- iterate test ---");
        for (Integer val : linkedList) {
            System.out.println(val);
        }

    }
}

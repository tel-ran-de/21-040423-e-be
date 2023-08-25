package de.telran.khakov.rustam.classworks.cw9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list= new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 10 -> 15 -> 22 -> 33 -> ...      10500  -> 10 513 -> size = ~10 513
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);

        arrayList.add(4); arrayList.add(4); arrayList.add(4); arrayList.add(4); arrayList.add(4);
        arrayList.add(4); // добавлять не беспокоясь о размере, удалять с конца, доступ по индексу быстрый
        System.out.println(arrayList.size());

    }
}

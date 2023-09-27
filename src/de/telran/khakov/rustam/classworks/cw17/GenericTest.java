package de.telran.khakov.rustam.classworks.cw17;

import de.telran.khakov.rustam.classworks.cw7.Book;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); // Integer[] list = new Integer[10];
        list.add(1);
        list.add(10);
        list.add(14);
        //list.add("some string");
        int sum = 0;
        for (Integer o : list) {
            sum += o;
        }

        Arhive<String> stringArhive = new Arhive<>("any string", 10);
        System.out.println((String) stringArhive.arhivedType);
        System.out.println((String) stringArhive.getArhivedType());

        Arhive<Integer> intArhive = new Arhive<>(16, 10);
        System.out.println((Integer) intArhive.arhivedType);
        System.out.println((Integer) intArhive.getArhivedType());

        List list1 = new ArrayList();
        list1.add("13");
        list1.add(13);
        list1.add(new Book("",""));
        list1.add("13");

    }
}

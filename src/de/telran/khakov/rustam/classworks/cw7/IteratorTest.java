package de.telran.khakov.rustam.classworks.cw7;

import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);//
        list.add(5);
        list.add(10);
        list.add(8);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {// i < list.size();
            //logic
            Integer current = iterator.next();// current = list.get(i); i++;
            System.out.println(current);
        }
        System.out.println("------------------------------");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {// i < list.size();
            //logic
            Integer current = listIterator.next();// current = list.get(i); i++;
            System.out.println(current);
        }

        while (listIterator.hasPrevious()){
            Integer current = listIterator.previous();// current = list.get(i); i++;
            System.out.println(current);
        }

//        Spliterator<Integer> spliterator = list.spliterator();
//        spliterator.tryAdvance(System.out::println);

//        ListIterator<Integer> listIterator = list.listIterator();
//        listIterator.next();
//        listIterator.add(5);
//        listIterator.next();
//        listIterator.next();
//        listIterator.remove();
//        System.out.println(listIterator.previous());
//        System.out.println(listIterator.previous());
//        System.out.println(listIterator.previous());
//        System.out.println(list);


    }


    public int findFirstElemMoreThan5(List<Integer> list) {
//        Iterator<Integer> iterator = list.iterator();
//        Integer current = -1;
//        while (iterator.hasNext()) {// i < list.size();
//            current = iterator.next();
//            if (current > 5) {
//                return current;
//            }
//            //logic
//        }
//        return -1;

        for (Integer current : list) {
            if (current > 5) {
                return current;
            }
        }
        return -1;
    }
}

package de.telran.khakov.rustam.classworks.cw10;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", 2020));
        cats.add(new Cat("Барсик", 2020));
        cats.add(new Cat("Матроскин", 2020));
        cats.add(new Cat("Барсик", 2021));
        cats.add(new Cat("Барсик", 2022));
        cats.add(new Cat("Барсик", 2023));
        cats.add(new Cat("Кузя", 2020, 3));
        cats.add(new Cat("Барсик", 2020, 5));
        cats.get(0).compareTo(cats.get(1));
        // array[] = {2,4,6,3,1};
        // array[0] > array[1]
        // list.get(0) > list.get(1);  1 >, -1 <, 0 ==
        // equals = true/false
        //
        // Cloneable
        // Iterator Iterable
        // Comparable
        Comparator<Cat> howToSort = new WeightCatsComparator().reversed(); //
        Collections.sort(cats, howToSort);
        System.out.println(cats);

        Set<Cat> catsSet = new TreeSet<>(new CorrectFullCatComparator()); // TreeSet null restricted, sorted
        catsSet.addAll(cats);
        System.out.println(catsSet.size());
        //new Integer(1).compareTo(null);
    }
}

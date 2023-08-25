package de.telran.khakov.rustam.classworks.cw9;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(3);
        set.add(-1);
        set.add(2);
        set.add(6);
        set.add(2);
        set.add(6);
        System.out.println(set.headSet(3));// sortedSet
        System.out.println(set.tailSet(3));// sortedSet
        System.out.println(set.descendingSet());// NavigableSet
        System.out.println(set.lower(3));//элемент который меньше 3 NavigableSet
        System.out.println(set.floor(3));//элемент который меньше или равен 3 NavigableSet
        System.out.println(set.ceiling(2));//элемент который больше или равен 2 NavigableSet
        System.out.println(set.higher(2));//элемент который больше 2 NavigableSet
        System.out.println(set.first());// посмотрит и вернет
        System.out.println(set.pollFirst());// удалит и вернет
        System.out.println(set);


        Set<Paper> papers = new HashSet<>();
        papers.add(new Paper("",12,21)); //
        papers.add(new Paper("",12,21));
        papers.add(new Paper("",13,21));
        papers.add(new Paper("",13,21));
        papers.add(new Paper("",1,2));
        papers.add(new Paper("",2,1));
        papers.add(null);
        for (Paper paper : papers) {
            System.out.printf("%s - %d%n", paper, paper == null ? 0 : paper.hashCode());
        }
        System.out.println(papers.contains(new Paper("",2,1)));
        //Set<Paper> paper2 = new TreeSet<>();
       // paper2.add(new Paper());
        //[1,4,15,17,23,34,43,45,[56,67,77,88,98,109];
    }
}

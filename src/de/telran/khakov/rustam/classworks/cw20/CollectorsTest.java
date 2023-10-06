package de.telran.khakov.rustam.classworks.cw20;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsTest {

    public static void main(String[] args) {
        String[] array = new String[]{"first", "Sec", "Fourth", "third", "Fourth"};
        Set<String> res = Arrays.stream(array)
                .collect(Collectors.toSet());
        List<String> res2 = Arrays.stream(array)
                .collect(Collectors.toList());
        List<String> resList = Arrays.stream(array)
                .toList();
        System.out.println(res2.getClass());
        System.out.println(resList.getClass());
//        res2.add("Test");
//        resList.add("ter");
        List<String> res3 = Arrays.stream(array)
                .collect(Collectors.toCollection(LinkedList::new));
        String joined = Arrays.stream(array)
                .collect(Collectors.joining("|","<",">"));
        System.out.println(joined);//(first, Sec, third, Fourth)

        String joined2 = Arrays.stream(array)
                .collect(UnionStringCollector.joining("|", "(",")"));
        System.out.println(joined2);//(first, Sec, third, Fourth)
        Map<String, Integer> map = Arrays.stream(array)
                .collect(Collectors.toMap(str -> str, str -> 1, (f,s) -> f+s, ()->new TreeMap<>()));
        System.out.println(map);
        Map<Integer, Set<String>> groupedByLength = Arrays.stream(array)
                .collect(Collectors.groupingBy(str->str.length(), Collectors.toSet()));
        System.out.println(groupedByLength);

    }
}

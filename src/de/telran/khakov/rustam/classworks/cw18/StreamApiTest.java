package de.telran.khakov.rustam.classworks.cw18;

import java.util.ArrayList;
import java.util.List;

public class StreamApiTest {
    public static void main(String[] args) {
        List<Integer> sortedUniqueList = List.of(1,6,3,5,4,5,4,5,-1)
                .stream()
                .filter(elem-> elem>0)
                .distinct()
                .sorted((first, second) -> second - first)
                .skip(2)
                .limit(1)
                .toList();
        System.out.println(sortedUniqueList);


        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        int count = 0;
        for (Integer elem : integers) {
            if (elem > 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}

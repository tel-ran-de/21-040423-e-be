package de.telran.khakov.rustam.classworks.cw19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        // элементы + количество четных
        //int counter = 0;
        final Counter counter = new Counter();
        Phone[] nokias = List.of(1, 3, 5, 6, 3, 2, 4, 3, 5, 7, 0, 5, 4, 6)
                .stream()
                .filter(val -> val > 5)// func1
                .filter(val -> val * 2 - 10 > 0) //func2
                .map(in -> in * in)
                .map(in -> new Phone(in, "Nokia"))
                .peek(val -> System.out.println(val)) //func3
//                .peek(val -> {
//                    if (val.weight % 2 == 0) {
//                        counter.count++;
//                    }
//                })
                .distinct()// func4
                .sorted(Comparator.comparing(Phone::getWeight))
                .toArray(Phone[]::new);
//                .forEach(elem-> {
//                    System.out.println(elem);
//                    // add to some collection
//                }); // terminal operation
        System.out.println("----");
       // System.out.println(l);

        int[] array = IntStream.range(0, 100)
                .limit(25)
                .skip(10)
                .toArray();
        System.out.println(Arrays.toString(array));
    }


    static class Counter {
        int count;
    }

    public static int sum(int first, int sec) {
        return first + sec;
    }
}

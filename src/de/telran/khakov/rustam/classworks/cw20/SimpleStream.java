package de.telran.khakov.rustam.classworks.cw20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 3, 12, 5, 4, 3, 6, 9, 5, 3, 7};
        // sum -> 1 number
        int sum = Arrays.stream(array)
                .mapToInt(i -> i)
                .sum();

        int sum2 = Arrays.stream(array)
                .reduce(0, Integer::sum);
        // убрать дубликаты и отсортировать -> массив
        Integer[] res = Arrays.stream(array)
                .distinct()
                .sorted()
                .toArray(Integer[]::new);
        int[] res2 = Arrays.stream(array)
                .mapToInt(i -> i)
                .distinct()
                .sorted()
                .toArray();
        // оставить все что больше 9 -> массив
        Integer[] allMoreThan9 = Arrays.stream(array)
                .filter(v-> v>9)
                .toArray(Integer[]::new);
        // от 1 до 100 и распечатать
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
        IntStream.rangeClosed(1, 100)
                .forEach(System.out::println);
//        IntStream.generate(()->new Random().nextInt())
//                .forEach(System.out::println);
        Stream.iterate(1, i-> i <= 100, i -> i +2)
                .forEach(System.out::println);

        IntStatistic stat = Arrays.stream(array)
                .collect(new IntStatisticCollector());
        System.out.println(stat);
    }
}

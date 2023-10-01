package de.telran.khakov.rustam.classworks.cw19;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {
        List<String> strings = List.of("test", "test2", "test3", "random", "someVal", "exec_task", "listElem", "blackBerry");
        Map<String, Integer> collect = strings// someVal, exec_task, listElem, blackBerry
                .stream()
                .filter(v -> v.length() > 5)
                .map(str-> str + "after")
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(collect);
        List<Integer> list = List.of(1, 3, 5, 6, 3, 2, 4, 3, 5, 7, 0, 5, 4, 6);
        Optional<Integer> sum = list
                .stream()
                .reduce((accumulator, currentVal) -> accumulator + currentVal);
        Optional<Integer> maxElem = list.stream()
                .reduce(Math::max);
        Integer multiply = list
                .stream()
                .reduce(1, (accumulator, currentVal) -> accumulator * currentVal);
        sum.ifPresent(System.out::println);
        maxElem.ifPresent(System.out::println);
        System.out.println(multiply);

        strings.stream()
                .filter(v->v.length() >4)
                .max(Comparator.naturalOrder());


        Optional<String> first = strings.stream()
                .filter(v -> v.length() > 5)
                .findAny();
        first.ifPresent(System.out::println);

        boolean nonNegative = list.stream().allMatch(elem -> elem >= 0);
        long nullElements = list.stream().filter(Objects::isNull).count();
        Stream<Integer> integerStream = list.stream().filter(v -> v > 4).peek(System.out::println)
                .onClose(()-> System.out.println("stream is closed, you cannot reuse it"));
        IntSummaryStatistics statistics = integerStream.mapToInt(v -> v.intValue()).summaryStatistics();
        System.out.println(statistics);
        //long count = integerStream.count();
        integerStream.close();
        //long countOdd = integerStream.filter(v -> v % 2 == 0).count();
        System.out.println(nonNegative);

    }
}

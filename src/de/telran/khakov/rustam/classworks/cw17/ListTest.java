package de.telran.khakov.rustam.classworks.cw17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));

        list.forEach(printAllWithLengthEqualsTo(3));// взять лист и по каждому пройтись и распечатать все что имеет длину 3
        list.forEach(printAllWithLengthEqualsTo(4));
        list.forEach(printAllWithLengthEqualsTo(5));
        list.removeIf(str -> str.length() > 3);
        System.out.println();
        list.forEach(System.out::println);
    }

    private static Consumer<String> printAllWithLengthEqualsTo(int number) {
        return elem -> {
            if (elem.length() == number) {
                System.out.println(elem);
            }
        };
    }
}

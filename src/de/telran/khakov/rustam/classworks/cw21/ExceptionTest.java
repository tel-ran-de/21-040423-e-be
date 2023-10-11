package de.telran.khakov.rustam.classworks.cw21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExceptionTest {
    public static void main(String[] args) {
        //divideOnZero(0);
        int[] array = new int[3]; // 0, 1,2
        array[0] = 1;
        System.out.println(calcMedian(array)); // [1, 0, 0]

        int[] emptyArray = new int[0];
        double res = calcMedian(emptyArray);
        Stream<String> stream = Stream.of("test", "test2");
        List<String> resStr = stream.filter(str -> str.contains("2")).collect(Collectors.toList());
        //String[] arrayStr = stream.toArray(String[]::new);
        String generated = generate();
        generated.length();
        array[3] = 3;

    }

    private static String generate() {
        return null;
    }

    public static void divideOnZero(int param) {
        int res = 14 / param; //
    }

    public static double calcMedian(int[] array) {
        int howManyElem = array.length;
        if (howManyElem == 0) {
            return 0;
        }
        int sum = 0;
        for (int i : array) {
            sum += array[i];
        }
        return  sum / howManyElem;
    }

}

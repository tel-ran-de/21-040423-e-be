package de.telran.khakov.rustam.classworks.cw16;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {


    public static void main(String[] args) {
        Consumer<Object> printer = o -> {
            System.out.println("началась печать в " + System.currentTimeMillis());
            System.out.println(o);
        }; // new Consumer { public void consume(Object o){ sout(o)}
        int v = 1;// v = 1
        Func func = x -> x + 1; // f(x) = x+1
        // f = (x) -> x + 1;

        Func func1 = LambdaTest::increment;
        Func func2 = LambdaTest::decrement;

        int res = func1.apply(3);
        System.out.println(func.apply(3)); // f(3)
        System.out.println(func.apply(3)); // f(3)
        increment(3);
        //int res = func(1);
        System.out.println(comboFunc(func1, func2, 4));
        printer.accept(res);

        Function<Integer, Integer> customFunc = (Integer x) -> x * 3;//  (x) -> x * 3;     x -> x * 3;
        Comparator<String> stringComparator = (o1, o2) -> o1.length() - o2.length();//int compare(String o1, String o2);
        // String func(Integer, Long)
        Predicate<Integer> moreThan5 = x -> x > 5;
        System.out.println(moreThan5.test(6));
}

    static int comboFunc(Func func1, Func func2, int param) {
        if (param > 3) {
            return func1.apply(param);
        } else {
            return func2.apply(param);
        }
    }

    static int increment(int x) {
        return x + 1;
    }

    static int decrement(int x) {
        return x - 1;
    }

}

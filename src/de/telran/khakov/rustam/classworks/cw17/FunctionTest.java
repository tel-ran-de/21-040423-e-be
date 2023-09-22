package de.telran.khakov.rustam.classworks.cw17;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        //f(x) = { funcXplus3(x), if x < 3
        //       { x - 1, if x >=3
        Function<Integer, Integer> sum3 = x -> x + 3;// f(x) = x+3
        Function<Integer, Integer> minus1 = x -> x - 1;
        Function<Integer, Integer> comboFunc = x -> {
            if (x < 3) {
                return sum3.apply(x);
            } else {
                return minus1.apply(x);
            }
        };
        //Function.identity();
        // x * 3 +4 -6
        //comboFunc.andThen(add4()).andThen(minus6()).andThen()
        // comboFunc = x -> x<3 ? x+3 : x-1

        System.out.println(comboFunc.apply(5));// f(5)
        System.out.println(comboFunc.apply(-10));// f(-10)

    }
}

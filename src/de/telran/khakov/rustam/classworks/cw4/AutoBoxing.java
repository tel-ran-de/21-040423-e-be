package de.telran.khakov.rustam.classworks.cw4;

import de.telran.khakov.rustam.homeworks.homework2.zoo.Animal;

public class AutoBoxing {

    public static void main(String[] args) {
        int i = 1;
        Integer i2 = 1; // автоупаковка
        i = i2;// распаковка
        char c1 = 'u';
        Character c = c1;
        c1 = c;
        double d1 = 1; // восходящее преобразование 1 -> 1.0
        Double d = d1;  // int -> double -> Double
        long l = 1L;
        test(i2); // test(Integer) -> test(Number) -> test(Object) -unboxing> test(int) -> test(long)-> test(double)
        test(l); // test(long) -> test(double) -> test(Long)
    }


    public static void test(int i) {
        System.out.println(1);
    }
//    int -> long -> double
//    public static void test(double i) {
//        System.out.println(2);
//    }

    public static void test(Double i) {
        System.out.println(3);
    }

    public static void test(Long i) {
        System.out.println(4);
    }

    public static void test(Number i) {
        System.out.println(5);
    }
}

package de.telran;

public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;
    }

    public void complexTest(int first, int second) {
        int res = add(first, second);
        int mult = multiply(first, second);
        if (res % mult == 0) {
            if (minus(res, first) % 2 == 1) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
            System.out.println("test");
        } else {
            System.out.println("test 2");
        }

    }
}

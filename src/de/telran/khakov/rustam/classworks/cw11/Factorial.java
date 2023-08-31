package de.telran.khakov.rustam.classworks.cw11;

import java.util.Stack;

public class Factorial {

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n -1);
    }
    public static void main(String[] args) {
        Stack<Integer> factorialStack = new Stack<>();
        factorial(5);
        int n = 5;
        while (n > 0) {
            factorialStack.add(n);
            n--;
        }
        int res = 1;
        while (!factorialStack.empty()) {
            res *= factorialStack.pop();
        }
        System.out.println(res);
    }
}

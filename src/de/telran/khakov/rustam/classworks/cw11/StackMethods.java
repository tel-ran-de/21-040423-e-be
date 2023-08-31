package de.telran.khakov.rustam.classworks.cw11;

import java.util.List;
import java.util.Random;
import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Method> methods = new Stack<>();
        methods.push(new Method("main"));
        methods.push(new Method("add", List.of("value")));
        methods.push(new Method("contains", "boolean"));
        while (!methods.isEmpty()) {
            System.out.println(methods.pop());
        }

        Stack<Coin> coins = new Stack<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            coins.push(new Coin(random.nextInt(10)));
        }
        while (!coins.empty()) {
            Coin coin = coins.pop();
            // peek == get
            // pop = removeLast
            System.out.println(coin);
            if (coin.number > 5) {
                coins.push(new Coin(2));
            }
        }
    }
}

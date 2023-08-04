package de.telran.khakov.rustam.classworks.cw3;

import java.util.Scanner;
public class ColorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        Color color = Color.valueOf(value);
        System.out.println(color);
        Color a = Color.BLACK;
        int i = switch (a) {
            case GREEN-> 1;
            case BLUE -> 10;
            default -> 2;
        };
    }
}

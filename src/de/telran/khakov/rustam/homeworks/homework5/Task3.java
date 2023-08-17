package de.telran.khakov.rustam.homeworks.homework5;

import java.util.Random;

public class Task3 {
    //Найти максимальный элемент побочной диагонали (cлайд 14 поможет)
    //twoDimArray.length - i - 1 == j
    public static void main(String[] args) {
        int[][] twoDimArray = new int[10][10];
        fillWithRandom(twoDimArray);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < twoDimArray.length; i++) { // 10
            int tmpIndex = twoDimArray.length - i - 1;
            if (twoDimArray[i][tmpIndex] > max) {
                max = twoDimArray[i][tmpIndex];
            }
        }
        System.out.println(max);
        print(twoDimArray);
    }

    public static void fillWithRandom(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

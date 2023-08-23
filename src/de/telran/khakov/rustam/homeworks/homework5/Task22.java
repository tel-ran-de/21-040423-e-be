package de.telran.khakov.rustam.homeworks.homework5;

import de.telran.khakov.rustam.classworks.cw5.TwoDimArray;

import java.util.Random;

public class Task22 {

    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = random.nextInt(100);
                array2[i][j] = random.nextInt(100);
            }
        }

        int[][] res = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                res[i][j] = array1[i][j] + array2[i][j];
            }
        }

        TwoDimArray.print(array1);
        System.out.println("+");
        TwoDimArray.print(array2);
        System.out.println("=");
        TwoDimArray.print(res);
    }
}

package de.telran.khakov.rustam.classworks.cw5;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {6, 4, 7, 5, 2, 1, 8};
        for (int i = 0; i < array.length; i++) {
            int max = array[0];
            int maxIndex = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (max< array[j]) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            //swap
            int tmp = array[array.length - 1 - i];
            array[array.length - 1 - i] = max;
            array[maxIndex] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}

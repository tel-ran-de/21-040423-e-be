package de.telran.khakov.rustam.classworks.cw6;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
        int[] array = {3, 4, 6, 1, 7, 2, 6, 4, 3, 5, 2, 8, 9, 6, 0};
        Arrays.sort(array);
        Arrays.binarySearch( array, 5);
        int[] arr = Arrays.copyOf(array, array.length + 2);
        Arrays.fill(arr,  5, arr.length -1, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));

        int[] array2 = Arrays.copyOfRange(array, 5, 60);
        System.out.println(Arrays.toString(array2));
        System.out.println(array);
        System.out.println(array.length);
        array[5] = 14;

        for (int i = 0; i < array.length; i++) {
            array[i] = 5;
        }

        for (int i : array) {

        }

    }
}

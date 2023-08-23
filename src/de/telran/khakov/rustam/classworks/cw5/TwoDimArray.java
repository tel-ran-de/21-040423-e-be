package de.telran.khakov.rustam.classworks.cw5;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        String[][] twoDimArray = new String[10][10];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if ((i  + j) <= twoDimArray.length-1) { // i = 0  j = 9,, i = 1 j = 8 i =2 j = 7
                    twoDimArray[i][j] = "$";
                } else {
                    twoDimArray[i][j] = "*";
                }
            }
        }
        print(twoDimArray);
        //System.out.println(Arrays.toString(twoDimArray));
//        Object[] arr = new Object[3];
//        arr[0] = new int[3];
//        arr[1] = new int[6];
//        arr[2] = new int[5];
        int[] arr = new int[3];
        arr = Arrays.copyOf(arr, 4);
        // new ...
        // for
        // copy

        System.out.println(arr.length);
    }

    public static void print(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

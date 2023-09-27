package de.telran.khakov.rustam.classworks.cw18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericTest {

    public static void main(String[] args) {
        Table<String, Integer> table = new Table<>();
        table.tableInfo = "test";
        System.out.println(table.getTableInfo());
        System.out.println(table.getSize());
        System.out.println(table.getValue());
        boolean isString = table.getTableInfo() instanceof String;
        System.out.println(isString);
        Number number = 10;// Integer(10)
        Number[] numbers = new Integer[10]; // 8 byte
        ArrayList<? extends Number> dynamicArray2 = new ArrayList<Integer>();
        List<Number> dynamicArray = new ArrayList<>(); //
        dynamicArray.add(1);
        dynamicArray.add(1.0);
        dynamicArray.add(3f);
        System.out.println(dynamicArray);
        List<? extends Number> list = getSomeNumberArrayChild(2); // Producer extends
        // ArrayList<Integer>   ->  null
        // ArrayList<Double>    ->  null
        // ArrayList<Float>     ->  null
        // List<Number> - в который мы можем добавить все что угодно что является наследником Number
        list.add(null);// ArrayList<Integer> 1 -> Integer; ArrayList<Double> Integer !> Double
        for (Number number1 : list) {
            System.out.println(number1);
        }

        List<?> list3 = new ArrayList<Object>();

        List<? super Number> list2 = new ArrayList<Object>(); // Consumer super
        list2.add(1); //  ArrayList<Object>  -> int -> Integer -> Object
        list2.add(4.0);// ArrayList<Object>  -> double -> Double -> Object
        list2.add(5f); // ArrayList<Object>  -> float -> Float -> Object
        System.out.println(list2.get(0));
    }


    private static List<? extends Number> getSomeNumberArrayChild(int randomType) {
        if (randomType == 0) {
            return new ArrayList<Integer>(List.of(1, 2, 3));
        } else if (randomType == 1) {
            return new ArrayList<Double>(List.of(1.0, 2.3, 5.6));
        } else {
            return new ArrayList<Float>(List.of(4f, 8f, 19f, 904f));
        }
    }
}

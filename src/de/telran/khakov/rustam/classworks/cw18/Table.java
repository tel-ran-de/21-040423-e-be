package de.telran.khakov.rustam.classworks.cw18;

public class Table<T, V extends Number> {
    T tableInfo;
    V value;
    int size;

    public T getTableInfo() {
        return tableInfo;
    }

    public V getValue() {
        return value;
    }

    public int getSize() {
        return size;
    }

    public void isString() {
        //tableInfo instanceof T
    }

    public static <U extends Car & Comparable<?>> void test(U car) {
    }

    public static <U extends Car & Comparable<? extends FuelCar>> U generateCar() {
        return null;
    }
}

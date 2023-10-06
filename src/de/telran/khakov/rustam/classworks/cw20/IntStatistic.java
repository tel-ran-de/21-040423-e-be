package de.telran.khakov.rustam.classworks.cw20;

public class IntStatistic {
    int sum;
    double average;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int count;


    @Override
    public String toString() {
        return "IntStatistic{" +
                "sum=" + sum +
                ", average=" + average +
                ", max=" + max +
                ", min=" + min +
                ", count=" + count +
                '}';
    }
}

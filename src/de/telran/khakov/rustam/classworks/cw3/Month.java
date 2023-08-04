package de.telran.khakov.rustam.classworks.cw3;

// 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int howManyDays;

    Month(int howManyDays) {
        this.howManyDays = howManyDays;
    }

    @Override
    public String toString() {
        return name() + " howManyDays = " + howManyDays;
    }

    public static void main(String[] args) {
        for (Month value : Month.values()) {
            System.out.println(value);
        }

    }
}

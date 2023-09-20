package de.telran.khakov.rustam.classworks.cw16;

@FunctionalInterface
public interface Func {

    int apply(int x);

    default int apply2(int x) {
        return apply(x + 2);
    }
}

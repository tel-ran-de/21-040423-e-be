package de.telran.khakov.rustam.classworks.cw3;

public class OverloadTest {
    // перегрузка = одиноковое название, но разная сигнатура (но разные параметры)
    private static final double sum(double first, int second) {
        // modificator -
        // static -
        // final -
        // возвращаемый тип -
        // method name +
        // название парметров не влияет на сигнатуру
        // type +
        return first + second;
    }
 /// имя метода + типы входных  парметров в порядке объявления
    static double sum(int second, double first) {
        return first + second;
    }
}

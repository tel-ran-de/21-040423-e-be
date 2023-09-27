package de.telran.khakov.rustam.homeworks.homework16;

public class GeronFormula {
    //Напишите формулу для подсчета площади по трем переменным - формулы Герона. Вызовите ее
    public static void main(String[] args) {
        TripleFunction trianglePerimeter = (a, b, c) -> {
            return a + b + c;//correct formula
        };

        System.out.println(trianglePerimeter.calc(3, 4, 5));
    }
}

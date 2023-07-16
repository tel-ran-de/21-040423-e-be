package de.telran.ivanov.vanya;

import de.telran.khakov.rustam.classworks.cw1.Scanner;
import de.telran.khakov.rustam.classworks.cw1.Student;

public class ScannerTest {
    public ScannerTest() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner();
        Student student = new Student("Vasya");
        java.util.Scanner scan2 = new java.util.Scanner(System.in);
        student.sayHello();
    }
}

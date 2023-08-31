package de.telran.khakov.rustam.homeworks.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretaryHelper {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Пупкин Вася", "987654"));
        personList.add(new Person("Петя Пупкин", "987987"));
        personList.add(new Person("Пенков Вася", "123456"));
        Scanner scanner = new Scanner(System.in);
        String whoToFind = scanner.next();
        System.out.println(findNumbersByLastName(personList, whoToFind));
    }

    public static List<String> findNumbersByLastName(List<Person> personList, String lastName) {
        List<String> numbers = new ArrayList<>();
        for (Person person : personList) {
            if (person.getName().contains(lastName)) {// "Пупкин Вася"   ->  "Пупкин"
                numbers.add(person.getNumber());
            }
        }
        return numbers;
    }

    //Составьте программу, облегчающую работу секретаря. Создайте объект Person с двумя
    // параметрами имя, фамилия и номер телефона. Создайте List и заполните его объектами
    // Person.
    // Напишите программу, которая будет искать номера телефонов по введенной фамилии.
    // Например в листе <Пупкин Вася 987654 >,<Пупкин Петя 987987>,<Пенков Вася 123456> при
    // поиске по Пупкин результатом будет List : <987654>,<987987>
}

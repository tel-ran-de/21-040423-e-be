package de.telran.khakov.rustam.homeworks.homework10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class BookSorter {
    public static void main(String[] args) {
        //Пример работы в этом случае:
        //   - сортировать по имени?
        //   - да
        //   - в каком порядке возрастание или убывание?
        //   - возрастание
        //   - сортировать по году публикации?
        //   - нет
        //   - сортировать по автору?
        //   - да
        //   - в каком порядке возрастание или убывание?
        //   - убывание
        //   - сортировать по издательству?
        //   - нет
        List<Book> books = new ArrayList<>();
        books.add(new Book(1950, "Tolkien", "Lord of the Rings: Part 1", "Lors"));
        books.add(new Book(1950, "Tolkien", "Lord of the Rings: Part 2", "Lors"));
        books.add(new Book(1952, "Tolkien", "Lord of the Rings: Part 2", "Lors"));
        books.add(new Book(1960, "Tolkien", "Lord of the Rings: Part 2", "Lors"));
        books.add(new Book(1950, "Rouling", "Harry Potter", "Tera"));
        books.add(new Book(1950, "Rouling", "Harry Potter Part 2", "Tera"));

        Comparator<Book> comparator = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("сортировать по имени?");
        comparator = checkDecision(scanner, Comparator.comparing(Book::getName), comparator); // да
        System.out.println("сортировать по году публикации?");
        comparator = checkDecision(scanner, Comparator.comparing(Book::getPublishYear), comparator); // да
        System.out.println("сортировать по автору?");
        comparator = checkDecision(scanner, Comparator.comparing(Book::getAuthor), comparator);
        System.out.println("сортировать по издательству?");
        comparator = checkDecision(scanner, Comparator.comparing(Book::getPublishHome), comparator);
        books.sort(comparator);
        System.out.println(books);
    }


    private static Comparator<Book> checkDecision(Scanner scanner, Comparator<Book> comparator, Comparator<Book> prevComparator) {
        String decision = scanner.next();
        if (decision.equalsIgnoreCase("да")) {
            System.out.println("в каком порядке возрастание или убывание?");
            String order = scanner.next();
            if (order.equalsIgnoreCase("убывание")) {
                comparator = comparator.reversed();
            }
            if (prevComparator == null) {
                return comparator;
            } else {
                return prevComparator.thenComparing(comparator);
            }
        }
        return prevComparator;
    }

}

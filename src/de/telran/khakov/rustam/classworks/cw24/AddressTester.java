package de.telran.khakov.rustam.classworks.cw24;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressTester {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?<streetName>\\w+(\\s\\w+))*\\s(?<houseNumber>\\d+[A-Z]?)", Pattern.CASE_INSENSITIVE);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            System.out.println("invalid address");
        } else {
            System.out.println(matcher.group("streetName"));// (\w+(\s\w+))
            System.out.println(matcher.group("houseNumber"));// (\d+[A-Z]?)
        }
    }
}

package de.telran.khakov.rustam.classworks.cw24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String[] strings = new String[10];
        Pattern pattern = Pattern.compile("\\d+");
//        for (String string : strings) {
//            Matcher matcher = pattern.matcher(string);
//            if (!matcher.matches()) {
//                System.out.println("this is not a number: " + string);
//            }
//        }
        String str = "Is it tasty?";
        boolean isQuestion = str.matches("[\\w\\s]{2,}\\?");
        System.out.println(isQuestion);
    }
}

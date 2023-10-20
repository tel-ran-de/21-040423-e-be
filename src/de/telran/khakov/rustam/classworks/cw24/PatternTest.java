package de.telran.khakov.rustam.classworks.cw24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String str = "мама мыла раму, а папа ел пельмени. Ехали ли медведи на велосипеде?";
        String[] words = str.split(" ");
        int l = words.length;
        Pattern pattern = Pattern.compile("[a-яА-Я]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String str2 = "ac-yiuygjl-bbbbbbba--b-a-c--bbba\n\ttest";//Not ok
        String str4 = "c-yiuygjl-bbbbbbba--b-a-c--bbba\n\ttest";// OK
        Pattern pattern1 = Pattern.compile("c.*?b+a");
        Matcher matcher1 = pattern1.matcher(str4);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
            System.out.println(matcher1.start());
            System.out.println(matcher1.end());
        }

        String str3 = "C:\\Use\"rs\\ist\\Destop\\lesson.txt";
        Pattern pattern2 = Pattern.compile("\\\\");
        Matcher matcher2 = pattern1.matcher(str3);
        while (matcher2.find()) {
            System.out.println(matcher2.start());
        }

    }
}

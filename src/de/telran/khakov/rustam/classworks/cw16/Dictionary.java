package de.telran.khakov.rustam.classworks.cw16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String englishWord = scanner.nextLine();
            if (dic.containsKey(englishWord)) {
                System.out.println(dic.get(englishWord));
            } else {
                System.out.println("give me translation to russian language:");
                String translated = scanner.nextLine();
                dic.put(englishWord, translated);
            }
        }
    }
}

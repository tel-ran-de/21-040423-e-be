package de.telran.khakov.rustam.classworks.cw24;

import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\+?\\d+([\\s-]\\d+)*(\\(\\d+\\))?");
        System.out.println(pattern.matcher("12345").matches());
        System.out.println(pattern.matcher("12 12 12").matches());
        System.out.println(pattern.matcher("12-12-12").matches());
        System.out.println(pattern.matcher("+53 00 00").matches());
        System.out.println(pattern.matcher("+5699-90(2)").matches());

        System.out.println(pattern.matcher("+5699-90(20)").matches());
        System.out.println(pattern.matcher("12 12 12aa").matches());
        System.out.println(pattern.matcher("-12 12 12").matches());


    }
}

package de.telran.khakov.rustam.classworks.cw25;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateFileTest {

    public static void main(String[] args) throws IOException, ParseException {
        Date date = new Date();
        System.out.println(date);
        DateFormat formatter = new SimpleDateFormat("MMMM/dd/yyyy GG 'time:' HH:mm:ss.SSSS z");
        Date parsed = formatter.parse("November/21/2021 AD time: 21:20:48.0206 UTC");
        System.out.println(parsed);
        System.out.println(formatter.format(date));
        System.out.println(formatter.format(Calendar.getInstance().getTime()));
//        try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("src/de/telran/khakov/rustam/classworks/cw25/date.txt"))){
//            ois.writeObject(date.toString());
//        }
    }
}

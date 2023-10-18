package de.telran.khakov.rustam.classworks.cw23;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) {
        int progress = 0;
        //Scanner scanner = new Scanner(System.in);

        try (InputStream is = new FileInputStream("/Users/rustamkhakov/IdeaProjects/java-prof/matches.txt");
             OutputStream os = new FileOutputStream("/Users/rustamkhakov/IdeaProjects/java-prof/matches2.txt")
        ) {
            while (is.available() != 0) {
                progress++;
                os.write(is.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
            // continue download from progress point
        }

        String str = "test";
        InputStream is1 = new StringBufferInputStream(str);
    }
}

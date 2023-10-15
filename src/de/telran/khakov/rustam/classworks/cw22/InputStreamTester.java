package de.telran.khakov.rustam.classworks.cw22;

import java.io.*;

public class InputStreamTester {
    public static void main(String[] args) throws IOException {
        InputStream is;
        OutputStream os;
        System.out.println();
        FileReader reader = new FileReader(new File("test3.txt"));
        PrintWriter pw = new PrintWriter(new File("test2.txt"));
        while (reader.ready()) {
            int c = reader.read();
            pw.write(c);
        }
        pw.flush();
        pw.close();
        reader.close();
    }
}

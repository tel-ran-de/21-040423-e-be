package de.telran.khakov.rustam.classworks.cw23;

import java.io.*;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        try (Reader reader = new FileReader("/Users/rustamkhakov/IdeaProjects/java-prof/matches.txt");
            Writer writer = new FileWriter("/Users/rustamkhakov/IdeaProjects/java-prof/matches-3.txt")
            ) {
            while (reader.ready()) {
                char current = (char) reader.read();
                System.out.print(current);
                writer.write(current);
                if (current == '\n') {
                     return;
                }
            }
        }
        //InputStreamReader
    }

    // File (match result) -> internet -> FileReader ->  Reader
    // File (match result) -> internet -> InputStream -> FileInputStream-> (byte detecting) -> InputStreamReader ->  Reader

}

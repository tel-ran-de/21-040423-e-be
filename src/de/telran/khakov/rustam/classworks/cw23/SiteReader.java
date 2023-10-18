package de.telran.khakov.rustam.classworks.cw23;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SiteReader {

    public static void main(String[] args) throws IOException {
        String urlPath = "https://www.geeksforgeeks.org/javafx-textfield";
        URL url = new URL(urlPath);
        File file = new File("site.html");
        if (!file.exists()) {
            file.createNewFile();
        }
        try (Reader reader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
             Writer writer = new FileWriter(file)
        ) {
            System.out.print((char)reader.read());
            writer.write(reader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

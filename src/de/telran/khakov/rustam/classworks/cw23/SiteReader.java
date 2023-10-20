package de.telran.khakov.rustam.classworks.cw23;

import de.telran.khakov.rustam.classworks.cw24.MyBufferReader;

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
        long before = System.currentTimeMillis();
        try (Reader reader = new MyBufferReader(new InputStreamReader(url.openStream()));
             Writer writer = new BufferedWriter(new FileWriter(file))
        ) {
            int v = -1;
            while ((v = reader.read()) != -1) {
                writer.write(v);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - before);
    }
}

package de.telran.khakov.rustam.classworks.cw23;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        File resource = new File("/Users/rustamkhakov/IdeaProjects/java-prof/src/de/telran/khakov/rustam/classworks/cw23/save.txt");
        if (!resource.exists()) {
            resource.createNewFile();
        }
        Result prevResult = read(resource);
        prevResult.counter++;//any logic
        System.out.println(prevResult.counter);
        save(prevResult, resource);
    }

    private static Result read(File resource) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(resource))) {
            return (Result) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Result();
        }
    }

    private static void save(Result prevResult, File resource) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(resource))) {
            oos.writeObject(prevResult);
        }
    }
}

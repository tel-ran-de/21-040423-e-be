package de.telran.khakov.rustam.classworks.cw22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class IOTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("/Users/rustamkhakov/IdeaProjects/java-prof/src/de/telran/khakov/rustam/classworks/cw22/matches.txt"));
        } catch (FileNotFoundException e) { //
            System.out.println(e.getMessage());
            System.out.println("введите данные с консоли:");
            scanner = new Scanner(System.in);
        }
        String s = scanner.next();
        s = s + 1;
        System.out.println(s);
        String res = "%s test %s".formatted("first", "second");
        System.out.println(res);
        File absoluteFile = new File("/Users/rustamkhakov/IdeaProjects/java-prof/src/de/telran/khakov/rustam/classworks/cw22/matches.txt");
        File file = new File("test3.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(absoluteFile.getName());
        System.out.println(absoluteFile.getParentFile().getName());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.canRead());
        file.setReadable(true);
        File newFile = new File("test3.txt");
        file.renameTo(newFile); // test2.txt -> test3.txt
        Scanner scanner2 = new Scanner(newFile);
        System.out.println(scanner2.nextLine());
        File srcFile = new File("src");
        System.out.println(srcFile.isDirectory());
        System.out.println(Arrays.toString(srcFile.list()));
        System.out.println(Arrays.toString(srcFile.listFiles()));
        String currentFileName = null;
        File dir = new File(".");
        File foundFile = findFile("CreditCard.java", dir);
        System.out.println(foundFile);
        File newFile1 = new File("some.txt");
        Path path = newFile1.toPath();
        //path.getNameCount()
                // folder/test/random + "new-folder"
//        new File(dir.getAbsolutePath(), "new-folder" + File.separator + "newFolder2").mkdirs();
        Path newFolder2 = path.resolve("new-folder").resolve("newFolder2");
        Paths.get(".","newFolder", "newFolder2");
        Files.lines(Paths.get("test3.txt"))
                .filter(v->v.length() > 6)
                .forEach(System.out::println);
        // new folder
        // new folder (1)
        // new folder (2)
    }

    private static File findFile(String fileName, File file) {
        if (file.isDirectory()) {
            for (File innerFile : file.listFiles()) {
                File found = findFile(fileName, innerFile);
                if (found != null) {
                    return found;
                }
            }
            return null;
        } else {
            if (file.getName().equals(fileName)) {
                return file;
            }
            return null;
        }
    }
}

package de.telran.khakov.rustam.classworks.cw22;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        long count = Files.lines(Paths.get("/Users/rustamkhakov/IdeaProjects/java-prof/matches.txt"))
                .count();
        System.out.println(count);

        Scanner scanner = new Scanner(new File("/Users/rustamkhakov/IdeaProjects/java-prof/matches.txt"));
        long secCounter = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            secCounter++;
        }
        System.out.println(secCounter);

        Files.lines(Paths.get("/Users/rustamkhakov/IdeaProjects/java-prof/matches.txt"))
                .map(MatchResult::new)
                .filter(matchResult -> matchResult.wathcers > 10000)
                .forEach(System.out::println);

        Map<String, Integer> collect = Files.lines(Paths.get("/Users/rustamkhakov/IdeaProjects/java-prof/matches.txt"))
                .map(MatchResult::new)
                .filter(matchResult -> matchResult.stadiumName != null)
                .collect(Collectors.toMap(matchResult -> matchResult.stadiumName, matchResult -> matchResult.wathcers, Integer::sum));
        System.out.println(collect);
    }
}

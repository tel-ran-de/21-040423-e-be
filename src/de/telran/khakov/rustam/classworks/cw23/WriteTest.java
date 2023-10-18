package de.telran.khakov.rustam.classworks.cw23;

import de.telran.khakov.rustam.classworks.cw22.MatchResult;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;

public class WriteTest {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> collect = Files.lines(Paths.get("/Users/rustamkhakov/IdeaProjects/java-prof/matches.txt"))
                .map(MatchResult::new)
                .filter(matchResult -> matchResult.stadiumName != null)
                .collect(Collectors.toMap(matchResult -> matchResult.stadiumName, matchResult -> matchResult.wathcers, Integer::sum));
        //System.setOut(outToFile);
        System.out.println(collect);

        try (PrintStream outToFile = new PrintStream(new File("stadiumWatchers.txt"))) {
            outToFile.println(collect);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

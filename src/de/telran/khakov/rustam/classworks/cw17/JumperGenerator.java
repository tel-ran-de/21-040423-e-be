package de.telran.khakov.rustam.classworks.cw17;

import java.util.Optional;

public class JumperGenerator {
    static Optional<Jumper> generate(int i) {
        if (i < 70) {
            return Optional.ofNullable(new Jumper(i));
        }
        return Optional.empty();
    }
}

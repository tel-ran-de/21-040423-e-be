package de.telran.khakov.rustam.classworks.cw17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        Map<String, Supplier<Aircraft>> aircraftBuilders = new HashMap<>();
        Map<String, Aircraft> knownAircrafts = new HashMap<>();
        // (x, y) -> x + 5 + y;
        // f(x, y) = ....
        // f(x) = ...
        // f() =
        aircraftBuilders.put("Boeing", () -> new Aircraft("Boeing", 1972));// если запросили боинг -> создать и вернуть самолет боинг
        System.out.println("aircraft Boeing is added");
        aircraftBuilders.put("AirBus", () -> new Aircraft("AirBus", 1980)); // если запросили аирбас -> создать и вернуть аирбас
        System.out.println("aircraft AirBus is added");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter aircraft name");
        while (true) {
            String keyName = scanner.next();
            //  в мапе созданных, если его там нет, то создай его используя мапу создателей
            knownAircrafts.computeIfAbsent(keyName, key -> new Aircraft(key, 1900));
            Aircraft knownAircraft = knownAircrafts.get(keyName);
            if (knownAircraft == null) {
                continue;
            }
            System.out.println(knownAircraft);
        }
    }
}

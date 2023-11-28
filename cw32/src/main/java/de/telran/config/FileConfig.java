package de.telran.config;

import de.telran.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileConfig implements Configurable {

    private HashType hashType;
    private Fabric fabric = new Fabric();

    public FileConfig(String[] args) {
        File file = new File(args[0]);
        try (FileReader reader = new FileReader(file)) {
            Files.lines(Path.of(args[0]))
                    .limit(1)
                    .forEach(str -> {
                        String[] split = str.split("=");
                        this.hashType = HashType.valueOf(split[1]);
                    });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Hashable hashable() {
        return fabric.create(hashType);
    }

    public Storage storage() {
        return Storage.getInstance();
    }

    public UserService userService() {
        return new UserService(storage(), hashable());
    }

}

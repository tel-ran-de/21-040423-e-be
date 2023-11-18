package de.telran;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


class UserTest {

    @Test
    public void test() {
        User user = new User.Builder()
                .withName("John")
                .withEmail("test@test.com")
                .build();
        FileInputStream fis = new FileInputStream(new File(""));
        InputStream is = new BufferedInputStream(fis);
    }

}
package de.telran;

import java.util.Base64;

public class Base64Hasher implements Hashable, Decodable {

    public String hash(String original) {
        byte[] encoded = Base64.getEncoder().encode(original.getBytes());
        return new String(encoded);
    }

    public String decode(String original) {
        byte[] encoded = Base64.getDecoder().decode(original.getBytes());
        return new String(encoded);
    }

}

package de.telran;

public class SmartHasher extends Hasher {
    private String salt;

    public SmartHasher(String salt) {
        this.salt = salt;
    }

    public String hash(String original) {
        return super.hash(original + salt);
    }
}

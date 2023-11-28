package de.telran;


import de.telran.annotations.MyBean;
import de.telran.annotations.MyConfiguration;

@MyConfiguration
public class Config {

    @MyBean
    public Hashable hashable() {
        return new Hasher();
    }

    @MyBean
    public Storage storage() {
        return Storage.getInstance();
    }
}

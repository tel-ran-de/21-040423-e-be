package de.telran.khakov.rustam.classworks.cw23;

import java.io.PrintStream;

public class ClassWithResource implements AutoCloseable {
    PrintStream stream;

    public ClassWithResource(PrintStream stream) {
        this.stream = stream;
    }


    @Override
    public void close() throws Exception {
        if (stream != null) {
            stream.close();
        }
    }
}

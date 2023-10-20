package de.telran.khakov.rustam.classworks.cw24;

import java.io.IOException;
import java.io.Reader;

public class MyBufferReader extends Reader {
    private Reader originalReader;
    char[] buffer;
    int counter;
    int lastRead = -1;

    public MyBufferReader(Reader originalReader) {
        this.originalReader = originalReader;
        buffer = new char[1024];
        counter = buffer.length + 1;
    }

    @Override
    public int read() throws IOException {
        checkAndInitBuffer();
        return lastRead >= 0 ? buffer[counter++] : -1;
    }

    private void checkAndInitBuffer() throws IOException {
        if (counter >= buffer.length) {
            buffer = new char[1024];
            lastRead = originalReader.read(buffer);
            counter = 0;
        }
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {
        originalReader.close();
    }
}

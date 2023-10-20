package de.telran.khakov.rustam.classworks.cw24;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class RasTest {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile ras = new RandomAccessFile("stadiumWatchers.txt", "rw")) {
            ras.read();// 1
            ras.read();//2
            ras.seek(10);//10
            ras.read();//11
            ras.seek(0);//0
            ras.read();//1
            ras.seek(10);
            ras.write('3');
            System.out.println(ras.getFilePointer());
            //new FileChannel(Path.of("stadiumWatchers.txt"), Set.of(StandardOpenOption.CREATE, StandardOpenOption.APPEND, StandardOpenOption.READ))
            try (FileChannel inChannel = ras.getChannel();
                 Channel outChannel = Channels.newChannel(new FileOutputStream("test.txt"))) {
                inChannel.transferTo(0L, inChannel.size(), (WritableByteChannel) outChannel);
            }
        }
    }
}

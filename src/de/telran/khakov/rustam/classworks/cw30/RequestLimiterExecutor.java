package de.telran.khakov.rustam.classworks.cw30;

import java.util.ArrayList;
import java.util.List;

public class RequestLimiterExecutor {
    private List<Thread> threads = new ArrayList<>();
    private List<Thread> runnings = new ArrayList<>();

    public void addThread(Thread thread) {
        threads.add(thread);

    }

    public void execute() {
        Thread thread = new Thread(() -> {
            for (Thread running : runnings) {
                if (!running.isAlive()) {
                    // remove from running
                    runnings.add(threads.remove(0));
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

    }


}

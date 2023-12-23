package de.telran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableScheduling
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
       // PlatformTransactionManager ts = new JdbcTransactionManager();

        //scheduledExecutorService.scheduleWithFixedDelay()
        // Prepared statement = ..
        // try {
        // make some operation
        // statement.commit();
        //ts.commit();
        //} catch (Exception) {
        //  statement.rollback();
        // }
    }

    @Scheduled(fixedDelay = 5, timeUnit = TimeUnit.SECONDS)
    @Transactional
    public void test() {
        System.out.println("Hi");
        test2();
    }

    @Transactional
    public void test2() {
        System.out.println("Hi");
    }

    @Scheduled(cron = "0/10 30-48 23 ? * *")
    public void testAtTime() {
        System.out.println("Hi scheduled");
    }
}
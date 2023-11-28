package de.telran;

import de.telran.config.Config;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("de.telran")) {
            Printer printer = context.getBean("printer", Printer.class);
            Printer anotherPrinter = context.getBean("printer2", Printer.class);
            printer.doPrint();
            printer.doPrint();
            printer.doPrint();
            System.out.println(context.getApplicationName());

            WifiConnector wifiConnector = context.getBean("wifiConnector", WifiConnector.class);
            WifiConnector wifiConnector2 = context.getBean("wifiConnector", WifiConnector.class);
            WifiConnector wifiConnector3 = context.getBean("wifiConnector", WifiConnector.class);
            System.out.println(wifiConnector3 == wifiConnector2);

        }
    }
    //AnswerCheck
    // sout("check answer")
    // check() {
    // sout ("exam answer checked");


    //Exam(AnswerCheck check)
    // examCeheck() {
    //  answerChecker.check();
    // }
    // init() - sout(exam started)
    // destroy() - sout("exam end")
}

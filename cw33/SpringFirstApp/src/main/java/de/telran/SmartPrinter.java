package de.telran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "printer2")
public class SmartPrinter extends Printer {

    WifiConnector connector;

    public SmartPrinter() {
    }

    @Autowired
    public SmartPrinter(@Qualifier("wifiConnector") WifiConnector connector) {
        this.connector = connector;
    }


    public void setConnector(WifiConnector connector) {
        this.connector = connector;
    }

    @PostConstruct
    public void init() {
        System.out.println("connect by wifi" + connector);
    }

    @Override
    public void doPrint() {
        super.doPrint();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("disconnect from wifi" + connector);
    }

}

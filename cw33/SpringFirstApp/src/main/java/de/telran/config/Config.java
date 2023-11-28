package de.telran.config;

import de.telran.Printer;
import de.telran.SmartPrinter;
import de.telran.WifiConnector;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
public class Config {

    @Bean
    public Printer printer() {
        return Printer.creator();
    }

//    @Bean
//    @Lazy
//    public Printer printer2(@Qualifier("wifiConnector") WifiConnector wifiConnector) {
//        SmartPrinter smartPrinter = new SmartPrinter();
//        smartPrinter.setConnector(wifiConnector);
//        return smartPrinter;
//    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public WifiConnector wifiConnector() {
        return new WifiConnector();
    }

    @Bean
    public WifiConnector wifiConnector2() {
        return new WifiConnector();
    }
}

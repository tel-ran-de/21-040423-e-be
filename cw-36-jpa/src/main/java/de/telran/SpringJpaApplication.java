package de.telran;

import de.telran.dao.UserRepository;
import de.telran.model.User;
import de.telran.service.EMService;
import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
        EMService service = context.getBean(EMService.class);
        service.doSmth();
    }
}
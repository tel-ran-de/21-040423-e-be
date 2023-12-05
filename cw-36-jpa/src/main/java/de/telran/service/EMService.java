package de.telran.service;

import de.telran.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import jakarta.transaction.TransactionManager;
import org.springframework.stereotype.Service;

@Service
public class EMService {
//    @PersistenceContext(type = PersistenceContextType.EXTENDED)
//    private EntityManager em;

    public void doSmth(){
        User user = new User();// transient
//        em.persist(user);
//        em.detach(user);
//        em.flush();
//        User userFromDb = em.find(User.class, 1);
        //userFromDb.getAge();
    }
}

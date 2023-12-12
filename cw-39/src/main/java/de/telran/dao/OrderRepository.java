package de.telran.dao;

import de.telran.model.Order;
import de.telran.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAll();

    List<Order> findAllByUser(User user);

    List<Order> findAllByUserId(int userId);

}

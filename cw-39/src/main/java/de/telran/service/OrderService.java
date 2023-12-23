package de.telran.service;

import de.telran.dao.OrderRepository;
import de.telran.dao.UserRepository;
import de.telran.model.Order;
import de.telran.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    private OrderRepository orderRepository;

    private UserRepository userRepository;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public Order getById(int id) {
        log.trace("request to get user id: {}", id);
        log.debug("request to get user id: {}", id);
        log.info("request to get user id: {}", id);
        log.warn("request to get user id: {}", id);
        log.error("request to get user id: {}", id);
        Order order = orderRepository.findById(id).orElseThrow();
        return order;
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public List<Order> findByUserId(int userId) {
        return orderRepository.findAllByUserId(userId);
    }

    public Order create(Order order, int userId) {
        User user = userRepository.findById(userId).orElseThrow();
        order.setUser(user);
        return orderRepository.save(order);
    }
}

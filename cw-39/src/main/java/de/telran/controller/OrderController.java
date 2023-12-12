package de.telran.controller;

import de.telran.model.Order;
import de.telran.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private static Logger log = LoggerFactory.getLogger(OrderController.class);

    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders/{id}") //users/45
    public Order getById(@PathVariable int id) {
        log.debug("request to get user id: {}", id);
        return orderService.getById(id);
    }

    @GetMapping("/orders") //users/45
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/users/{id}/orders") //users/45
    public List<Order> getByUser(@PathVariable(name = "id") int userId) {
        return orderService.findByUserId(userId);
    }

    @PostMapping("/users/{id}/orders") //users/45
    public Order create(@PathVariable(name = "id") int userId, @RequestBody Order order) {
        return orderService.create(order, userId);
    }
}

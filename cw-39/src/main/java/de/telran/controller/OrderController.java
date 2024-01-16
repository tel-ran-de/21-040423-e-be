package de.telran.controller;

import de.telran.dto.OrderDto;
import de.telran.model.Order;
import de.telran.model.Status;
import de.telran.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {
    private static Logger log = LoggerFactory.getLogger(OrderController.class);

    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders/{id}") //users/45
    public OrderDto getById(@PathVariable int id) {
        log.debug("request to get user id: {}", id);
        return OrderDto.from(orderService.getById(id));
    }

    @GetMapping("/orders") //users/45
    public List<OrderDto> getAll() {
        List<Order> all = orderService.getAll();
        return all.stream().map(OrderDto::from).toList();
    }

    @GetMapping("/users/{id}/orders") //users/45
    public List<Order> getByUser(@PathVariable(name = "id") int userId) {
        return orderService.findByUserId(userId);
    }

    @PostMapping("/users/{id}/orders") //users/45
    public Order create(@PathVariable(name = "id") int userId, @RequestBody Order order) {
        return orderService.create(order, userId);
    }

//    @PostMapping("/orders/{id}/status/{status}")
//    public Order changeStatus(@PathVariable(name = "id") int id,
//                              @PathVariable Status status) {
//        Order order2Change = orderService.getById(id);// order PENDING  -> SHIPPED
//        order2Change.setStatuses(Collections.singleton(status));
//        orderService
//
//    }
}

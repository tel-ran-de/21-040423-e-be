package de.telran.controller;

import de.telran.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
   @GetMapping("/orders/{id}") //users/45
    public Order getById(@PathVariable int id){
        return new Order(id);
    }
}

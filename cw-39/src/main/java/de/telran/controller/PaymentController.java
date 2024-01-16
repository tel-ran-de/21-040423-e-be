package de.telran.controller;

import de.telran.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    @PostMapping("/pay")
    Boolean pay(@RequestBody Payment payment) {
        return paymentService.pay(payment);
    }
}

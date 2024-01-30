package org.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {


    @PostMapping("/pay")
    public Integer processPayment(@RequestBody Payment payment) {
        if ("test".equals(payment.userId)) {
            return payment.price > 0 ? payment.price : 0;
        }
        return 0;
    }

    public static class Payment {
        Integer price;
        String userId;

        public Payment() {
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}

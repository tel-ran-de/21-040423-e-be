package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class OrderController {

    Map<String, Integer> prices = Map.of("item0", 100, "item2", 200);
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/order")
    public OrderResult processOrder(@RequestParam String item, @RequestParam String userId) {
        if ("test".equals(userId)) {
            Payment payment = new Payment(prices.get(item), userId);
            ResponseEntity<Integer> responseEntity = restTemplate.postForEntity("http://localhost:8080/pay", payment, Integer.class);
            if (responseEntity.getStatusCode().value() < 300) {
                return new OrderResult(item, responseEntity.getBody(), 0);
            }
        }
        return new OrderResult();
    }

    public static class OrderResult {
        private String orderId;
        private Integer price;
        private Integer howManyExists;

        public OrderResult() {
        }

        public OrderResult(String orderId, Integer price, Integer howManyExists) {
            this.orderId = orderId;
            this.price = price;
            this.howManyExists = howManyExists;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getHowManyExists() {
            return howManyExists;
        }

        public void setHowManyExists(Integer howManyExists) {
            this.howManyExists = howManyExists;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }
    }

    public static class Payment {
        Integer price;
        String userId;

        public Payment() {
        }

        public Payment(Integer price, String userId) {
            this.price = price;
            this.userId = userId;
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


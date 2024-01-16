package de.telran.service;

import de.telran.controller.Payment;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    final Map<String, Boolean> idempotencyPaymentsMap = new HashMap<>();

    public Boolean pay(Payment payment) {
        synchronized (idempotencyPaymentsMap) {
            if (idempotencyPaymentsMap.containsKey(payment.getIdempotencyId())) {
                return idempotencyPaymentsMap.get(payment.getIdempotencyId());
            }
            idempotencyPaymentsMap.put(payment.getIdempotencyId(), false);
        }
        System.out.println(" start payment process for " + payment.getIdempotencyId());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" payment process finish " + payment.getIdempotencyId());
        idempotencyPaymentsMap.put(payment.getIdempotencyId(), true);
        return true;
    }
}

package de.telran.controller;

public class Payment {

    String idempotencyId;

    int price;

    public String getIdempotencyId() {
        return idempotencyId;
    }

    public void setIdempotencyId(String idempotencyId) {
        this.idempotencyId = idempotencyId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

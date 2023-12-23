package de.telran.dto;

import de.telran.model.Order;

import java.util.Date;

public class OrderDto {
    private Integer id;

    private Date date;

    private String name;

    public OrderDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static OrderDto from(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setDate(order.getDate());
        orderDto.setName(order.getName());
        orderDto.setId(order.getId());
        return orderDto;
    }
}

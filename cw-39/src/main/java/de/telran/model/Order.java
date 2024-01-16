package de.telran.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;

    private Date date;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

   // Set<Status> statuses;

    public Order() {
    }

    public Order(int id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public Set<Status> getStatuses() {
//        return statuses;
//    }
//
//    public void setStatuses(Set<Status> statuses) {
//        this.statuses = statuses;
//    }
}

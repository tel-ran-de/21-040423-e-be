package de.telran.model;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import org.springframework.security.core.GrantedAuthority;

@Entity(name = "roles")
public class Role implements GrantedAuthority {
    String authority;

    @Id
    @GeneratedValue
    Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

package de.telran.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "users")
public class User {

    @Pattern(regexp = "[a-z,A-Z]+")
    String name;
    @Id
    @GeneratedValue
    Integer id;
    @Min(value = 40, message = "возраст должен быть не меньше 40")
    int age;
    @Email(message = "невалидный емаил")
    String email;

    UserStatus status;

    private String password;

    private String activationToken;
    private LocalDateTime activateToTime;

    public User() {
        this.status = UserStatus.NOT_ACTIVATED;
    }

    public User(String name, int id, int age) {
        this();
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public User(String name, Integer id, int age, String email) {
        this();
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public LocalDateTime getActivateToTime() {
        return activateToTime;
    }

    public void setActivateToTime(LocalDateTime activateToTime) {
        this.activateToTime = activateToTime;
    }

    public String getActivationToken() {
        return activationToken;
    }

    public void setActivationToken(String activationToken) {
        this.activationToken = activationToken;
    }
}

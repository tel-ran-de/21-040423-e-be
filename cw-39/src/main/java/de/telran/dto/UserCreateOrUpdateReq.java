package de.telran.dto;

import de.telran.model.User;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class UserCreateOrUpdateReq {
    @Pattern(regexp = "[a-z,A-Z]+")
    String name;
    @Min(value = 40, message = "возраст должен быть не меньше 40")
    int age;
    @Email(message = "невалидный емаил")
    String email;

    @NotEmpty
    @Length(min = 6)
    String password;

    String repeatPassword;


    public UserCreateOrUpdateReq() {
    }

    public UserCreateOrUpdateReq(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserCreateOrUpdateReq(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public User toUser() {
        return null;//transform
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}

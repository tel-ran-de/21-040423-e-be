package de.telran;

import java.util.Date;

public class User {
    private String email;
    private String password;
    private String name;
    private String lastName;
    private Date birthDay;

    public User(String email, String password, String name, String lastName, Date birthDay) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }


    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final class Builder {
        private String email;
        private String password;
        private String name;
        private String lastName;
        private Date birthDay;

        public Builder() {
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withBirthDay(Date birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public User build() {
            if (email ==null) {
                throw new RuntimeException();
            }
            return new User(email, password, name, lastName, birthDay);
        }
    }
}

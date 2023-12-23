package de.telran.dto;

public class RefreshTokenRequest {
    String token;

    public RefreshTokenRequest() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

package de.telran.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.stream.Collectors;

@Service
public class JwtService {

    private SecretKey secretKey;

    public JwtService(@Value(value = "jwt.secret") String secret) {
        secretKey = Keys.hmacShaKeyFor("gdgdfgdgdfgdgdgdgdg8df9g8fdg098fg9sd8g09fd8g90df8sg98fd09s8g09d".getBytes());
    }

    public String generate(UserDetails userDetails) {
        Date exp = Date.from(LocalDateTime.now().plusMinutes(2).atZone(ZoneId.systemDefault())
                .toInstant());
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .signWith(secretKey)
                .setExpiration(exp)
                .claim("roles", userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .compact();
    }

    public Jws<Claims> validate(String token) {
        try {
            Jws<Claims> claimsJws = Jwts.parser()
                    .setSigningKey(secretKey)
                    .build()
                    .parseClaimsJws(token);
            return claimsJws;
        } catch (Exception e) {
            //add logging
            return null;
        }
    }
}

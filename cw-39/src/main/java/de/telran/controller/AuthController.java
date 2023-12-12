package de.telran.controller;

import de.telran.dto.UserTokenRequest;
import de.telran.service.JwtService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    UserDetailsService userDetailsService;

    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthController(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public String login(@RequestBody UserTokenRequest req) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(req.getName());
        if(passwordEncoder.matches(req.getPassword(), userDetails.getPassword())) {
            return jwtService.generate(userDetails);
        }
        throw new RuntimeException();
    }
}

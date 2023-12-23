package de.telran.controller;

import de.telran.dto.RefreshTokenRequest;
import de.telran.dto.TokenResponse;
import de.telran.dto.UserTokenRequest;
import de.telran.service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    UserDetailsService userDetailsService;

    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    private Map<String, String> refreshTokenToUser = new HashMap<>();

    public AuthController(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    @PostMapping("/api/login")
    public TokenResponse login(@RequestBody UserTokenRequest req) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(req.getName());
        if (passwordEncoder.matches(req.getPassword(), userDetails.getPassword())) {
            TokenResponse generate = jwtService.generate(userDetails);
            refreshTokenToUser.put(generate.getRefreshToken(), req.getName());
            return generate;
        }
        throw new RuntimeException();
    }


    @Operation(summary = "get access token by refresh token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "token resp",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = TokenResponse.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid refresh token",
                    content = @Content),
            @ApiResponse(responseCode = "403", description = "refresh token expired",
                    content = @Content) })
    @PostMapping("/refresh")
    public TokenResponse refresh(@RequestBody RefreshTokenRequest req) {
        Claims validate = jwtService.validate(req.getToken());
        if (validate.getSubject().equals(refreshTokenToUser.get(req.getToken()))) {
            UserDetails userDetails = userDetailsService.loadUserByUsername(validate.getSubject());
            TokenResponse generate = jwtService.generate(userDetails);
            refreshTokenToUser.put(generate.getRefreshToken(), userDetails.getUsername());
            return generate;
        }
        throw new RuntimeException();
    }
}

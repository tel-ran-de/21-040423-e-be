package de.telran.config;

import de.telran.dao.RoleRepository;
import de.telran.dao.UserRepository;
import de.telran.security.JwtFilter;
import de.telran.service.DbUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {
    @Autowired
    JwtFilter jwtFilter;

    @Bean
    UserDetailsService userDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
        return new DbUserDetailsService(userRepository, roleRepository);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf().disable()
                .authorizeHttpRequests(
                        req -> req.requestMatchers("/users").authenticated() // register ..
                                .requestMatchers("/user/*").hasAnyRole("ADMIN")
                                .anyRequest()
                                .permitAll()
                                .and()
                                .addFilterAfter(jwtFilter, UsernamePasswordAuthenticationFilter.class)
                )
                .build();
    }

}

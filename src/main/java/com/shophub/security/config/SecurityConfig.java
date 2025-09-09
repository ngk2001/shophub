package com.shophub.security.config;


import org.springframework.context.annotation.*;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.shophub.service.EmployeeUserDetailsService;

@Configuration
public class SecurityConfig{

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      return  http
       
              .authorizeHttpRequests(auth -> auth
              .requestMatchers("/shophub").permitAll()
              .requestMatchers("/shophub/manager/**").hasRole("MANAGER")
              .requestMatchers("/shophub/product/**").hasAnyRole("MANAGER","EMPLOYEE")
              .anyRequest().authenticated())
              .httpBasic(Customizer.withDefaults())
             .build();
      }
   

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

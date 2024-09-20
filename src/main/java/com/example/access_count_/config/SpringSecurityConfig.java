package com.example.access_count_.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.net.PasswordAuthentication;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public PasswordEncoder passEncoder(){
        return new BCryptPasswordEncoder();
    }
}

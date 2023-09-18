package com.example.urlHitCounter.repository;

import com.example.urlHitCounter.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> getUserList() {
        return new ArrayList<>();
    }
}

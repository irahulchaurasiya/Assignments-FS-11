package com.example.restaurantModel.repository;

import com.example.restaurantModel.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<Restaurant> getRestaurantList() {

        List<Restaurant> restaurantList = new ArrayList<>();
        return restaurantList;

    }

}

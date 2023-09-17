package com.example.restaurantModel.repository;

import com.example.restaurantModel.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    private List<Restaurant> restaurantList = new ArrayList<>();

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }
}

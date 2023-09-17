package com.example.restaurantModel.service;

import com.example.restaurantModel.entity.Restaurant;
import com.example.restaurantModel.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.getRestaurantList();
    }

    public Object getRestaurantById(Integer id) {
        List<Restaurant> restaurantList =  getAllRestaurants();
        for(Restaurant restaurant : restaurantList)
        {
            if (restaurant.getRestaurantID().equals(id))
            {
                return restaurant;
            }
        }
        return "Restaurant "+ id +" not found";
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> restaurantList =  getAllRestaurants();
        restaurantList.addAll(restaurants);
        return restaurants.size() + " Restaurants Added!!!";
    }

    public String addRestaurant(Restaurant restaurant) {
        List<Restaurant> restaurantList =  getAllRestaurants();
        restaurantList.add(restaurant);
        return "Restaurant Added!!!";
    }

    public String updateRestaurant(Integer id, Restaurant restaurant) {
        List<Restaurant> restaurantList =  getAllRestaurants();
        for(Restaurant restaurant1 : restaurantList)
        {
            if (restaurant1.getRestaurantID().equals(id))
            {
                restaurant1.setRestaurantSpeciality(restaurant.getRestaurantSpeciality());
                restaurant1.setRestaurantRating(restaurant.getRestaurantRating());
                return "Restaurant " + id + " updated!!!";
            }
        }
        return "Restaurant "+ id +" not found";
    }

    public String deleteRestaurant(Integer id) {
        List<Restaurant> restaurantList =  getAllRestaurants();
        for(Restaurant restaurant : restaurantList)
        {
            if (restaurant.getRestaurantID().equals(id))
            {
                restaurantList.remove(restaurant);
                return "Restaurant "+ id +" Deleted!!!";
            }
        }
        return "Restaurant "+ id +" not found";
    }
}

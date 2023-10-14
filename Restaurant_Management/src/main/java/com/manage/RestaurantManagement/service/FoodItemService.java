package com.manage.RestaurantManagement.service;

import com.manage.RestaurantManagement.model.FoodItem;
import com.manage.RestaurantManagement.repo.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

    @Autowired
    IFoodItemRepo foodItemRepo;
    public void addFoodItem(FoodItem foodItem) {
        foodItemRepo.save(foodItem);
    }

    public void deleteFoodItem(FoodItem foodItemId) {
        foodItemRepo.delete(foodItemId);
    }

    public Object getAllFoodItems() {
        return foodItemRepo.findAll();
    }
}

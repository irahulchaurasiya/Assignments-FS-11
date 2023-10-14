package com.manage.RestaurantManagement.service;

import com.manage.RestaurantManagement.repo.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

    @Autowired
    IFoodItemRepo foodItemRepo;

    public Object getAllFoodItemForVisitor() {
        List<String> foodItemTitles = foodItemRepo.getAllFoodItemTitles();
        return foodItemTitles;
    }
}

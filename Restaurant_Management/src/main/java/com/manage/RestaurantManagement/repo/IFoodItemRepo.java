package com.manage.RestaurantManagement.repo;

import com.manage.RestaurantManagement.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IFoodItemRepo extends JpaRepository<FoodItem , Long>{

    @Query("SELECT foodItemTitle FROM FoodItem")
    List<String> getAllFoodItemTitles();
}

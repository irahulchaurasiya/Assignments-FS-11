package com.manage.RestaurantManagement.controller;

import com.manage.RestaurantManagement.model.Admin;
import com.manage.RestaurantManagement.model.FoodItem;
import com.manage.RestaurantManagement.model.User;
import com.manage.RestaurantManagement.model.dto.AdminSignInInput;
import com.manage.RestaurantManagement.model.dto.SignInInput;
import com.manage.RestaurantManagement.model.dto.SignUpOutput;
import com.manage.RestaurantManagement.service.AdminAuthenticationService;
import com.manage.RestaurantManagement.service.AdminService;
import com.manage.RestaurantManagement.service.FoodItemService;
import com.manage.RestaurantManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    FoodItemService foodItemService;

    @Autowired
    AdminService adminService;

    @Autowired
    AdminAuthenticationService adminAuthenticationService;

    @GetMapping("Users")
    Object getAllUsers(@RequestParam String email, @RequestParam String token) throws Exception {

        if(adminAuthenticationService.authenticate(email,token)) {
            return userService.getAllUsers();
        }
        else
        {
            return "Function not available for Un-Authenticated Person!!!";
        }
    }


    @PostMapping("Admin/signup")
    public SignUpOutput signUpAdmin(@RequestBody @Valid Admin admin)
    {

        return adminService.signUpAdmin(admin);
    }

    @PostMapping("Admin/signIn")
    public String signInAdmin(@RequestBody @Valid AdminSignInInput adminSignInInput)
    {
        return adminService.signInAdmin(adminSignInInput);
    }

    @DeleteMapping("Admin/signOut")
    public String signOutAdmin(@RequestParam String email, @RequestParam String token)
    {
        if(adminAuthenticationService.authenticate(email,token)) {
            return adminService.signOutAdmin(email);
        }
        else {
            return "Sign out not allowed for non authenticated Admin.";
        }

    }

    @PostMapping("addFoodItem")
    public String addFoodItem(@RequestBody @Valid FoodItem foodItem ,@RequestParam String email ,@RequestParam String token)
    {
        if(adminAuthenticationService.authenticate(email,token)) {
            foodItemService.addFoodItem(foodItem);
            return "Food Item Added Successfully";
        }
        else
        {
            return "Adding of food item failed because invalid authentication";
        }
    }

    @DeleteMapping("deleteFoodItem")
    public String  deleteFoodItem(@RequestParam FoodItem foodItemId,@RequestParam String email, @RequestParam String token)
    {

        if(adminAuthenticationService.authenticate(email,token)) {
            foodItemService.deleteFoodItem(foodItemId);
            return "Food Item deleted Successfully";
        }
        else
        {
            return "Deleting of food item failed because invalid authentication";
        }
    }

    @GetMapping("getAllFoodItems")
    Object getAllFoodItems(@RequestParam String email, @RequestParam String token) throws Exception {

        if(adminAuthenticationService.authenticate(email,token)) {
            return foodItemService.getAllFoodItems();
        }
        else
        {
            return "Function not available for Un-Authenticated Person!!!";
        }
    }

}
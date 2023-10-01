package com.Ecommerce.eCommerce.controller;

import com.Ecommerce.eCommerce.model.User;
import com.Ecommerce.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @GetMapping("user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
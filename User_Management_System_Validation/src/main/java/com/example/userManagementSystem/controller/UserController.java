package com.example.userManagementSystem.controller;

import com.example.userManagementSystem.model.User;
import com.example.userManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user/add")
    public String addUser(@RequestBody @Valid User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("user/getAll")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("user/{id}")
    public Object getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }

    @PutMapping("user/update/{id}")
    public String updateUserById(@PathVariable Long id , @RequestBody @Valid User user)
    {
        return userService.updateUserById(id,user);
    }

    @DeleteMapping("user/delete/{id}")
    public String deleteUserById(@PathVariable Long id)
    {
        return userService.deleteUserById(id);
    }
}

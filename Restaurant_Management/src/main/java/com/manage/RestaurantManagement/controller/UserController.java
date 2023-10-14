package com.manage.RestaurantManagement.controller;

import com.manage.RestaurantManagement.model.Order;
import com.manage.RestaurantManagement.model.User;
import com.manage.RestaurantManagement.model.dto.SignInInput;
import com.manage.RestaurantManagement.model.dto.SignUpOutput;
import com.manage.RestaurantManagement.service.AuthenticationService;
import com.manage.RestaurantManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;



    @PostMapping("User/signup")
    public SignUpOutput signUpUser(@RequestBody User user)
    {

        return userService.signUpUser(user);
    }

    @PostMapping("User/signIn")
    public String signInUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("User/signOut")
    public String signOutUser(String email, String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.signOutUser(email);
        }
        else {
            return "Sign out not allowed for non authenticated user.";
        }

    }

    @PostMapping("order/place")
    public String orders(@RequestBody @Valid Order order ,String email ,String token)
    {
        if(authenticationService.authenticate(email,token)) {
            boolean status = userService.giveOrder(order);
            return status ? "Order Successfully":"error occurred during placing Order";
        }
        else
        {
            return "Placing of Order failed because invalid authentication";
        }
    }

    @DeleteMapping("order/cancel")
    public String  cancelOrder(String email, String token)
    {

        if(authenticationService.authenticate(email,token)) {
            userService.cancelOrder(email);
            return "Order canceled successfully";
        }
        else
        {
            return "Cancelling failed because invalid authentication";
        }
    }

}

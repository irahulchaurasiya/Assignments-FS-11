package com.manage.RestaurantManagement.controller;

import com.manage.RestaurantManagement.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {

    @Autowired
    VisitorService visitorService;

    @GetMapping("visitor")
    Object getAllFoodItemForVisitor()
    {
        return visitorService.getAllFoodItemForVisitor();
    }
}

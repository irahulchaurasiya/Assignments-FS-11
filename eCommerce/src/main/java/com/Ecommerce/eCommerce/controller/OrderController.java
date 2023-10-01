package com.Ecommerce.eCommerce.controller;

import com.Ecommerce.eCommerce.model.OrdersEntity;
import com.Ecommerce.eCommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public void addOrder (@RequestBody OrdersEntity ordersEntity){
        orderService.addOrder(ordersEntity);
    }

    @GetMapping("order/{Id}")
    public Optional<OrdersEntity> getOrder(@PathVariable Integer Id){
        return orderService.getOrderById(Id);
    }
}
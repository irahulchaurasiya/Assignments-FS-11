package com.manage.RestaurantManagement.service;

import com.manage.RestaurantManagement.model.Order;
import com.manage.RestaurantManagement.model.User;
import com.manage.RestaurantManagement.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;
    public void saveOrder(Order order) {
        order.setOrderCreationTime(LocalDateTime.now());
        orderRepo.save(order);
    }

    public Order getOrderForUser(User user) {
        return orderRepo.findFirstByUser(user);
    }

    public void cancelOrder(Order order) {
        orderRepo.delete(order);
    }
}

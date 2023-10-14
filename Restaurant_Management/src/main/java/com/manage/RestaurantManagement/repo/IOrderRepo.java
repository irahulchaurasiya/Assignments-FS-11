package com.manage.RestaurantManagement.repo;

import com.manage.RestaurantManagement.model.Order;
import com.manage.RestaurantManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order , Long> {
    Order findFirstByUser(User user);
}

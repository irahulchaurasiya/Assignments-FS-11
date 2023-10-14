package com.manage.RestaurantManagement.repo;

import com.manage.RestaurantManagement.model.AuthenticationToken;
import com.manage.RestaurantManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthTokenRepository extends JpaRepository<AuthenticationToken , Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}

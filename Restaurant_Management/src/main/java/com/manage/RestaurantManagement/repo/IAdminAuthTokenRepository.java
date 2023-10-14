package com.manage.RestaurantManagement.repo;

import com.manage.RestaurantManagement.model.Admin;
import com.manage.RestaurantManagement.model.AdminAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminAuthTokenRepository extends JpaRepository<AdminAuthenticationToken , Long> {
    AdminAuthenticationToken findFirstByTokenValue(String authTokenValue);

    AdminAuthenticationToken findFirstByAdmin(Admin admin);
}

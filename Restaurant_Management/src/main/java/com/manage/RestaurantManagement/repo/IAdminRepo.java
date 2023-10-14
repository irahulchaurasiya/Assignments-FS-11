package com.manage.RestaurantManagement.repo;

import com.manage.RestaurantManagement.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin , Long> {
    Admin findFirstByAdminEmail(String newEmail);
}
